package org.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPro {
	
	
	@DataProvider(name = "SampleData")
	
	private Object data() {
		return new Object[][] {
			{"Sample1", "new Pro1"},
			{"Sample2", "new Pro2"},
			{"Sample3", "new Pro3"}
		};

	}
	
	@Test (dataProvider = "SampleData")
	private void tc1(String s1, String s2) {
		System.out.println("Key"+s1);
		System.out.println("value"+s2);

	}
	

}
