package com.mobile.vodqa.helper;

import com.mobile.vodqa.utilities.UIControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseAppium {

    UIControl uiControl = new UIControl();

    public void clearFields() {
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='username']")).clear();
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='password']")).clear();
    }

    public void sendCredentials(String user, String pass) {
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='username']")).sendKeys(user);
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='password']")).sendKeys(pass);
    }

    public void clickButton() {
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\'login\']/android.widget.Button/android.widget.TextView")).click();
    }

    public void swipeFromElements() {
        By firstElement = By.xpath("//android.widget.TextView[@content-desc='webView']");
        By secondElement = By.xpath("//android.widget.TextView[@content-desc='longPress']");
        uiControl.moveByElement(firstElement, secondElement);
    }
}
