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

WebUI.setText(findTestObject('Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Nama_name'), GlobalVariable.nama_iqbal)

WebUI.setText(findTestObject('Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Tanggal lahir_birth_date'), 
    GlobalVariable.tgl_lhir)

WebUI.setText(findTestObject('Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/input_E-Mail_email'), 'sk9d8b7u6@kzccv.com')

WebUI.setText(findTestObject('Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Whatsapp_whatsapp'), '0217521577')

WebUI.setText(findTestObject('Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Kata Sandi_password'), 
    GlobalVariable.iqbal_pass)

WebUI.setText(findTestObject('Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Konfirmasi kata sandi_password_confirmation'), 
    GlobalVariable.iqbal_pass)

WebUI.click(findTestObject('Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Konfirmasi checkbox terms_and_condition'))

WebUI.click(findTestObject('Web - Register/Page_Buat akun dan dapatkan akses di Coding.ID/button_Daftar'))

WebUI.delay(5)

WebUI.closeBrowser()

