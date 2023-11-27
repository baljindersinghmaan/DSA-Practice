package com.baljinder.dsapractice;
// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class PrintPattren {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        pattern1(4);
        System.out.println("Pattern 2");
        pattern2(4);
        System.out.println("Pattern 3");
        pattern3(4);
        System.out.println("Pattern 4");
        pattern4(4);
        System.out.println("Pattern 5");
        pattern5(5);
        System.out.println("Pattern 6");
        pattern6(5);
        System.out.println("Pattern 7");
        pattern7(5);

    }
    static void pattern1(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 0; i < n * 2 ; i++) {
            int totalCol = i > n ? 2 * n- i : i;
            for (int j = 0; j < totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n-1-i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");
            }
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
