import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Customer registration from HB/input_firstName'))

WebUI.setText(findTestObject('Customer registration from HB/input_firstName'), 'test2')

WebUI.setText(findTestObject('Customer registration from HB/input_lastName'), 'User')

WebUI.focus(findTestObject('Customer registration from HB/div_Epostadress'))

String Mail = CustomKeywords.'randomEmail.getEmail'('testing', 'testing.test')

WebUI.sendKeys(findTestObject('Page_Login/input_email_create'), Mail)

WebUI.setText(findTestObject('Customer registration from HB/input_password'), 'Test1234')

WebUI.sendKeys(findTestObject('Customer registration from HB/input_confirmPassword'), 'Test1234')

WebUI.waitForElementVisible(findTestObject('Submit Register - Button click/a_Registrera dig'), 30)

WebUI.click(findTestObject('Customer registration from HB/a_Registrera dig'))

WebUI.acceptAlert()

