package org.example;

public class StringInverter implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        StringBuilder reversed = new StringBuilder(drink.getText()).reverse();
        drink.setText(reversed.toString());
    }
}
