package com.advantech.powermanagement.power;

import com.advantech.powermanagement.power.data.PowerConsumption;
import com.advantech.powermanagement.power.data.PowerConsumptionRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;

@Service
public class PowerConsumptionService {

    private PowerConsumptionRepository powerConsumptionReository;
    public PowerConsumptionService(PowerConsumptionRepository todoRepository){
        this.powerConsumptionReository = todoRepository;
    }

    public PowerConsumption findCurrentPowerConsumption(String building){
        return powerConsumptionReository.findMaxTimeStampByBuilding(building);
    }

}
