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

WebUI.click(findTestObject('Object Repository/TC_003_OR/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Log in'))

WebUI.click(findTestObject('Object Repository/TC_003_OR/Page_Log in to Bikroy/span_Continue with Email'))

WebUI.setText(findTestObject('Object Repository/TC_003_OR/Page_Log in to Bikroy/input_View and manage your ads at your conv_67423c'), 
    'mahabub.qups@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_003_OR/Page_Log in to Bikroy/input_Email_password'), 'h/Sbbl5V15ksKyVwREnwng==')

WebUI.click(findTestObject('Object Repository/TC_003_OR/Page_Log in to Bikroy/button_Login'))

WebUI.click(findTestObject('Object Repository/TC_003_OR/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Dhaka'))

WebUI.click(findTestObject('Object Repository/TC_003_OR/Page_Buy and Sell Anything in Dhaka  Bikroy.com/span_Mobiles'))

WebUI.click(findTestObject('Object Repository/TC_003_OR/Page_Mobiles and Accessories for Sale in Dh_5d1f29/h1_Mobiles Phones and Accessories for Sale _9f1b9e'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TC_003_OR/Page_Mobiles and Accessories for Sale in Dh_5d1f29/h1_Mobiles Phones and Accessories for Sale _9f1b9e'), 
    0)

WebUI.closeBrowser()

