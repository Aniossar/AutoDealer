package com.company.carscubaplatform.web.screens.legalpersonalinfo;


import com.haulmont.cuba.gui.components.Formatter;

public class PhoneFormatter implements Formatter<String> {
    @Override
    public String format(String value) {
        if (value != null && value.length() == 7) {
            value = value.substring(0, 3) + " " + value.substring(3, 5) + " " + value.substring(5);
            value = "+7 846 " + value;
        }
        return value;
    }
}
