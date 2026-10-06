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

class checkfunc {

	public static void checkfunc() {
		tg.type("ele_FormfullName", "40", false);
		tg.wait(1);
		tg.click("ele_DoneButton", 1);
		tg.wait(2);
		tg.check.isEqualTo("ele_FormfullName","40");
		tg.check.isNotEqualTo("ele_FormfullName","41");
		tg.check.isGreaterThanOrEqualTo("ele_FormfullName","40");
		tg.check.isGreaterThan("ele_FormfullName","39");
		tg.check.isLessThan("ele_FormfullName","55");
		tg.check.isEnabled("ele_FormfullName");
		tg.wait(3);
		tg.type("ele_FormfullName", "Kartik", false);
		tg.wait(1);
		tg.click("ele_DoneButton", 1);
		tg.wait(2);
		tg.check.contains("ele_FormfullName","Kar");
		tg.printLogs("DONE");
		tg.printLogs("ELEMENT CHECK ACTION SUCCESSSSS.......");
	}
}