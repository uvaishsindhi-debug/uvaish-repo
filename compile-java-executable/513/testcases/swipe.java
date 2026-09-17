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
public class swipe {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void swipe() {
		tg.openDevice();
		START_CUSTOM_SCRIPT;
		driver.get("https://www.amazon.in");
		END_CUSTOM_SCRIPT;
				tg.wait(5);
				tg.swipe(Direction.LEFT);
				tg.wait(5);
				tg.swipe(Direction.RIGHT);
				tg.wait(5);
				tg.swipe(Direction.UP);
				tg.wait(5);
				tg.swipe(Direction.DOWN);
				tg.writeToCSV("text", "text", "swipe works perfectly....");
		tg.pullToRefresh("ele_View1776872579960");
		tg.close();
	}
}