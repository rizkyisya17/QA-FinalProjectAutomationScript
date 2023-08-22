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

WebUI.click(findTestObject('Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/button_Buat Akun'))

WebUI.click(findTestObject('Object Repository/Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Nama_name'))

WebUI.click(findTestObject('Object Repository/Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Tanggal lahir_birth_date'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/button_select_year'), 
    '2016', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/button_select_months'), 
    '11', true)

WebUI.click(findTestObject('Object Repository/Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/button_date above 31 dec 2016'))

WebUI.delay(5)

WebUI.closeBrowser()

