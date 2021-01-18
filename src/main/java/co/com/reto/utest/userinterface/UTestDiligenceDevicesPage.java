package co.com.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UTestDiligenceDevicesPage {
    public static final Target DEFINE_SO_COMPUTER = Target.the("Where do open the selector of computer's SO").located(By.name("osId"));
    public static final Target SELECT_SO_COMPUTER = Target.the("Where do select the SO of the computer").located(By.xpath("//div[text()='Windows']"));
    public static final Target DEFINE_SO_VERSION = Target.the("Where do open the selector the SO's version of the computer").located(By.name("osVersionId"));
    public static final Target SELECT_SO_VERSION = Target.the("Where do select the SO's version of the computer").located(By.xpath("//div[text()='10']"));
    public static final Target DEFINE_SO_LANGUAGE= Target.the("Where do open the selector of SO's language of the computer").located(By.name("osLanguageId"));
    public static final Target SELECT_SO_LANGUAGE = Target.the("Where do select the SO's language of the computer").located(By.xpath("//div[text()='Spanish']"));
    public static final Target DEFINE_MARKER_DEVICE= Target.the("Where do open the selector of device's marker").located(By.name("handsetMakerId"));
    public static final Target SELECT_MARKER_DEVICE = Target.the("Where do select the device's marker").located(By.xpath("//div[text()='Asus']"));
    public static final Target DEFINE_MODEL_MAKER= Target.the("Where do open the selector of marker's model").located(By.name("handsetModelId"));
    public static final Target SELECT_MODEL_MAKER = Target.the("Where do select the marker's model").located(By.xpath("//div[text()='PadFone X']"));
    public static final Target DEFINE_SO_DEVICE= Target.the("Where do open the selector of SO's device").located(By.name("handsetOSId"));
    public static final Target SELECT_SO_DEVICE = Target.the("Where do select the SO's device").located(By.xpath("//div[text()='Android 4.4']"));
    public static final Target NEXT_STEP_BUTTON = Target.the("button that shows us the next form of the Register").located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));

}
