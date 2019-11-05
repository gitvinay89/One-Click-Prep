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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

//WebUI.openBrowser('')
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://qaprep.hs.com/LogIn.asp')
//
//
//WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep Please Sign In/input_User ID_user_name'), findTestData('D_Login').getValue(1, 1))
//
//WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep Please Sign In/input_Password_password'), findTestData('D_Login').getValue(2, 1))
//WebUI.click(findTestObject('Login/Page_Prep Please Sign In/input_Password_cmdSubmit'))
//
//WebUI.click(findTestObject('Add User/Page_Prep Home/b_BuildPro'))
//
//WebUI.click(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/b_Company Search'))
//
////def companyname = (findTestObject('Data 3').getvalue(1,1))
//WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Company Name_company_name'), 'sri')
//
//WebUI.sendKeys(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Company Name_company_name'), Keys.chord(
//        Keys.ENTER))
//
//WebUI.click(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/a_Sri QA Integrated Company'))
//
WebUI.click(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/font_Users'))

WebUI.click(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/a_Add User'))

Random r1 = new Random()

int UN = r1.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Username_user_name'), 'Auto' + UN)

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Password_password'), findTestData('D_AddUser').getValue(
        2, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_First Name_first_name'), findTestData(
        'D_AddUser').getValue(3, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Last Name_last_name'), findTestData(
        'D_AddUser').getValue(4, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Address Name_addr_name'), findTestData(
        'D_AddUser').getValue(14, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Street 1_addr1'), findTestData('D_AddUser').getValue(
        15, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_City_city'), findTestData('D_AddUser').getValue(
        17, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858'), 
    'USTX', true)

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Postal Code_postal_code'), findTestData(
        'D_AddUser').getValue(19, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_E-mail_email_address'), findTestData(
        'D_AddUser').getValue(20, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Phone_phone_number'), findTestData(
        'D_AddUser').getValue(21, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Phone PIN_phone_pin'), findTestData(
        'D_AddUser').getValue(23, 1))

WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Fax_fax_number'), findTestData('D_AddUser').getValue(
        24, 1))

//WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Phone SubNo_phone_subno'), findTestData(
//        'D_AddUser').getValue(22, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/select_Alberto RoleSri RoleSubs Role 1Add-M_35617b'), 
    '463', true)

WebUI.click(findTestObject('Object Repository/Add User/Page_Prep MH2BuildPro/input_Role_cmdSubmit'))

Thread.sleep(3000)

