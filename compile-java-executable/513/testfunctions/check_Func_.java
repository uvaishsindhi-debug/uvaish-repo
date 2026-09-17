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

class check_func_ {

	public static void check_func_() {
		tg.type("ele_EnteremailaddressEditText1782830312862", "40", false);
		tg.wait(1);
		tg.check.isEqualTo("ele_EnteremailaddressEditText1782830312862","40");
		tg.check.isNotEqualTo("ele_EnteremailaddressEditText1782830312862","44");
		tg.check.isGreaterThanOrEqualTo("ele_EnteremailaddressEditText1782830312862","40");
		tg.check.isLessThanOrEqualTo("ele_EnteremailaddressEditText1782830312862","44");
		tg.check.isGreaterThan("ele_EnteremailaddressEditText1782830312862","38");
		tg.check.isLessThan("ele_EnteremailaddressEditText1782830312862","42");
		tg.check.isEnabled("ele_EnteremailaddressEditText1782830312862");
		tg.wait(2);
		tg.printLogs("Done");
		tg.printLogs("Check Action Success..........!!!!!!!!!!!");
	}
}