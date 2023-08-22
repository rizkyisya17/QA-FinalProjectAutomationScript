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

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Be a Profressional Talent with Coding.ID/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Masuk untuk dapatkan akses di Coding.ID/input_Email_email'), 
    'vasif72009@weishu8.com')

WebUI.setText(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Masuk untuk dapatkan akses di Coding.ID/input_Kata                                 _98da12'), 
    'password')

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Masuk untuk dapatkan akses di Coding.ID/button_Login'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Be a Profressional Talent with Coding.ID/a_Events'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Online event bersertifikat dari prakti_f42b96/div_Day 3 Predict using Machine Learning   _e04a14'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Day 3 Predict using Machine Learning - Ziyad/a_Beli Tiket'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Day 3 Predict using Machine Learning - Ziyad/a_Lihat                Pembelian Saya'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Coding.ID - Cart/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Coding.ID - Cart/input_Total Pembayaran_payment_method'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Coding.ID - Cart/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Coding.ID - Cart/a_Bank transfer1'))

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Coding.ID - Cart/div_BNI'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Coding.ID - Cart/button_Back to merchant'))

WebUI.getText(findTestObject('Web - Flow Beli Event/SW-BE01/Page_Coding.ID - Invoice/h5_Invoice                            EVN10_1958af'))

WebUI.verifyElementText(findTestObject('Object Repository/Web - Flow Beli Event/SW-BE01/Page_Coding.ID - Invoice/span_PAYMENT IS BEING PROCESSED'), 
    'PAYMENT IS BEING PROCESSED')

WebUI.takeScreenshot()

WebUI.closeBrowser()

