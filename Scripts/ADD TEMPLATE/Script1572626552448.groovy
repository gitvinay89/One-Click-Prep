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
import org.apache.commons.lang.RandomStringUtils


WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qaprep.hs.com/LogIn.asp')


WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep Please Sign In/input_User ID_user_name'), findTestData('D_Login').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep Please Sign In/input_Password_password'), findTestData('D_Login').getValue(2, 1))
WebUI.click(findTestObject('Login/Page_Prep Please Sign In/input_Password_cmdSubmit'))

WebUI.click(findTestObject('Object Repository/Create Template/Page_Prep Home/b_BuildPro'))

WebUI.click(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/b_Company Search'))

WebUI.setText(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_Company Name_company_name'), 
    'sri')

WebUI.sendKeys(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_Company Name_company_name'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/a_Sri QA Integrated Company'))

WebUI.click(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/font_Templates'))

WebUI.click(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/a_Add Template'))

Random r1 = new Random();
int TN = r1.nextInt(1000);

WebUI.setText(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_Template Name_plan_name'), 'Auto - Template' + TN )

Random r2 = new Random();
int T1N = r2.nextInt(1000);

WebUI.setText(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_Template Number_plan_num'), '' + T1N )

WebUI.setText(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_Elevation_elevation'), findTestData(
        'D_AddTemplate').getValue(5, 1))

WebUI.click(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_Active_active'))

WebUI.setText(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_Floors_floors'), findTestData(
        'D_AddTemplate').getValue(9, 1))

WebUI.setText(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_Bedrooms_bedrooms'), findTestData(
        'D_AddTemplate').getValue(10, 1))

WebUI.setText(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_SQFT Total_sqft_total'), findTestData(
        'D_AddTemplate').getValue(11, 1))

WebUI.setText(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_SQFT AC_sqft_ac'), findTestData(
        'D_AddTemplate').getValue(12, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/select_Sri Test Company OrgSri RegionSRI - _268a52'), 
    '11135', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/select_-_ (_) test - Special Useraalvarez3 _add06c'), 
    '8615', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/select_Account Set SriAcct 34234Acct123Auto_8f0d1e'), 
    '1537', true)

WebUI.click(findTestObject('Object Repository/Create Template/Page_Prep MH2BuildPro/input_Account Set_cmdSubmit'))

