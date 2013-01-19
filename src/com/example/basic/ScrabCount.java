package com.example.basic;

public class ScrabCount {
    private static String keyboard = "AEIOULNRSTDGBCMPFHVWYKJXQZ";
    private static int[] LetterValue = {1, 2, 3, 4, 5, 8, 10};
    private static char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y'};
    
    public static boolean isValid(String input) {
        boolean containsVowel = false;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (input.charAt(i) == vowels[j]) containsVowel = true;
            } 
        }
        if (containsVowel) return true;
        return false;
    }
    
    public static int indexOfLetter(char z) {
        int keyboardIndex = 0;
        
        for (int i = 0; i < keyboard.length(); i++) {
            if (z == keyboard.charAt(i))
                keyboardIndex = i;
        }
        return keyboardIndex;
    }
    
    public static String getVal(String input) {
        int value = 0;
        if (!isValid(input)) return "'" + input + "'" + " IS NOT A WORD";
        for (int i = 0; i < input.length(); i++) {
            char z = input.charAt(i);
            int j = indexOfLetter(z);
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
        return Integer.toString(value);
    }
    public static String getVal(String input1, String input2) {
        int value1 = 0;
        int value2 = 0;
        int largerVal;
        String largerStr;
        
        if (!isValid(input1) && !isValid(input2)) 
            return "'" + input1 + "'" + "'" + input2 + "'" + " ARE NOT WORDS";
        
        for (int i = 0; i < input1.length(); i++) {
            char z = input1.charAt(i);
            int j = indexOfLetter(z);
            if (j <= 9) value1 = value1 + LetterValue[0];
            else if (j <= 11) value1 = value1 + LetterValue[1];
            else if (j <= 15) value1 = value1 + LetterValue[2];
            else if (j <= 20) value1 = value1 + LetterValue[3];
            else if (j <= 21) value1 = value1 + LetterValue[4];
            else if (j <= 23) value1 = value1 + LetterValue[5];
            else if (j <= 25) value1 = value1 + LetterValue[6];
        }
        for (int n = 0; n < input2.length(); n++) {
            char x = input2.charAt(n);
            int k = indexOfLetter(x);
            if (k <= 9) value1 = value1 + LetterValue[0];
            else if (k <= 11) value2 = value2 + LetterValue[1];
            else if (k <= 15) value2 = value2 + LetterValue[2];
            else if (k <= 20) value2 = value2 + LetterValue[3];
            else if (k <= 21) value2 = value2 + LetterValue[4];
            else if (k <= 23) value2 = value2 + LetterValue[5];
            else if (k <= 25) value2 = value2 + LetterValue[6];
        }
        
        
        if (value1 >= value2) largerVal = value1;
        else largerVal = value2;
        
        if (value1 >= value2) largerStr = input1;
        else largerStr = input2;
        
        if (!isValid(input1) && isValid(input2)) {
            largerVal = value2;
            largerStr = input2;
        }
        
        if (isValid(input1) && !isValid(input2)) {
            largerVal = value1;
            largerStr = input1;
        }
        
        return ("Most points: " + largerStr + " -> " + 
                Integer.toString(largerVal) + " points");
    }
    
    public static void main(String[] args) {
        String val = getVal(args[0], args[1]);
        
        System.out.println(val);
    }
}
