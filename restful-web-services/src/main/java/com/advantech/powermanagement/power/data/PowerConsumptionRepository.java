package com.advantech.powermanagement.power.data;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface PowerConsumptionRepository
        extends JpaRepository<PowerConsumption, Double> {


    @Query(value =
            "SELECT * FROM my_schema.power_usage " +
                    "WHERE \"Building\" = :building " +
                    "ORDER BY \"DateTime\" DESC " +
                    "LIMIT 1", nativeQuery = true)
    PowerConsumption findMaxTimeStampByBuilding(@Param("building") String building);
}
