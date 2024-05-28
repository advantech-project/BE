package com.advantech.powermanagement.power;

import com.advantech.powermanagement.power.data.PowerConsumption;
import com.advantech.powermanagement.power.data.PowerConsumptionRepository;
import org.springframework.stereotype.Service;

@Service
public class PowerConsumptionService {
    private PowerConsumptionRepository powerConsumptionReository;
    public PowerConsumptionService(PowerConsumptionRepository todoRepository){
        this.powerConsumptionReository = todoRepository;
    }

    public PowerConsumption findCurrentPowerConsumption(String building){
        PowerConsumption powerConsumption =
                powerConsumptionReository.findMaxTimeStampByBuilding(building);
        PowerConsumption tmp
                = powerConsumptionReository
                .findByTimeStamp(powerConsumption.getTimestamp() - 600, building);
        powerConsumption
                .setDatavalue(powerConsumption.getDatavalue() - tmp.getDatavalue());
        return powerConsumption;
    }

}
