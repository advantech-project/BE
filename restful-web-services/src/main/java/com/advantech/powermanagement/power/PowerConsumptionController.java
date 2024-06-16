package com.advantech.powermanagement.power;

import com.advantech.powermanagement.power.data.PowerConsumption;
import org.springframework.web.bind.annotation.*;

@RestController
public class PowerConsumptionController {
    private String[] buildings;
    private PowerConsumptionService powerConsumptionService;
    public PowerConsumptionController(PowerConsumptionService powerConsumptionService){
        this.powerConsumptionService = powerConsumptionService;

        buildings = new String[15];
        buildings[1] = "5호동관";
        buildings[2] = "5호북관";
        buildings[3] = "5호남관";
        buildings[4] = "60주년기념관";
        buildings[5] = "하이테크센터";
        buildings[6] = "1호관(본관)";
        buildings[7] = "2호북관";
        buildings[8] = "2호남관/4호관";
        buildings[9] = "서호관";
        buildings[10] = "인하드림센터 2/3관";
        buildings[11] = "9호관/평생교육관";
        buildings[12] = "7호관(학생회관)";
        buildings[13] = "로스쿨관";
        buildings[14] = "김현태인하드림센터";

    }

    @GetMapping("/{building_id}/power-usage")
    public PowerConsumption getPowerConsumption(@PathVariable int building_id) {
        System.out.println();
        return powerConsumptionService.findCurrentPowerConsumption(buildings[building_id]);
    }
}

/*
       {
            current_consumption: 123213,
            expected_consupmtion: 123123
       }
 */