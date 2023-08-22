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

Mobile.startApplication('C:\\Users\\rizky\\Downloads\\DemoAppV2.apk', true)

Mobile.tap(findTestObject('Object Repository/Mobile - Login/android.widget.TextView - Login Here'), 3)

Mobile.setText(findTestObject('Object Repository/Mobile - Login/android.widget.EditText'), 'isya.katalon@gmail.com', 3)

Mobile.setText(findTestObject('Object Repository/Mobile - Login/android.widget.EditText (1)'), 'password', 3)

Mobile.tap(findTestObject('Object Repository/Mobile - Login/android.widget.TextView - Login'), 3)

Mobile.tap(findTestObject('Object Repository/Mobile - Login/android.widget.TextView - Profile'), 3)

Mobile.getText(findTestObject('Object Repository/Mobile - Login/android.widget.TextView - isya.katalongmail.com'), 3)

Mobile.takeScreenshot()

Mobile.closeApplication()

