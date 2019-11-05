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
//WebUI.navigateToUrl('https://qaprep.hs.com/LogIn.asp')
//
//WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep Please Sign In/input_User ID_user_name'), findTestData(
//        'D_Login').getValue(1, 1))
//
//WebUI.setText(findTestObject('Object Repository/Add User/Page_Prep Please Sign In/input_Password_password'), findTestData(
//        'D_Login').getValue(2, 1))
//
//WebUI.click(findTestObject('Login/Page_Prep Please Sign In/input_Password_cmdSubmit'))
//
//WebUI.click(findTestObject('Object Repository/Div1/Page_Prep Home/b_BuildPro'))
//
//WebUI.click(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/b_Company Search'))
//
//WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input_Company Name_company_name'), 'Sri')
//
//WebUI.sendKeys(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input_Company Name_company_name'), Keys.chord(
//        Keys.ENTER))
//
//WebUI.click(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/a_Sri QA Integrated Company'))
//
//WebUI.click(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/font_Organizations'))
//
//WebUI.click(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/a_'))

WebUI.click(findTestObject('Page_Prep MH2BuildPro/Organizations Link'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_'))

//*[@id="frmOrgHierachy"]/table[4]/tbody/tr/td[2]/table[2]/tbody/tr/td/font/table/tbody/tr[4]/td/table/tbody/tr[2]/td/font/a[1]

WebUI.click(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/a_1 - Sri Region'))

WebUI.click(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/a_Add Organization'))

Random r3 = new Random()

int DN = r3.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__org_num'), '' + DN)

Random r4 = new Random()

int DN1 = r4.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__org_name'), 'Auto Div' + DN1)

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__contact_name'), findTestData('D_Division').getValue(
        3, 1))

WebUI.click(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input_Create Subdivision_subdiv_ind'))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input_Email Address_email_address'), findTestData(
        'D_Division').getValue(11, 1))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input_EPO Email_epo_email'), findTestData('D_Division').getValue(
        12, 1))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__bill_to_name'), findTestData('D_Division').getValue(
        16, 1))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__bill_to_addr1'), findTestData('D_Division').getValue(
        17, 1))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__bill_to_city'), findTestData('D_Division').getValue(
        19, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858'), 
    'USTX', true)

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__bill_to_zip'), findTestData('D_Division').getValue(
        21, 1))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__bill_to_email'), findTestData('D_Division').getValue(
        22, 1))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__bill_to_phone'), findTestData('D_Division').getValue(
        23, 1))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__ship_to_name'), findTestData('D_Division').getValue(
        24, 1))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__ship_to_addr1'), findTestData('D_Division').getValue(
        25, 1))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__ship_to_city'), findTestData('D_Division').getValue(
        28, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858_1'), 
    'USTX', true)

//WebUI.click(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/td'))

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__ship_to_zip'), findTestData('D_Division').getValue(
        30, 1))

WebUI.click(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__cmdSubmit'))


Thread.sleep(20000)
