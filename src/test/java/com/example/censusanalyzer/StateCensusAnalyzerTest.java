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

}
