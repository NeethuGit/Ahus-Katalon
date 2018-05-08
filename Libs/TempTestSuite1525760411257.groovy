import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Customer Portal')

suiteProperties.put('name', 'Customer Portal')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\Ahus-Katalon-Git\\Reports\\Customer Portal\\20180508_115011\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Customer Portal', suiteProperties, [new TestCaseBinding('Test Cases/Clear cache', 'Test Cases/Clear cache',  null), new TestCaseBinding('Test Cases/Start page', 'Test Cases/Start page',  null), new TestCaseBinding('Test Cases/Customer-Login', 'Test Cases/Customer-Login',  null), new TestCaseBinding('Test Cases/Move to Start Page', 'Test Cases/Move to Start Page',  null), new TestCaseBinding('Test Cases/Municipality dropdown field-start page', 'Test Cases/Municipality dropdown field-start page',  null), new TestCaseBinding('Test Cases/Select Municiplality from Start page', 'Test Cases/Select Municiplality from Start page',  null), new TestCaseBinding('Test Cases/Select House From House Listing Page - HB', 'Test Cases/Select House From House Listing Page - HB',  null), new TestCaseBinding('Test Cases/Make Changes in Configuration - Customer', 'Test Cases/Make Changes in Configuration - Customer',  null), new TestCaseBinding('Test Cases/Save Configuration', 'Test Cases/Save Configuration',  null)])
