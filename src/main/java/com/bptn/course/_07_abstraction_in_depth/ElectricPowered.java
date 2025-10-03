package com.bptn.course._07_abstraction_in_depth;

public interface ElectricPowered {
    void charge(double kWh);
    double getBatteryLevel();
}