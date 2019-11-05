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
//WebUI.click(findTestObject('Object Repository/Copy Accountset/Page_Prep Home/b_BuildPro'))
//
//WebUI.click(findTestObject('Object Repository/Copy Accountset/Page_Prep MH2BuildPro/b_Company Search'))
//
//WebUI.setText(findTestObject('Object Repository/Copy Accountset/Page_Prep MH2BuildPro/input_Company Name_company_name'), 'Sri')
//
//WebUI.sendKeys(findTestObject('Object Repository/Copy Accountset/Page_Prep MH2BuildPro/input_Company Name_company_name'), 
//    Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('Object Repository/Copy Accountset/Page_Prep MH2BuildPro/a_Sri QA Integrated Company'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/font_Account Sets'))

WebUI.click(findTestObject('Object Repository/Page_Prep MH2BuildPro/a_Copy Universal Account Set'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Copy Accountset/Page_Prep MH2BuildPro/select_AFM Industry - Direct Construction C_b22052'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Copy Accountset/Page_Prep MH2BuildPro/input_Account Set Name_acctset_name'), 
    findTestData('D_CopyAcctset').getValue(2, 1))

WebUI.setText(findTestObject('Object Repository/Copy Accountset/Page_Prep MH2BuildPro/input_Account Set Desc_acctset_desc'), 
    findTestData('D_CopyAcctset').getValue(3, 1))

WebUI.click(findTestObject('Object Repository/Copy Accountset/Page_Prep MH2BuildPro/input_Account Set Desc_cmdSubmit'))

