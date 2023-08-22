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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demo-app.online/')

WebUI.click(findTestObject('Object Repository/Web - Change Profile/Page_Be a Profressional Talent with Coding.ID/Button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Web - Change Profile/Page_Masuk untuk dapatkan akses di Coding.ID/input_Email_email'), 
    'iqbalm213@gmail.com')

WebUI.setText(findTestObject('Object Repository/Web - Change Profile/Page_Masuk untuk dapatkan akses di Coding.ID/input_Kata                                 _98da12'), 
    GlobalVariable.iqbal_pass)

WebUI.click(findTestObject('Object Repository/Web - Change Profile/Page_Masuk untuk dapatkan akses di Coding.ID/button_Login'))

WebUI.click(findTestObject('Object Repository/Web - Change Profile/Page_Be a Profressional Talent with Coding.ID/Dropdown_goes_to_Profile'))

WebUI.click(findTestObject('Object Repository/Web - Change Profile/Page_Be a Profressional Talent with Coding.ID/a_My Account'))

WebUI.click(findTestObject('Object Repository/Web - Change Profile/Page_Coding.ID - Dashboard/span_Profil'))

WebUI.click(findTestObject('Object Repository/Web - Change Profile/Page_Coding.ID - Dashboard/a_Edit Profile'))

WebUI.setText(findTestObject('Web - Change Profile/Page_Coding.ID - Dashboard/input_BirthDay_birth_date'), '06aug2019')

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

