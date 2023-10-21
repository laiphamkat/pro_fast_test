import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page dien-gia-dung c1882'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dien-gia-dung/c1882')

'step 2: Add visual checkpoint at Page dien-gia-dung c1882'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Page for Home Appliances_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
