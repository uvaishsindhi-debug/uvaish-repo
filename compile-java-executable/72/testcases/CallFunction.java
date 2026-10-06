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
public class callfunction {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void callfunction() {
		tg.openDevice();
				tg.testFunction("checkFunc");
		START_CUSTOM_SCRIPT;
		WebElement clearBtn = driver.findElement(By.xpath("//XCUIElementTypeButton[@name='section.clear']"));
		clearBtn.click();
		WebElement fullName = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='field.fullName']"));
		fullName.sendKeys("Demo_FullName" + "\n");
		WebElement firstName = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='field.firstName']"));
		firstName.sendKeys("Demo_FirstName" + "\n");
		WebElement clearBtn1 = driver.findElement(By.xpath("//XCUIElementTypeButton[@name='section.clear']"));
		clearBtn1.click();
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}