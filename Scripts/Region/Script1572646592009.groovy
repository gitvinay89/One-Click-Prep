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

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://qaprep.hs.com/LogIn.asp?')
//
//WebUI.setText(findTestObject('Object Repository/Region/Page_Prep Please Sign In/input_User ID_user_name'), 'srajkumar')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Region/Page_Prep Please Sign In/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')
//
//WebUI.click(findTestObject('Object Repository/Region/Page_Prep Please Sign In/input_Password_cmdSubmit'))
//
//WebUI.click(findTestObject('Object Repository/Region/Page_Prep Home/b_BuildPro'))
//
//WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/b_Company Search'))
//
//WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input_Company Name_company_name'), 'AutoTest809')
//
//WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input_Email Address_cmdSubmit'))
//
//WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/a_AutoTest809'))
//
//WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/font_Organizations'))
//
//WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/a_'))
//
//WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/a_00001 - AutoTest809 Org'))
//
//WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/a_Add Organization'))


WebUI.click(findTestObject('Page_Prep MH2BuildPro/Organizations Link'))

WebUI.click(findTestObject('Page_Prep MH2BuildPro/Parent Org'))

WebUI.click(findTestObject('Page_Prep MH2BuildPro/Add Organization Link'))

Random r10 = new Random()

int RN = r10.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__org_num'), '' + RN)

Random r11 = new Random()

int R1N = r11.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__org_name'), 'AutoRegion' + R1N)

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__contact_name'), findTestData('D_Region').getValue(
		3, 1))


WebUI.selectOptionByValue(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/select_DivisionOtherRegion'), 'R',
	true)

WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/td_DivisionOtherRegion'))

WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input_Create Subdivision_subdiv_ind'))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input_Email Address_email_address'), findTestData(
		'D_Region').getValue(10, 1))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input_EPO Email_epo_email'), findTestData('D_Region').getValue(
		11, 1))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__bill_to_name'), findTestData('D_Region').getValue(
		15, 1))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__bill_to_addr1'), findTestData('D_Region').getValue(
		16, 1))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__bill_to_city'), findTestData('D_Region').getValue(
		18, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858'),
	'USTX', true)

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__bill_to_zip'), findTestData('D_Region').getValue(
		20, 1))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__bill_to_email'), findTestData('D_Region').getValue(
		21, 1))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__bill_to_phone'), findTestData('D_Region').getValue(
		22, 1))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__ship_to_name'), findTestData('D_Region').getValue(
		23, 1))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__ship_to_addr1'), findTestData('D_Region').getValue(
		24, 1))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__ship_to_city'), findTestData('D_Region').getValue(
		27, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858_1'),
	'USTX', true)

WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/td_1'))

WebUI.setText(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input__ship_to_zip'), findTestData('D_Region').getValue(
		29, 1))

WebUI.click(findTestObject('Object Repository/Region/Page_Prep MH2BuildPro/input_Email Address_cmdSubmit'))


