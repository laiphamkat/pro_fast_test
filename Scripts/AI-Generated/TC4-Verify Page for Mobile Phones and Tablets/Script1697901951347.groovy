import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page dien-thoai-may-tinh-bang c1789'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dien-thoai-may-tinh-bang/c1789')

'step 2: Add visual checkpoint at Page dien-thoai-may-tinh-bang c1789'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Page for Mobile Phones and Tablets_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
