package scenarios;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseApp {
	private final String FILE_PATH = "/Users/hailh/Documents/workspace/AppiumTest/resources/app-debug_release.apk";//"/Users/hailh/Desktop/Appium/resources/24hsoccer_android11052017.apk";//
	private final String PLATFORM_NAME = "ANDROID";
	private final String APP_PACKAGE = "com.tintuc24h.bongda.livescore";
	private final String URL_REMOTE = "http://127.0.0.1:4723/wd/hub";
	private final String DEVICE_NAME = "Android emulator";
	private final String PLATFORM_VERSION = "5.1";
	
	private final String AVD_DEVICE = "Nexus_5_API_22";// DeviceList.NEXUS_5_API_22;
    private final String ENV_SDK_PATH = "/Users/hailh/Library/Android/sdk/";
	
	protected static AndroidDriver driver;
	protected String activity;
	protected void setActivity(String act){
		activity = act;
	}
    @BeforeClass
    public void initContext() throws MalformedURLException {
        System.out.println("1. Setting Platform...");
        //File app = new File("/Users/hailh/Desktop/Appium/24hDemo/src/main/resources/AdvanceOS_24hsoccer.apk");
        File app = new File(FILE_PATH);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.APP, app);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        caps.setCapability("avd", AVD_DEVICE);//Nexus 5 API 22
        caps.setCapability("appPackage", APP_PACKAGE );
        //caps.setCapability("appActivity", "com.tintuc24h.bongda.livescore.activities.MainActivity");
        caps.setCapability("appActivity", activity );
        driver = new AndroidDriver(new URL(URL_REMOTE), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    
    @AfterClass
    public void closeApp() throws MalformedURLException{
    	if (driver != null) {
            driver.closeApp();
            closeEmulator();
        }
    }
    /**@method closeEmulator
     * to Kills all running emulators
     * @author hailh
     */
    private  void closeEmulator() {

        String adbPath = ENV_SDK_PATH + "platform-tools" + File.separator + "adb";

        System.out.println("   Killing emulator...");
        String[] aCommand = new String[] { adbPath, "emu", "kill" };
        try {
            Process process = new ProcessBuilder(aCommand).start();
            //process.waitFor(1, TimeUnit.SECONDS);
            process.waitFor();

        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
