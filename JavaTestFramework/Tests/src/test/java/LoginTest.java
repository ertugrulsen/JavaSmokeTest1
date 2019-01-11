import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;


public class LoginTest extends BaseTestClassTest

{

    @Test
    public void Can_GoTo_LoginPage()
    {

          LoginPage.GoTo();
          LoginPage.LoginAs("senertugrul").WithPassword("123456").Login();

          Assert.assertTrue(LoginPage.IsAt("Hesabım"));


    }


}