package com.advantech.powermanagement.todo.todo;

import com.advantech.powermanagement.todo.PowerConsumption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PowerConsumptionRepository
        extends JpaRepository<PowerConsumption, Integer> {

}
