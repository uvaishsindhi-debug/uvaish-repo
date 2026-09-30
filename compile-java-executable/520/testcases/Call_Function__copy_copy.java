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
public class call_function__copy_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void call_function__copy_copy() {
		tg.openDevice();
		tg.testFunction("check_func__copy_copy");
		START_CUSTOM_SCRIPT;
		WebElement email = driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='com.app.urunner:id/et_email'])[1]"));
		email.sendKeys("Demo_Email" + "\n");
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}