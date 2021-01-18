package co.com.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestDiligencePersonPage {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to the Register").located(By.xpath("//a[@href='/signup/personal']"));
    public static final Target INPUT_FIRST_NAME = Target.the("Where do we write the first name").located(By.name("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Where do we write the last name").located(By.name("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Where do we write the email").located(By.name("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("Where do select the birth month").located(By.name("birthMonth"));
    public static final Target SELECT_BIRTH_MONTH_2 = Target.the("Where do select the birth month").located(By.xpath("//option[@label='January']"));
    public static final Target SELECT_BIRTH_DAY = Target.the("Where do select the birth day").located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_DAY_2 = Target.the("Where do select the birth day").located(By.xpath("//option[@label='25']"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("Where do select the birth year").located(By.id("birthYear"));
    public static final Target SELECT_BIRTH_YEAR_2 = Target.the("Where do select the birth year").located(By.xpath("//option[@label='1996']"));
    public static final Target NEXT_STEP_BUTTON = Target.the("button that shows us the form to the Register").located(By.xpath("//a[contains(@class,'btn btn-blue')]"));



}
