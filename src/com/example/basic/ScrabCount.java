package com.example.basic;

public class ScrabCount {
    private static String keyboard = "AEIOULNRSTDGBCMPFHVWYKJXQZ";
    private static int[] LetterValue = {1, 2, 3, 4, 5, 8, 10};
    
    public static int indexOfz(char z) {
        int keyboardIndex = 0;
        
        for (int i = 0; i < keyboard.length(); i++) {
            if (z == keyboard.charAt(i))
                keyboardIndex = i;
        }
        return keyboardIndex;
    }
    
    public static int getVal(/*boolean doub, boolean trip*/) {
        int value = 0;
        String input = MainActivity.outputOfInput;
        for (int i = 0; i < input.length(); i++) {
            char z = input.charAt(i);
            int j = indexOfz(z);
            if (j <= 9) value = value + LetterValue[0];
            else if (j <= 11) value = value + LetterValue[1];
            else if (j <= 15) value = value + LetterValue[2];
            else if (j <= 20) value = value + LetterValue[3];
            else if (j <= 21) value = value + LetterValue[4];
            else if (j <= 23) value = value + LetterValue[5];
            else if (j <= 25) value = value + LetterValue[6];
        }
        /*
        if (doub) value = value * 2;
        if (trip) value = value * 3;
        */
        return value;
    }
    /*
    public static void main(String[] args) {
        int val = getVal(args[0], Boolean.parseBoolean(args[1]), 
                         Boolean.parseBoolean(args[2]));
        System.out.println(val);   
    }
    */
}