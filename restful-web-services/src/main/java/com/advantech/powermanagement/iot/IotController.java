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
    public Iot iotTurn(@RequestBody Iot iot){
        Iot result;
        try{
            WebClient webClient = WebClient.builder().build();
            result = webClient.post()
                    .uri(iotConfig.getPlug())
                    .bodyValue(iot)
                    .retrieve()
                    .bodyToMono(Iot.class)
                    .block();
            return result;
        }
        catch(Exception e){
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
            for(int i = 0; i < result.size(); i++)
                System.out.println(result.get(i).toString());
            return result;
        }
        catch(Exception e){
            System.out.println("hi " + e.toString());
            return except;
        }
    }

}

