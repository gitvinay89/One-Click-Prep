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

WebUI.navigateToUrl('https://qaprep.hs.com/LogIn.asp')

WebUI.setText(findTestObject('Object Repository/Add Stage/Page_Prep Please Sign In/input_User ID_user_name'), 'srajkumar')

WebUI.setEncryptedText(findTestObject('Object Repository/Add Stage/Page_Prep Please Sign In/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Add Stage/Page_Prep Please Sign In/input_Password_cmdSubmit'))

WebUI.click(findTestObject('Object Repository/Add Stage/Page_Prep Home/b_BuildPro'))

WebUI.click(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/b_Company Search'))

WebUI.setText(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/input_Company Name_company_name'), 'sri')

WebUI.sendKeys(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/input_Company Name_company_name'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/a_Sri QA Integrated Company'))

WebUI.click(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/font_Templates'))

WebUI.click(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/input_TemplateStatus_cmdSearchSuppliers'))

WebUI.click(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/a_Auto579'))
//for (def ColumnNumber = 1 ; ColumnNumber <= findTestData("D_Stage").getColumnIndex() ; ColumnNumber ++)
//{
for (def rowNumber = 1 ; rowNumber <= findTestData("D_Stage").getRowNumbers() ; rowNumber ++)  
{
WebUI.click(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/a_Add Template Stage'))

WebUI.setText(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/input_Stage Name_phase_name'),findTestData('D_Stage').getValue(1, rowNumber)) 

WebUI.setText(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/input_Stage Desc_phase_desc'),findTestData('D_Stage').getValue(2, rowNumber))

WebUI.click(findTestObject('Object Repository/Add Stage/Page_Prep MH2BuildPro/input_Dependent Stage_cmdSubmit'))
}
//}

