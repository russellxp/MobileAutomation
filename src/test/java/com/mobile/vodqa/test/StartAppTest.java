package com.mobile.vodqa.test;

import com.mobile.vodqa.helper.BaseAppium;
import com.mobile.vodqa.helper.Login;
import com.mobile.vodqa.utilities.UIControl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class StartAppTest {

    static BaseAppium baseAppium = new BaseAppium();
    UIControl uiControl = new UIControl();
    Login login = new Login();

    @BeforeAll
    public static void setUp() throws MalformedURLException, InterruptedException {
        baseAppium.startAppium();
    }

    @Test
    @DisplayName("Test that performs the login")
    public void sendUserAndPassThenLogin() throws InterruptedException {
        uiControl.handlePermissionControlers();

        //limpiar los campos
        login.clearFields();

        //ingresar usuario y pass
        login.sendCredentials("admin", "admin");

        //dar click en el boton
        login.clickButton();

        login.swipeFromElements();

        Thread.sleep(3000);
    }

    @AfterAll
    public static void closeAppium() {
        baseAppium.closeAppium();
    }

}
