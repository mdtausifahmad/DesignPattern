package com.pattern.creational.factorymethod2.factory;

import com.pattern.creational.factorymethod2.buttons.Button;
import com.pattern.creational.factorymethod2.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
