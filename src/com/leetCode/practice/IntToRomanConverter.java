//package com.leetCode.practice;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class IntToRomanConverter {
//    public String intToRoman(int num) {
//        StringBuilder result = new StringBuilder("");
//        List<String> romanNumList = Arrays.asList("M", "D", "C", "L", "X", "V", "I");
//        List<Integer> valueList = Arrays.asList(1000, 500, 100, 50, 10, 5, 1);
//        for (int i = 0; i < valueList.size(); i++) {
//            int multiple = num / valueList.get(i);
//            if (i > 0 && (num < valueList.get(i) && num > valueList.get(i - 1)) && multiple > 0) {
//
//            } else if (multiple > 0) {
//                result.append(romanNumList.get(i).repeat(multiple));
//                num -= (valueList.get(i) * multiple);
//            }
//        }
//        return result.toString();
//    }
//
//    public static void main(String[] args) {
//        IntToRomanConverter instance = new IntToRomanConverter();
//        System.out.println(instance.intToRoman(9));
//    }
//}
