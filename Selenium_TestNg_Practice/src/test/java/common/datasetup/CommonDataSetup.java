package common.datasetup;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {
	
	@BeforeSuite
	public void dataSetUp() {
		System.out.println("common data setup");
	}
	
	@AfterSuite
	public void dataTeardown() {
		System.out.println("common data tear down");
		
	}

}
