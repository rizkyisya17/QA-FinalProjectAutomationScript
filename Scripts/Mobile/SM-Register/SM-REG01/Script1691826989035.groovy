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

Mobile.startApplication('C:\\Users\\Dermawan\\Desktop\\Katalon Directory\\dummy\\apps\\DemoAppV2.apk', true)

Mobile.tap(findTestObject('Object Repository/Web - Register/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Web - Register/android.widget.TextView - Register, now'), 0)

Mobile.setText(findTestObject('Object Repository/Web - Register/android.widget.EditText'), 'iqbal', 0)

Mobile.checkElement(findTestObject('Web - Register/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Web - Register/android.widget.TextView - 2016'), 0)

Mobile.tap(findTestObject('Object Repository/Web - Register/android.widget.TextView - 2000'), 0)

Mobile.tap(findTestObject('Object Repository/Web - Register/android.view.View - 16'), 0)

Mobile.tap(findTestObject('Object Repository/Web - Register/android.widget.Button - OK'), 0)

Mobile.setText(findTestObject('Object Repository/Web - Register/android.widget.EditText (1)'), 'iqbalm213@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/Web - Register/android.widget.EditText (2)'), '081381629152', 0)

Mobile.setText(findTestObject('Object Repository/Web - Register/android.widget.EditText (3)'), 'password123', 0)

Mobile.setText(findTestObject('Object Repository/Web - Register/android.widget.EditText (4)'), 'password123', 0)

Mobile.tap(findTestObject('Object Repository/Web - Register/android.widget.CheckBox'), 0)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Web - Register/android.view.ViewGroup'), 0)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

