package com.mobile.vodqa.utilities;

import com.mobile.vodqa.helper.BaseAppium;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class UIControl extends BaseAppium {


    public void handlePermissionControlers() {
        driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
        driver.findElement(By.id("android:id/button1")).click();
    }

    public void moveByElement(By firstElement, By secondElement) {
        int x1, y1, x2, y2;
        x1 = driver.findElement(firstElement).getLocation().getX();
        y1 = driver.findElement(firstElement).getLocation().getY();

        x2 = driver.findElement(secondElement).getLocation().getX();
        y2 = driver.findElement(secondElement).getLocation().getY();
        swipe(x1, y1, x2, y2);
    }

    public void swipe(int x1, int y1, int x2, int y2) {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(x1, y1)).waitAction().moveTo(PointOption.point(x2, y2)).release().perform();
    }


}
