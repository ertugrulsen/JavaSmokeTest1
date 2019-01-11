import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    public static void GoTo()
    {
        Driver.Instance.navigate().to(Driver.BaseAddress());
    }

    public static LoginCommand LoginAs(String userName) {

        return new LoginCommand(userName);
    }



    public static class LoginCommand
    {
        private String userName;
        private String password;

        public LoginCommand(String userName)
        {

            this.userName=userName;


        }
        public LoginCommand WithPassword(String password){

            this.password = password;
            return this;

        }

        public void Login() {

           WebElement uusername = Driver.Instance.findElement(By.id("j_username"));
           uusername.sendKeys(userName);
           WebElement ppasword = Driver.Instance.findElement(By.id("j_password"));
           ppasword.sendKeys(password);
           WebElement LoginClick = Driver.Instance.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[2]/div[3]/button"));
           LoginClick.click();
        }

    }

    public static boolean IsAt(String hesabım) {
        return AccountStatus().equals(hesabım);
    }

    public static String AccountStatus() {
        WebElement account = Driver.Instance.findElement(By.xpath("/html/body/div[1]/header/nav[1]/div/ul[1]/li[6]/a"));

        return account.getText();
    }



}


