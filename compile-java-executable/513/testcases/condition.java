import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class condition {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void condition() {
		tg.openDevice();
		// [DISABLED] tg.click("ele_demoqacomautomationpracticeformEditText1776270170096", 1);
		// [DISABLED] tg.wait(2);
		// [DISABLED] tg.wait("ele_httpswwwrapidtablescomtoolsclickcounterhtmlc10TextView1776331733948", ComparisonType.IS_VISIBLE, 5);
		// [DISABLED] tg.click("ele_demoqacomautomationpracticeformEditText1776270756719", 1);
		// [DISABLED] tg.wait("ele_demoqacomautomationpracticeformEditText1776270756719", ComparisonType.IS_VISIBLE, 5);
		// [DISABLED] tg.click("ele_demoqacomautomationpracticeformEditText1776270756719", 1);
		// [DISABLED] tg.wait("ele_demoqacomautomationpracticeformEditText1776270756719", ComparisonType.IS_VISIBLE, 5);
		// [DISABLED] tg.type("ele_demoqacomautomationpracticeformEditText1776270756719", "https://www.rapidtables.com/tools/click-counter.html?c1=0", true);
		// [DISABLED] tg.wait("ele_WebViewFrameLayout1776270792707", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.click("ele_httpswwwrapidtablescomtoolsclickcounterhtmlc10TextView1776331733948", 1);
		START_CUSTOM_SCRIPT;
		driver.get("https://www.rapidtables.com/tools/click-counter.html?c1=0");
		END_CUSTOM_SCRIPT;
		tg.wait("ele_Button1776270824252", ComparisonType.IS_VISIBLE, 10);
		if(tg.performAssert("ele_EditText1776270813212", ComparisonType.EQUAL_TO, 0)){
		tg.click("ele_Button1776270824252", 1);
		if(tg.performAssert("ele_EditText1776270813212", ComparisonType.EQUAL_TO, 0)){
		tg.click("ele_Button1776270824252", 1);
		}
		} else {
		tg.click("ele_Button1776270824252", 1);
		}
		while(tg.verify.isEqualTo("ele_Button1776270824252", 2)){
		tg.click("ele_Button1776270824252", 1);
		}
		tg.close();
	}
}