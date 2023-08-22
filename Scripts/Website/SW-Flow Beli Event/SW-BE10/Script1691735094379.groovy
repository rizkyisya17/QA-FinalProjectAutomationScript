import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://demo-app.online/')

'Maximize current window'
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE10/Page_Be a Profressional Talent with Coding.ID/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE10/Page_Masuk untuk dapatkan akses di Coding.ID/input_Email_email'), 
    'pehova5882@viperace.com')

WebUI.setText(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE10/Page_Masuk untuk dapatkan akses di Coding.ID/input_Kata                                 _98da12'), 
    'password')

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE10/Page_Masuk untuk dapatkan akses di Coding.ID/button_Login'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE10/Page_Be a Profressional Talent with Coding.ID/a'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE10/Page_Be a Profressional Talent with Coding.ID/a_My Account'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE10/Page_Coding.ID - Dashboard/span_Invoice'))

WebUI.verifyElementText(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE10/Page_Coding.ID - Dashboard/td_No data available in table'), 
    'No data available in table')

WebUI.takeScreenshot()

WebUI.closeBrowser()

