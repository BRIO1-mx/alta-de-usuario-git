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

WebUI.navigateToUrl('https://adminquality.brio.lat/login')

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Bro/a_Iniciar sesin'))

WebUI.setText(findTestObject('Object Repository/Usuarios alta git/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_loginfmt'), 
    user)

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Bro/a_Usuarios'))

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Bro/a_Listado de usuarios'))

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Bro/a_Usuarios_add'))

WebUI.setText(findTestObject('Object Repository/Usuarios alta git/Page_Bro/input_ID de Red_networkId'), networkId)

WebUI.setText(findTestObject('Object Repository/Usuarios alta git/Page_Bro/input_Nombre Completo_name'), name)

WebUI.setText(findTestObject('Object Repository/Usuarios alta git/Page_Bro/input_Correo Electrnico_email'), email1)

WebUI.setText(findTestObject('Object Repository/Usuarios alta git/Page_Bro/input_ID Empleado_employeeId'), employeeId)

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Bro/div_Seleccionar roles'))

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Bro/span'))

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Bro/label_Admin'))

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Bro/div_Alta de UsuarioInicioUsuarios Alta de U_bc437a'))

WebUI.click(findTestObject('Object Repository/Usuarios alta git/Page_Bro/input'))

WebUI.closeBrowser()

