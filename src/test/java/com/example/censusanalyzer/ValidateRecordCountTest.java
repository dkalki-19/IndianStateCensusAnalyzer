package com.example.censusanalyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ValidateRecordCountTest {

	@Test
    public void givenStateCodeCSV_WhenCorrect_ShouldReturnCorrectRecords() throws Exception {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        int count = analyser.loadStateCode("./IndianStateCode.csv");
        assertEquals(37, count); // Use your actual number from CSV
    }
	
	@Test
	public void givenIncorrectStateCodeFile_ShouldThrowException() {
	    StateCensusAnalyser analyser = new StateCensusAnalyser();
	    assertThrows(CensusException.class,
	            () -> analyser.loadStateCode("./wrong-file.csv"));
	}
	
	@Test
	public void givenWrongFileType_ShouldThrowInvalidTypeException() {
	    StateCensusAnalyser analyser = new StateCensusAnalyser();
	    assertThrows(CensusException.class,
	            () -> analyser.loadStateCode("./StateCode.txt"));
	}
	
	@Test
	public void givenCSVWithWrongDelimiter_ShouldThrowException() {
	    StateCensusAnalyser analyser = new StateCensusAnalyser();
	    assertThrows(CensusException.class,
	            () -> analyser.loadStateCode("./WrongDelimiterStateCode.csv"));
	}

	@Test
	public void givenCSVWithIncorrectHeader_ShouldThrowException() {
	    StateCensusAnalyser analyser = new StateCensusAnalyser();
	    assertThrows(CensusException.class,
	            () -> analyser.loadStateCode("./WrongHeaderStateCode.csv"));
	}

}

