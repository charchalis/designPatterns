package org.example;

public class StringReplacer implements StringTransformer {

    private char oldChar;
    private char newChar;

    public StringReplacer(char oldChar, char newChar) {
        this.oldChar = oldChar;
        this.newChar = newChar;
    }

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String newText = "";
        for(char c: text.toCharArray()){
            newText += c == oldChar ? newChar : c;
        }
        drink.setText(newText);
    }
}
