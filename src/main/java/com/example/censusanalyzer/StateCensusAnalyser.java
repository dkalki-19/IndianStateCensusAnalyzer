package com.example.censusanalyzer;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;

public class StateCensusAnalyser {

    public int loadStateCensus(String csvFilePath) throws CensusException {

        if (!csvFilePath.endsWith(".csv")) {
            throw new CensusException("Invalid File Type", 
                CensusException.ExceptionType.INVALID_FILE_TYPE);
        }

        try (Reader reader = new FileReader(csvFilePath)) {
            CsvToBean<CSVStateCensus> csvToBean = new CsvToBeanBuilder<CSVStateCensus>(reader)
                    .withType(CSVStateCensus.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<CSVStateCensus> iterator = csvToBean.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                iterator.next();
                count++;
            }
            return count;

        } catch (Exception e) {
            throw new CensusException("Unable to parse CSV", 
                CensusException.ExceptionType.PARSE_ERROR);
        }
    }
    
    public int loadStateCode(String csvFilePath) throws CensusException {

        if (!csvFilePath.endsWith(".csv")) {
            throw new CensusException("Invalid File Type",
                    CensusException.ExceptionType.INVALID_FILE_TYPE);
        }

        try (Reader reader = new FileReader(csvFilePath)) {

            CsvToBean<CSVStateCode> csvToBean = new CsvToBeanBuilder<CSVStateCode>(reader)
                    .withType(CSVStateCode.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<CSVStateCode> iterator = csvToBean.iterator();
            int count = 0;

            while (iterator.hasNext()) {
                iterator.next();
                count++;
            }

            return count;

        } catch (Exception e) {
            throw new CensusException("Unable to parse State Code CSV",
                    CensusException.ExceptionType.PARSE_ERROR);
        }
    }

    
    
}
