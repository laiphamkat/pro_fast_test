import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page thoi-trang-nam c915'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/thoi-trang-nam/c915')

'step 2: Add visual checkpoint at Page thoi-trang-nam c915'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Page for Men s Fashion_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
