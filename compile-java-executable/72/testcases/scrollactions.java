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
public class scrollactions {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void scrollactions() {
		tg.openDevice();
				tg.wait("ele_ScreensButton1781785646867", ComparisonType.IS_VISIBLE);
				tg.click("ele_ScreensButton1781785646867", 1);
				tg.wait("ele_navscrollButton1782114352564", ComparisonType.IS_VISIBLE);
				tg.click("ele_navscrollButton1782114352564", 1);
				tg.wait("ele_buttonscrollToBottomElement", ComparisonType.IS_VISIBLE);
				tg.scroll("ele_horizontalscrollview", "ele_Card7", Direction.RIGHT);
				tg.wait(1);
				tg.scroll("ele_horizontalscrollview", "ele_Card1", Direction.LEFT);
				tg.wait(1);
				tg.swipe("ele_SnappingCarouselTitle", Direction.UP);
				tg.wait(4);
				tg.swipe(Direction.DOWN);
				tg.wait(2);
				tg.wait("ele_ScreensButton1781785646867", ComparisonType.IS_VISIBLE);
				tg.click("ele_ScreensButton1781785646867", 1);
				tg.wait("ele_FormTab", ComparisonType.IS_VISIBLE);
				tg.click("ele_FormTab", 1);
		tg.close();
	}
}