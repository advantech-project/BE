package com.advantech.powermanagement.todo;

import com.advantech.powermanagement.todo.todo.PowerConsumptionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PowerConsumptionJpaResource {
    private PowerConsumptionRepository powerConsumptionReository;
    public PowerConsumptionJpaResource(PowerConsumptionRepository todoRepository){
        this.powerConsumptionReository = todoRepository;
    }
    @GetMapping("/test-power")
    public PowerConsumption getPowerConsumption() {
        return powerConsumptionReository.findById(1).get();
    }
}
