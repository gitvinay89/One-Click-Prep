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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

def QA = findTestData('URL').getValue(1, 1)
def UAT = findTestData('URL').getValue(2, 1)
def Prod = findTestData('URL').getValue(3, 1)
def AWS200 = findTestData('URL').getValue(4, 1)

//def url = findTestData('Prep Login/URL').getvalue(1,1)
WebUI.navigateToUrl(AWS200)

WebUI.setText(findTestObject('Prep Login Page/input_User ID_user_name'), findTestData('Prep Login').getValue(1, 2))

WebUI.setText(findTestObject('Prep Login Page/input_Password_password'), findTestData('Prep Login').getValue(2, 2))

WebUI.click(findTestObject('Prep Login Page/input_Password_cmdSubmit'))

Thread.sleep(3000)

//WebUI.closeBrowser()

