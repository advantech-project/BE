package com.advantech.powermanagement.iot;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IotController {
    private IotConfig iotConfig;
    private IotController(IotConfig iotConfig){
        this.iotConfig = iotConfig;
    }
    @PostMapping("/iot/turn")
    // 1,2,3,4 smart plug
    // 5 fan
    public Iot iotTurn(@RequestBody Iot iot){
        Iot result;
        try{
            if (iot.getId() != 5) {
                WebClient webClient = WebClient.builder().build();
                result = webClient.post()
                        .uri(iotConfig.getPlug())
                        .bodyValue(iot)
                        .retrieve()
                        .bodyToMono(Iot.class)
                        .block();

            }
            else {
                WebClient webClient = WebClient.builder().build();
                result = webClient.get()
                        .uri(iotConfig.getFan() + "/control")
                        .retrieve()
                        .bodyToMono(Iot.class)
                        .block();
            }
            return result;
        }
        catch(Exception e){
            iot.setStatus("error");
            return iot;
        }
    }

    @GetMapping("/iots")
    public List<Iot> getAllIotInfo(){
        List<Iot> except = new ArrayList<>();
        try{
            WebClient webClient = WebClient.builder().build();
            List<Iot> result = webClient.get()
                    .uri(iotConfig.getPlug())
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<List<Iot>>() {})
                    .block();

            webClient = WebClient.builder().build();
            Iot result2 = webClient.get()
                    .uri(iotConfig.getFan() + "/status")
                    .retrieve()
                    .bodyToMono(Iot.class)
                    .block();

            for(int i = 0; i < result.size(); i++)
                System.out.println(result.get(i).toString());

            result.add(result2);
            return result;
        }
        catch(Exception e){
            System.out.println("hi " + e.toString());
            return except;
        }
    }

}

