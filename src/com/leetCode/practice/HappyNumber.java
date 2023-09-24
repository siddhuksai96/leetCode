package com.leetcode.practice;

public class HappyNumber {
    public boolean isHappy(int n) {
        int temp = 0, sum = 0;
        while (n != 1) {
            if (n > 99)
                temp = n;
            while (n > 0) {
                sum += (int) Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = sum;
            sum=0;
            if (n == temp)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        HappyNumber instance = new HappyNumber();
        instance.isHappy(59);
    }
}