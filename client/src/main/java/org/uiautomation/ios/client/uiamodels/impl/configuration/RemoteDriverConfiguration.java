/*
 * Copyright 2012 ios-driver committers.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.uiautomation.ios.client.uiamodels.impl.configuration;

import org.uiautomation.ios.UIAModels.configuration.CommandConfiguration;
import org.uiautomation.ios.UIAModels.configuration.DriverConfiguration;
import org.uiautomation.ios.client.uiamodels.impl.RemoteIOSDriver;
import org.uiautomation.ios.communication.WebDriverLikeCommand;

public class RemoteDriverConfiguration implements DriverConfiguration {

  private final RemoteIOSDriver driver;

  public RemoteDriverConfiguration(RemoteIOSDriver driver) {
    this.driver = driver;
  }

  @Override
  public CommandConfiguration configure(WebDriverLikeCommand command) {
    return new RemoteCommandConfiguration(command, driver);
  }

}
