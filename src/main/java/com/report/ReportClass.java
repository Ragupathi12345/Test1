package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {
	
	public static void jvmReport1(String json) {
		
		File f=new File("Report\\Jvmreport");
		
		Configuration con=new Configuration(f, "Fbapplication");
		con.addClassifications("browser","chrome");
		
		List<String> li=new ArrayList<String>();
		
		li.add(json);
		ReportBuilder r=new ReportBuilder(li, con);
		r.generateReports();
		
		
		

	}

}
