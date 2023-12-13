package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {

        /* 1. 숫자 형태의 값 */
        /* 1-1. 정수 형태의 값 */
        System.out.println(123);
        /* 1-2. 실수 형태의 값 */
        System.out.println(1.23);

        /* 2. 논리 형태의 값 */
        System.out.println(true);
        System.out.println(false);

        /* 3. 문자형 형태의 값 */
//        System.out.println('');   // 아무 문자도 기록되지 않는 경우 에러가 발생한다.
        System.out.println('a');    // 문자형 형태의 값은 홑따옴표(single-quotation)으로 감싸주어야 한다.
//        System.out.println('abc');// 두 개 이상은 문자형으로 취급하지 않으므로 에러가 발생한다.
        System.out.println('1');    // 숫자값이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.

        /* 4. 문자열 형태의 값 */
        System.out.println("");     // 아무 없는 빈 쌍따옴표도 문자열로 취급한다.
        System.out.println("a");    // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다. (위에 쓴 문자형 'a'와는 다르다.)
        System.out.println("abc");  // 문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표(double-quotation)으로 감싸주어야 한다.
        System.out.println("123412389057214895798345679834579812345798213");

    }

}
