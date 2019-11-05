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
//WebUI.navigateToUrl('https://qaprep.hs.com/LogIn.asp?')
//
//WebUI.setText(findTestObject('Object Repository/Community/Page_Prep Please Sign In/input_User ID_user_name'), 'srajkumar')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Community/Page_Prep Please Sign In/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')
//
//WebUI.click(findTestObject('Login/Page_Prep Please Sign In/input_Password_cmdSubmit'))
//
//WebUI.click(findTestObject('Object Repository/Community/Page_Prep Home/b_BuildPro'))
//
//WebUI.click(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/b_Company Search'))
//
//WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input_Company Name_company_name'), 'Sri')
//
//WebUI.sendKeys(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input_Company Name_company_name'), Keys.chord(
//        Keys.ENTER))
//
//WebUI.click(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/a_Sri QA Integrated Company'))
//
//WebUI.click(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/font_Organizations'))
//
WebUI.click(findTestObject('Page_Prep MH2BuildPro/Organizations Link'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_'))


WebUI.click(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/a_324 - Auto Div533'))

WebUI.click(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/a_Add Organization'))

Random r5 = new Random()

int CN = r5.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__org_num'), '' + CN)

Random r6 = new Random()

int CN1 = r6.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Div1/Page_Prep MH2BuildPro/input__org_name'), 'Auto Comm' + CN1)

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__contact_name'), findTestData('D_Community').getValue(
        3, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/select_DivisionOtherRegion'), 
    'A', true)

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input_Email Address_email_address'), findTestData(
        'D_Community').getValue(11, 1))

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input_EPO Email_epo_email'), findTestData(
        'D_Community').getValue(12, 1))

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__bill_to_name'), findTestData('D_Community').getValue(
        16, 1))

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__bill_to_addr1'), findTestData('D_Community').getValue(
        17, 1))

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__bill_to_city'), findTestData('D_Community').getValue(
        19, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858'), 
    'USTX', true)

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__bill_to_zip'), findTestData('D_Community').getValue(
        21, 1))

WebUI.click(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/table_Organization DetailOrg IDSystem Gener_da62cc'))

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__bill_to_email'), findTestData('D_Community').getValue(
        22, 1))

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__bill_to_phone'), findTestData('D_Community').getValue(
        23, 1))

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__ship_to_name'), findTestData('D_Community').getValue(
        24, 1))

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__ship_to_addr1'), findTestData('D_Community').getValue(
        25, 1))

WebUI.click(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/tr_City'))

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__ship_to_city'), findTestData('D_Community').getValue(
        28, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858_1'), 
    'USTX', true)

WebUI.setText(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__ship_to_zip'), findTestData('D_Community').getValue(
        30, 1))

WebUI.click(findTestObject('Object Repository/Community/Page_Prep MH2BuildPro/input__cmdSubmit'))



