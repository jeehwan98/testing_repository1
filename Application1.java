package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {
        /* [ 데이터 형변환이 필요한 이유 ]
        * 자바에서는 같은 데이터 타입끼리만 연산을 수행할 수 있기 때문인\이다.
        * */


        /* 1. 자동형변환 (목시적 형변환) */
        /* 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환된다. */
        /* 1-1-1. 정수끼리의 자동 형변환 */
        byte bnum = 1;
        short snum = bnum;  // byte bnum 은 자동으로 short 으로 변환이 됐다.
        int inum = snum;    // 마찬가지
        long lnum = inum;   // 마찬가지


        int num1 = 10;
        long num2 = 100;
//      int result = num1 + num2; // type 이 안맞으면 작은게 큰 형태로 변환이 되지만,,, int result 에서 int 로 지정을 했기 때문에 error 가 뜨는 것이다
//      ** remember to write the longer type before printing
        long result = num1 + num2;
        System.out.println("result : " + result );


        /* 1-1-2.실수끼리의 자동 형변환 */
        float fnum = 4.0f; // float 쓸 때 뒤에 f 붙인다
        double dnum = fnum; // 큰 형태로 변환이 된다
        double result2 = fnum + dnum;
        System.out.println("result2 : " + result2);


        /* 1-2. 정수는 실수로 자동 형변환 된다. */
        long eight = 8;
        float four = eight;
        System.out.println("four : " + four); // float 으로 변환을 했기 때문에
        float result3 = eight + four;
        System.out.println("result 3 : " + result3);
        System.out.println("test : " + (eight + four));


        /* 1-3. 뮨자형은 int 형으로 자동 형변환된다. */
        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber : " + charNumber); // because it is an int

        char ch2 = 100;
        System.out.println("ch2 : " + ch2); // cause it's a char


        /* 1-4. 논리형은 형변환 규칙에서 제외된다. */
        boolean isTrue = true;
//        byte b = isTrue;
//        short s = isTrue;
//        int i = isTrue;
//        long l = isTrue;
//        논리형이기 때문에 넣지를 못하는 것이다
//        char c = isTrue;
//        float f = isTrue;
//        double d = isTrue;

    }
}
