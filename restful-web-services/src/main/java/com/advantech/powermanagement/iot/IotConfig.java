package com.advantech.powermanagement.iot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "iot.api.endpoint")
public class IotConfig {
    private String fan;
    private String plug;
    private String getAllStatus;


    public String getFan() {
        return fan;
    }

    public String getPlug() {
        return plug;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public void setPlug(String plug) {
        this.plug = plug;
    }
}
