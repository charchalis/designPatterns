package org.example;

public class StringCaseChanger implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String newText = "";
        for(char c: text.toCharArray()){
            newText += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }
        drink.setText(newText);
    }
}
