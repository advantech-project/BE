package com.advantech.powermanagement.power.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PowerConsumptionRepository
        extends JpaRepository<PowerConsumption, Double> {
    @Query("SELECT p1 " +
            "FROM PowerConsumption p1 " +
            "WHERE p1.building = :building AND p1.timestamp = " +
            "(SELECT MAX(p2.timestamp) " +
            "FROM PowerConsumption p2 " +
            "WHERE p2.building = :building)")
    PowerConsumption findMaxTimeStampByBuilding(@Param("building") String building);
    @Query("SELECT p1 " +
            "FROM PowerConsumption p1 " +
            "WHERE p1.timestamp = :timestamp and p1.building = :building")
    PowerConsumption findByTimeStamp(@Param("timestamp") Integer timeStamp,
                                        @Param("building") String building);
}
