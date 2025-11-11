package com.example.censusanalyzer;

import com.opencsv.bean.CsvBindByName;

public class CSVStateCensus {

    @CsvBindByName(column = "State")
    private String state;

    @CsvBindByName(column = "Population")
    private long population;

    @CsvBindByName(column = "AreaInSqKm")
    private double areaInSqKm;

    @CsvBindByName(column = "DensityPerSqKm")
    private double densityPerSqKm;

    public String getState() { return state; }
    public long getPopulation() { return population; }
    public double getAreaInSqKm() { return areaInSqKm; }
    public double getDensityPerSqKm() { return densityPerSqKm; }
}

