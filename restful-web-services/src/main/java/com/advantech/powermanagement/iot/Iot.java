package com.advantech.powermanagement.iot;


public class Iot {
    private Integer id;
    private String status;

    public Iot(Integer id, String status) {
        this.status = status;
        this.id = id;
    }

    public Iot() {
    }

    public Integer getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
