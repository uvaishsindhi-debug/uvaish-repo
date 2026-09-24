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
public class tcmanual1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcmanual1() {
		tg.openDevice();
				tg.scroll("ele_SignUpelement27171110916350", Direction.DOWN);
				tg.click("ele_SignUpelement27171110916350", 1);
		// Firstnamefieldnotpresentskippingstepforfirstname171135422257
				tg.wait(2);
				tg.scroll("ele_Enteremailaddresselement16171135422257", Direction.DOWN);
				tg.type("ele_Enteremailaddresselement16171135422257", "John.doe@gamil.com", true);
				tg.wait(2);
				tg.scroll("ele_Enterpasswordelement19171135422257", Direction.DOWN);
				tg.type("ele_Enterpasswordelement19171135422257", "John@123", true);
				tg.wait(2);
		// Confirmpasswordfieldnotpresentskippingtapandtypeforconfirmpassword171135422257
				tg.wait(2);
		// SignUpbuttonnotpresentunabletoproceedwithregistrationtap171135422257
		tg.close();
	}
}