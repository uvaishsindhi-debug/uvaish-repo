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
public class code_2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void code_2() {
		tg.openDevice();
				tg.testFunction("launchdemoqa");
				tg.wait("ele_EditText1776846706815", ComparisonType.IS_VISIBLE, 5);
				tg.click("ele_EditText1776846706815", 1);
				tg.typeEncrypted("ele_EditText1776846706815", "YQ8MK8lRZeDKYbe5X1ViYw==:MTIzNDU2Nzg5MTAxMTEyMQ==", true);
				tg.wait("ele_EditText1776861767562", ComparisonType.IS_CLICKABLE, 5);
				tg_String var_lname = "";
				var_lname = tg.saveToVariable("#TGITVAR.name", var_lname);
				tg.click("ele_EditText1776156804091", 1);
				tg.type("ele_EditText1776156804091", var_lname, true);
				tg.declare("ele_email", "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
				tg.type("ele_email", "test@gmail.com", true);
				tg.wait(2);
		tg.close();
	}
}