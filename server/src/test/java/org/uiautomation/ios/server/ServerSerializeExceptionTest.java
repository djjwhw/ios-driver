package org.uiautomation.ios.server;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;
import org.uiautomation.ios.BaseIOSDriverTest;
import org.uiautomation.ios.IOSCapabilities;
import org.uiautomation.ios.SampleApps;
import org.uiautomation.ios.client.uiamodels.impl.RemoteIOSDriver;

public class ServerSerializeExceptionTest extends BaseIOSDriverTest {

  @Test(expectedExceptions = WebDriverException.class)
  public void clientGetsServerException() {
    RemoteIOSDriver driver = null;
    try {
      IOSCapabilities cap = SampleApps.intlMountainsCap("de");
      driver = new RemoteIOSDriver(getRemoteURL(), cap);

    } finally {
      if (driver != null) {
        driver.quit();
      }
    }

  }

}
