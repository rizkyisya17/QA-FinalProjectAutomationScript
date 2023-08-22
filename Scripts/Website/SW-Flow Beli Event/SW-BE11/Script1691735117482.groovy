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

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE11/Page_Be a Profressional Talent with Coding.ID/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE11/Page_Masuk untuk dapatkan akses di Coding.ID/input_Email_email'), 
    GlobalVariable.isya_katalon_email)

WebUI.setText(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE11/Page_Masuk untuk dapatkan akses di Coding.ID/input_Kata                                 _98da12'), 
    GlobalVariable.isya_katalon_password)

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE11/Page_Masuk untuk dapatkan akses di Coding.ID/button_Login'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE11/Page_Be a Profressional Talent with Coding.ID/a_Events'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE11/Page_Online event bersertifikat dari prakti_f42b96/div_Day 2 Data Wrangling with Python       _d4413c'))

WebUI.verifyTextPresent('PENDAFTARAN DITUTUP', true)

WebUI.takeScreenshot()

WebUI.closeBrowser()

