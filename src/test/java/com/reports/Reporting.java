package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
/**
 * 
 * @author CHANDIRAN
 * @Description Generates Reporting
 * @Date 08-July-2022
 *
 */

public class Reporting {
	/**
	 * 
	 * @param jsonfile
	 */
	public static void generateJVMReport(String jsonfile) {
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\OMRBranchAdactinAutomation\\target");
		Configuration configuration = new Configuration(file, "OMRBranchAdactinAutomation");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "101");
		configuration.addClassifications("OS", "WIN10");
		List<String>jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		ReportBuilder reportBuilder = new ReportBuilder(jsonfiles, configuration);
		reportBuilder.generateReports();
	}
}
