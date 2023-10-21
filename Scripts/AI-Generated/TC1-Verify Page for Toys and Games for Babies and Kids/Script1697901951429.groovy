import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page home click on hyperlink ch i m b --> navigate to Page do-choi-me-be c2549'

testObj = findTestObject('Object Repository/Page_home/hyperlink_ch_i_m_b')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page do-choi-me-be c2549 click on hyperlink tka tiki vn pixel pixel --> navigate to Page bo-2-hop-sua-bot-friso-gold-4-1400g-danh-cho-'

testObj = findTestObject('Object Repository/Page_do-choi-me-be/hyperlink_tka_tiki_vn_pixel_pixel')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/do-choi-me-be/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page bo-2-hop-sua-bot-friso-gold-4-1400g-danh-cho- click on hyperlink do choi me be c2549 --> navigate to Page do-choi-me-be c2549'

testObj = findTestObject('Object Repository/Page_home/hyperlink_do_choi_me_be_c2549')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page do-choi-me-be c2549'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Page for Toys and Games for Babies and Kids_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
