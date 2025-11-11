package com.example.censusanalyzer;

import com.opencsv.bean.CsvBindByName;

public class CSVStateCode {

    @CsvBindByName(column = "SrNo")
    private int srNo;

    @CsvBindByName(column = "State Name")
    private String stateName;

    @CsvBindByName(column = "TIN")
    private int tin;

    @CsvBindByName(column = "StateCode")
    private String stateCode;

    public int getSrNo() { return srNo; }
    public String getStateName() { return stateName; }
    public int getTin() { return tin; }
    public String getStateCode() { return stateCode; }
}
