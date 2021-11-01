package com.pattern.creational.factorymethod2.factory;

import com.pattern.creational.factorymethod2.buttons.Button;
import com.pattern.creational.factorymethod2.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
