package com.advantech.powermanagement.power;

import com.advantech.powermanagement.power.data.PowerConsumption;
import org.springframework.web.bind.annotation.*;

@RestController
public class PowerConsumptionController {
    private PowerConsumptionService powerConsumptionService;
    public PowerConsumptionController(PowerConsumptionService powerConsumptionService){
        this.powerConsumptionService = powerConsumptionService;
    }
    @GetMapping("/{building}/power-usage")
    public PowerConsumption getPowerConsumption() {
        return powerConsumptionService.findCurrentPowerConsumption("서호관");
    }
}

/*
       {
            current_consumption: 123213,
            expected_consupmtion: 123123
       }
 */