package com.example.censusanalyzer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StateCensusAnalyzerTest {
	
	@Test
	public void givenStateCensusCSV_WhenCorrect_ReturnsCorrectRecords() throws Exception {
	    StateCensusAnalyser analyser = new StateCensusAnalyser();
	    int count = analyser.loadStateCensus("./IndianStateCensusData.csv");
	    assertEquals(29, count);  // Use your actual CSV count
	}

	
	@Test
	public void givenIncorrectFile_ShouldThrow_FileNotFoundException() {
	    StateCensusAnalyser analyser = new StateCensusAnalyser();
	    assertThrows(CensusException.class, 
	        () -> analyser.loadStateCensus("./wrong-file.csv"));
	}
	
	@Test
	public void givenIncorrectFileType_ShouldThrow_InvalidTypeException() {
	    StateCensusAnalyser analyser = new StateCensusAnalyser();
	    assertThrows(CensusException.class, 
	        () -> analyser.loadStateCensus("./StateCensus.txt"));
	}

	@Test
	public void givenCSVWithIncorrectDelimiter_ShouldThrow_Exception() {
	    StateCensusAnalyser analyser = new StateCensusAnalyser();
	    assertThrows(CensusException.class,
	        () -> analyser.loadStateCensus("./DelimiterWrong.csv"));
	}

	@Test
	public void givenCSVWithIncorrectHeader_ShouldThrow_Exception() {
	    StateCensusAnalyser analyser = new StateCensusAnalyser();
	    assertThrows(CensusException.class,
	        () -> analyser.loadStateCensus("./WrongHeader.csv"));
	}

}
