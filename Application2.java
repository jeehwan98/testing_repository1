package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("==== 정수와 정수의 연산 ====");
        System.out.println(123 + 456);
        System.out.println(100 - 50);
        System.out.println(10 * 20);
        System.out.println(35 / 10); // only int is printed, not float or decimal points
        System.out.println(35 % 10); // only prints out the remainder
        System.out.println("123" + "456"); // numbers act as a string, therefore not adding up but together


        System.out.println("==== 실수와 실수의 연산 ====");
        System.out.println(1.23 + 4.56);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0); // 약간의 오차가 생긴다.

// 정수와 실수 연산의 결과는 항상 실수가 나온다
        System.out.println("==== 정수와 실수의 연산 ====");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);


        System.out.println("==== 문자와 문자의 연산 ====");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
//      *** ASCII code eg) a = 97, b = 98 *** 그렇기 때문에 연산이 가능하다

//      동일함
        System.out.println("==== 문자와 정수의 연산 ====");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 1);
        System.out.println('a' / 2);
        System.out.println('a' % 2);


        System.out.println("==== 문자와 실수의 연산 ====");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 1.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);


        System.out.println("==== 문자열과 문자열의 연산");
        System.out.println("hello" + " " + "jee");
//        System.out.println("hello" - "jee"); error
//        System.out.println("hello" * "jee"); error
//        System.out.println("hello" / "jee"); error
//        System.out.println("hello" % "jee"); error


        System.out.println("==== 문자열과 다른 형태의 값 연산 ====");
        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true); //전부 문자로 처리가 된다


        System.out.println("==== 논리와 논리의 연산");
//        System.out.println(true + false); +,-,*,/,% 연산 cannot be applied to boolean
//        System.out.println(true - false); //에러 발생
//        System.out.println(true * false); //에러 발생
//        System.out.println(true / false); //에러 발생
//        System.out.println(true % false); //에러 발생


        System.out.println("==== 논리와 정수의 연산");
//      System.out.println(true + 1); //에러 발생
//      System.out.println(true - 1); //에러 발생
//      System.out.println(true * 1); //에러 발생
//      System.out.println(true / 2); //에러 발생
//      System.out.println(true % 2); //에러 발생

        System.out.println(true + "a"); //논리 + 문자열만 연산이 가능하다
    }

    }
