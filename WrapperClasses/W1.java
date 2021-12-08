package com.WrapperClasses;

// Write a java program that generates the minimum and maximum value for each of the Numeric Wrapper classes
//  (Byte, Short, nteger, Long, Float, Double)
//
//Sample Output:
//Integer range:
//Max: -2147483648
//max: 2147483647
//Double range:
//Max: 4.9E-324
//max: 1.7976931348623157E308
//Long range:
//Max: -9223372036854775808
//max: 9223372036854775807
//Short range:
//Max: -32768
//max: 32767
//Byte range:
//Max: -128
//max: 127
//Float range:
//Max: 1.4E-45
//max: 3.4028235E38
public class W1 {
    public static void main(String[] args) {
        System.out.println("Integer ");
        System.out.println("Max "+Integer.MAX_VALUE);
        System.out.println("Min "+Integer.MIN_VALUE);
        System.out.println("Double range");
        System.out.println("Max "+Double.MAX_VALUE);
        System.out.println("Min "+Double.MIN_VALUE);
        System.out.println("Long range");
        System.out.println("Max "+Long.MAX_VALUE);
        System.out.println("Min "+Long.MIN_VALUE);
        System.out.println("Short range");
        System.out.println("Max "+Short.MAX_VALUE);
        System.out.println("Min "+Short.MIN_VALUE);
        System.out.println("Byte range");
        System.out.println("Max "+Byte.MAX_VALUE);
        System.out.println("Min "+Byte.MIN_VALUE);
        System.out.println("Float range");
        System.out.println("Max "+Float.MAX_VALUE);
        System.out.println("Min "+Float.MIN_VALUE);
    }
}
