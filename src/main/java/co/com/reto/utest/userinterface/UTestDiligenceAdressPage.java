package co.com.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestDiligenceAdressPage {
    public static final Target DEFINE_COUNTRY = Target.the("Where do open the selector of Country").located(By.name("countryId"));
    public static final Target SELECT_COUNTRY = Target.the("Where do select the Country").located(By.xpath("//div[text()='Colombia']"));
    public static final Target INPUT_CITY = Target.the("Where do we write the City").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Where do we write the Postal Code").located(By.name("zip"));
    public static final Target NEXT_STEP_BUTTON = Target.the("button that shows us the next form of the Register").located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));

}
