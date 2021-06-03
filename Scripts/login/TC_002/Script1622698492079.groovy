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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bikroy.com/en')

WebUI.click(findTestObject('TC_002_OR/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/span_Log in'))

WebUI.click(findTestObject('TC_002_OR/Page_Log in to Bikroy/span_Continue with Email'))

WebUI.setText(findTestObject('TC_002_OR/Page_Log in to Bikroy/input_To view your ads and account details,_c5b375'), 
    'mahabub.qups@gmail.com')

WebUI.setEncryptedText(findTestObject('TC_002_OR/Page_Log in to Bikroy/input_Email_password'), 'h/Sbbl5V15ksKyVwREnwng==')

WebUI.click(findTestObject('TC_002_OR/Page_Log in to Bikroy/button_Login'))

WebUI.click(findTestObject('TC_002_OR/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/h1_Welcome to Bikroy.com - the largest mark_8bb350'))

WebUI.closeBrowser()

