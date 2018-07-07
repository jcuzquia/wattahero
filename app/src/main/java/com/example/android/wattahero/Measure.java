package com.example.android.wattahero;

import java.util.Date;

/**
 * The class {@link Measure} represents the measure that is being implemented
 * <p>
 * Each project can have multiple measures. However, each measure can only have
 * one project
 */
public class Measure {

    private String measureName;

    /**
     * Constructor of the {@link Measure} object.
     * @param measureName
     */
    public Measure(String measureName) {
        this.measureName = measureName;
    }

    public String getMeasureName() {
        return measureName;
    }

    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }
}
