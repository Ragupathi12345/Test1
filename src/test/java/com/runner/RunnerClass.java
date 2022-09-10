package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.ReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature",glue = "com.step",dryRun = false,monochrome = true,tags = "@smoke",
plugin = {"json:Report\\output.json","rerun:Rerun\\rerun.txt"})

public class RunnerClass {
	
	  @AfterClass
	 
	 public static void jvmReport2() {
	 
	 ReportClass.jvmReport1("Report\\\\output.json");
	 
	 
	  
	 }
	 
}
