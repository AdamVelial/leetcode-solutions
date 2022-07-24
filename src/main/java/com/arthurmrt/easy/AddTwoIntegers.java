package com.arthurmrt.easy;

//2235. Add Two Integers
public class AddTwoIntegers {
    public int sum(int num1, int num2) {
        int a = num1, b = num2, carry = 0, additions =  0;
        do {
            carry = a & b;
            additions = a ^ b;

            a = additions;
            b = carry << 1;
        }while (carry != 0);
        return additions;
    }

    public static void main(String[] args) {
        int a = -5, b = 5, carry = 0, additions =  0;
        do {
            carry = a & b;
            additions = a ^ b;

            a = additions;
            b = carry << 1;
        }while (carry != 0);
        System.out.println(additions);
    }

    private static void binarySum() {
        int i1 = 3, i2 = 1, carry = 0, xor = 0;

        System.out.println(Integer.toBinaryString(i1));
        System.out.println("0" + Integer.toBinaryString(i2));

        // AND find out carry
        carry = i1 & i2; // 1 & 1 = 1, 1 & 0 = 0, 0 & 1 = 0, 0 & 0 = 0
        System.out.println("0" + Integer.toBinaryString(carry)); //01

        //XOR additions
        xor = i1 ^ i2; // 1 & 1 = 0, 1 & 0 = 1, 0 & 1 = 1, 0 & 0 = 0
        System.out.println(Integer.toBinaryString(xor)); //10

        //<<
        int shiftedCarry = carry << carry;
        System.out.println(Integer.toBinaryString(shiftedCarry)); //10

        // AND
        int response = xor & shiftedCarry;
        System.out.println(Integer.toBinaryString(response));

        //...
    }
}
