package com.ohgiraffers.section05.typecasting;

public class Application3 {
    public static void main(String[] args) {
        /* [ 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다. ] */
        int inum = 10;
        long lnum = 100;


        /* 1. 두 수의 연산 결과를 int형으로 변환 후, int 자료형 변수에 담기 */
//      int isum = inum +lnum; // 오른쪽에서는 long 으로 변환이 됐지만, int (작은 형태)로 변환을 할려고 하니까 오류가 나는 것이다.
        int isum = (int) (inum +lnum); // 같은 형태인 int 형으로 변환을 한다
        System.out.println("isum : " + isum);


        /* 2. long형 값을 int형으로 강제 형변환하여 연산하기 */
//      int isum2 = inum +lnum; // int = long 불가
        int isum2 = inum + (int) lnum; // long을 int형으로 변환 시켜준다
        System.out.println("isum2 : " + isum2);

                                              /* 둘다 강제 형변환이다 */

        /* 3. 결과 값을 long형으로 받기 (자동 형변환 이용) */
        long lsum = inum + lnum;
        System.out.println("lsum : " + lsum);


        /* 주의! int 미만의 자료형 간 연산 처리 결과는 int형이다. */
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;

//      byte result1 = byteNum1 + byteNum2; // 연산 한 결과 > int형으로 변환이 됨. 그렇기 때문에 ...
        int result1 = byteNum1 + byteNum2; // int로 바꿈
//      short result2 = byteNum1 + shortNum1; // short형을 int형으로 바꾼다
        int result2 = byteNum1 + shortNum1;
        int result3 = shortNum1 + byteNum1;
//      short result4 = shortNum1 + shortNum2; // short형을 int형으로 바꾼다
        int result4 = shortNum1 + shortNum2;

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);




    }

}
