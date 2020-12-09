package com.demo.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

//@CucumberOptions(plugin = { "json:target/cucumber.json", "pretty",
//		"html:target/cucumber-reports" })
public class TestRunner {

	Results results = null;
	
	@Test
	public void startTest() {
		results = Runner.path("src/test/java").tags("~@ignore").parallel(5);
//		generateReport(results.getReportDir());
//		assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
	}
	

	public void generateReport(String karateOutputPath) {
		File reportOutputDirectory = new File("target");
		List<String> list = new ArrayList<>();
		list.add("target/cucumber.json");
		Configuration config = new Configuration(reportOutputDirectory, "Presence-API");
		ReportBuilder reportBuilder = new ReportBuilder(list, config);
		reportBuilder.generateReports();
	}

}
