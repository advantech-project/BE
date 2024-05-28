package com.advantech.powermanagement.power;

import com.advantech.powermanagement.power.data.PowerConsumption;
import com.advantech.powermanagement.power.data.PowerConsumptionRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class PowerConsumptionJpaResource {
    private PowerConsumptionService powerConsumptionService;
    public PowerConsumptionJpaResource(PowerConsumptionService powerConsumptionService){
        this.powerConsumptionService = powerConsumptionService;
    }
    @GetMapping("/test-power")
    public PowerConsumption getPowerConsumption() {
        return powerConsumptionService.findCurrentPowerConsumption("서호관");
    }
}
