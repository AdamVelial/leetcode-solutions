package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DerangingAnIPAAddressTest {

    /**
     * Input: address = "1.1.1.1"
     * Output: "1[.]1[.]1[.]1"
     */
    @Test
    void defangIPaddr() {
        DerangingAnIPAAddress derangingAnIPAAddress = new DerangingAnIPAAddress();

        assertEquals("1[.]1[.]1[.]1", derangingAnIPAAddress.defangIPaddr( "1.1.1.1"));
    }

    /**
     * Input: address = "255.100.50.0"
     * Output: "255[.]100[.]50[.]0"
     */
    @Test
    void defangIPaddr2() {
    }
}