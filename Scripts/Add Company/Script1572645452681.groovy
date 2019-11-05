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

WebUI.navigateToUrl('https://qaprep.hs.com/LogIn.asp?')

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep Please Sign In/input_User ID_user_name'), 'srajkumar')

WebUI.setEncryptedText(findTestObject('Object Repository/Add Company/Page_Prep Please Sign In/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Login/Page_Prep Please Sign In/input_Password_cmdSubmit'))

WebUI.click(findTestObject('Object Repository/Add Company/Page_Prep Home/b_BuildPro'))

WebUI.click(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/b_Add Company'))

Random r7 = new Random()

int CON = r7.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_Company Name_company_name'), 'AutoTest' + 
    CON)

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_Contact Name_contact_name'), findTestData(
        'D_AddCompany').getValue(2, 1))

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_Address 1_addr1'), findTestData(
        'D_AddCompany').getValue(3, 1))

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_Address 2_addr2'), findTestData(
        'D_AddCompany').getValue(4, 1))

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_City_city'), findTestData('D_AddCompany').getValue(
        5, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/select_----- USA ---------------AlabamaAlas_c2c858'), 
    'USTX', true)

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_State Zip_postal_code'), findTestData(
        'D_AddCompany').getValue(7, 1))

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_Phone_phone'), findTestData('D_AddCompany').getValue(
        8, 1))

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_Fax_fax'), findTestData('D_AddCompany').getValue(
        9, 1))

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_EMail Address_email'), findTestData(
        'D_AddCompany').getValue(10, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/select_JDEE1-BRIX-BMTFASTLLOYDSNEWSTAR'), 
    'B', true)

WebUI.click(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/td_NewOld'))
Random r9 = new Random()

int UN = r9.nextInt(1000)

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_SA Username_sa_user_name'), 'Autouser' + UN)

WebUI.setText(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_SA Password_sa_password'), findTestData(
        'D_AddCompany').getValue(17, 1))

WebUI.click(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_Test Company_test_ind'))

WebUI.click(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_Active_active'))

WebUI.click(findTestObject('Object Repository/Add Company/Page_Prep MH2BuildPro/input_Active_cmdSubmit'))

