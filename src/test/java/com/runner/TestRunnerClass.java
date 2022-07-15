package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.reports.Reporting;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(strict = true,dryRun = false,snippets = SnippetType.CAMELCASE,
plugin = {"pretty","json:target\\output1.json"},monochrome = true,features = {"src\\test\\resources\\Features"},
glue = {"com.stepdefinition"})

/**
 * 
 * @author CHANDIRAN
 * @Description Generate TestRunClass
 * @Date 08-July-2022
 *
 */
public class TestRunnerClass {
	/**
	 * 
	 */

	@AfterClass
	public static void afterClass() {

		Reporting.generateJVMReport("C:\\Users\\DELL\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\output1.json");

	}

}
