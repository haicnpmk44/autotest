package scenarios;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1Splash extends BaseApp {

	private final String APP_ACTIVITY = "com.tintuc24h.bongda.livescore.activities.SplashActivity" ;
	 
	private static String ID_BUTTON_CONTINUE  =  "com.tintuc24h.bongda.livescore:id/btnContinue";
	private static String CLASSNAME_IMAGEVIEW = "android.widget.ImageView";
	private static String CLASSNAME_TEXTVIEW = "android.widget.TextView";
	

//    @BeforeClass
//    public void initContext() throws MalformedURLException {
//    	super.setActivity(APP_ACTIVITY);
//    	super.initContext();
//    }
    
    //TC1: Open Homepage
    @Test (priority = 1)
    public void onTestTC1() throws InterruptedException{
            
          System.out.println("TC1: done");

    }

	//TC1: Open Homepage
	@Test (priority = 2)
	public void onTestTC2() throws Exception{
		System.out.println("TC2: failed");

		try {
			assertEquals(true, false);
		}catch(Exception e){
			e.
			System.out.println(e.getMessage());
			throw e;
		}

	}

	//TC1: Open Homepage
	@Test (priority = 3)
	public void onTestTC3(){
		System.out.println("TC3: failed");


		//testFull();
		assertEquals(true, false);
	}
    
//    public static void testFull(){
//
//
//    	//Kiem tra ton tai Image
//    	onTestImageView();
//
//    	//Kiem tra cac label:
//    	onTestTextView();
//
//
//    	skipPage();
//    }
//    private static void onTestImageView(){
//
//    	List<WebElement> img24h =driver.findElements(By.className(CLASSNAME_IMAGEVIEW));
//
//    	assertEquals(img24h.size(), 1);
//
//    	String url_img = img24h.get(0).getAttribute("name");
//    	System.out.println("URL=" + url_img);
//
//    	//assertEquals("res/drawable-xhdpi-v4/ic_wellcome_logo.png", url_img);
//
//    }
//
//    private static void onTestTextView(){
//
//    	List<WebElement> lstLables = driver.findElements(By.className(CLASSNAME_TEXTVIEW));
//    	System.out.println("lstLables.size() = " + lstLables.size());
//
//    	//Check Size
//    	assertEquals(lstLables.size(), 4);
//
//    	//Check content per labels
//    	assertEquals(lstLables.get(0).getText(), "Chào mừng đến với");
//    	assertEquals(lstLables.get(1).getText(), "BÓNG ĐÁ 24H");
//    	assertEquals(lstLables.get(2).getText(), "App bóng đá duy nhất bạn cần. Hãy bắt đầu bằng cách chọn đội bóng bạn yêu thích");
//    	assertEquals(lstLables.get(3).getText(), "Chọn đội bóng bạn yêu thích");
//
//    	for(int i=0; i< lstLables.size(); i++){
//    		System.out.println(lstLables.get(i).getText());
//    	}
//
//    	//WebElement tvWelcome = driver.findElement(By.id("com.tintuc24h.bongda.livescore:id/tvWellcome"));
//    	//System.out.println("tvWellcome=" + tvWelcome.getText());
//
//
//    }
//
//
//    //method: nextPage -> click button continue to skeep this page.
//    public static void skipPage(){
//    	WebElement btnContinue =driver.findElement(By.id(ID_BUTTON_CONTINUE));
//    	btnContinue.click();
//    }

     

//    @AfterClass
//    public void closeApp() throws MalformedURLException{
//        super.closeApp();
//    }
    

}
