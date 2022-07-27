package com.arthurmrt.easy;

//1108. Defanging an IP Address
public class DerangingAnIPAAddress {
    public String defangIPaddr(String address) {
        char[] ans = new char[address.length() + 6];

        for (int i = 0, j = 0; i < address.length(); i++, j++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                ans[j] = '[';
                ans[++j] = '.';
                ans[++j] = ']';
            } else {
                ans[j] = ch;
            }
        }

        return String.valueOf(ans);
    }
}
