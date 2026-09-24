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
public class momt {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void momt() {
		tg.openDevice();
		tg.wait(2);
		START_CUSTOM_SCRIPT;
		java.net.HttpURLConnection conn = null;
		        try {
		            int buildVersion = 0;
		            System.out.println("CI Run method execution is started:");
		            // TARGETING YOUR LOCAL IP ADDRESS
		            java.net.URL url = new java.net.URL("https://12.133.14.218/build/ci/app_build_run");
		            conn = (java.net.HttpURLConnection) url.openConnection();
		            // Set up request headers & method
		            conn.setRequestMethod("POST");
		            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		            conn.setDoOutput(true);
		            // Build URL-encoded form parameters
		            StringBuilder postData = new StringBuilder();
		            postData.append("user_token=").append(java.net.URLEncoder.encode("s6aw9mxnipmvvug27erizb06i6oleq20", "UTF-8"));
		            postData.append("&application_token=").append(java.net.URLEncoder.encode("bcd7d63218edd117b1400cf1fe10709e", "UTF-8"));
		            postData.append("&version_token=").append(java.net.URLEncoder.encode("95c6cc61c30935a264caa3acffb924e3", "UTF-8"));
		            postData.append("&version_module_id=").append(java.net.URLEncoder.encode("48", "UTF-8"));
		            postData.append("&testcase_id=").append(java.net.URLEncoder.encode("404", "UTF-8"));
		            postData.append("&process_type=").append(java.net.URLEncoder.encode("oaa", "UTF-8"));
		            postData.append("&s_device=").append(java.net.URLEncoder.encode("7DIRNJ", "UTF-8"));
		            postData.append("&bundle_identifier=").append(java.net.URLEncoder.encode("com.app.urunner", "UTF-8"));
		            byte[] postDataBytes = postData.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8);
		            // Send request payload
		            System.out.println("CI API is called");
		            try (java.io.OutputStream os = conn.getOutputStream()) {
		                os.write(postDataBytes);
		            }
		            int statusCode = conn.getResponseCode();
		            System.out.println("CI API Executed");
		            System.out.println("HTTP Status Code: " + statusCode);
		            // Read response content
		            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream(), java.nio.charset.StandardCharsets.UTF_8));
		            String inputLine;
		            StringBuilder content = new StringBuilder();
		            while ((inputLine = in.readLine()) != null) {
		                content.append(inputLine);
		            }
		            in.close();
		            String jsonResponse = content.toString();
		            System.out.println("CI API Call Response is: " + jsonResponse);
		            // Parse response using org.json
		            JSONObject responseJson = new JSONObject(jsonResponse);
		            if (responseJson.has("status") && responseJson.getInt("status") == 1) {
		                buildVersion = responseJson.getInt("build_version");
		            }
		            System.out.println("Build Version = " + buildVersion);
		        } catch (Exception ex) {
		            System.out.println("Exception : " + ex.getMessage());
		            ex.printStackTrace();
		        } finally {
		            if (conn != null) {
		                conn.disconnect();
		            }
		        }
		END_CUSTOM_SCRIPT;
		tg.wait(2);
		tg.close();
	}
}