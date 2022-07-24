package com.arthurmrt.easy;

import java.util.*;

//13. Roman to Integer
public class RomanToInteger {

    //roman digits
    private static final int I = 1;
    private static final int V = 5;
    private static final int X = 10;
    private static final int L = 50;
    private static final int C = 100;
    private static final int D = 500;
    private static final int M = 1000;

    //roman digit's exceptions
    //I can be placed before V (5) and X (10) to make 4 and 9.
    private static final int IV = 4;
    private static final int IX = 9;
    //X can be placed before L (50) and C (100) to make 40 and 90.
    private static final int XL = 40;
    private static final int XC = 90;
    //C can be placed before D (500) and M (1000) to make 400 and 900.
    private static final int CD = 400;
    private static final int CM = 900;


    public int romanToInteger(String roman) {
        char[] romanChars = roman.toCharArray();
        int accumulator = 0;

        boolean isSubtraction = false;
        for (int i = 0; i < romanChars.length; i++) {
            //check special cases
            if (isSubtraction) {
                isSubtraction = false;
                continue;
            }
            int actualInt = convertRomanCharToInt(romanChars[i]);

            if ((i + 1) < romanChars.length) {
                int nextInt = convertRomanCharToInt(romanChars[i + 1]);
                if (actualInt < nextInt) {
                    accumulator += nextInt - actualInt;
                    isSubtraction = true;
                    continue;
                }
            }

            accumulator += actualInt;
        }
        return accumulator;
    }

    private int convertRomanCharToInt(char romanChar) {
        switch (romanChar) {
            case 'I':
                return I;
            case 'V':
                return V;
            case 'X':
                return X;
            case 'L':
                return L;
            case 'C':
                return C;
            case 'D':
                return D;
            case 'M':
                return M;
            default:
                throw new IllegalArgumentException(romanChar + "It's not correct roman digit1");
        }
    }

    //эффективный алгоритм
    public int romanToInt(String s) {

        LinkedHashMap<String, Integer> romanValues = new LinkedHashMap<String, Integer>();

        romanValues.put("I", 1);
        romanValues.put("V", 5);
        romanValues.put("X", 10);
        romanValues.put("L", 50);
        romanValues.put("C", 100);
        romanValues.put("D", 500);
        romanValues.put("M", 1000);

        List<String> romanList = new ArrayList<String>(romanValues.keySet());
        int result = 0;
        int length = s.length();
        for(int i = 0; i < length; i++){
            if(i+1 < length && romanList.indexOf(Character.toString(s.charAt(i))) < romanList.indexOf(Character.toString(s.charAt(i+1)))){
                result -= romanValues.get(Character.toString(s.charAt(i)));
            }else{
                result += romanValues.get(Character.toString(s.charAt(i)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("MCMXCIV".charAt(100));
    }
}
