package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /* [ 강제 형변환 ]
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        * (바꿀자료형) 값;
        *  */

        /* 2-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다. */
        /* 2-1-1. 정수끼리의 강제 형변환 */
        long lnum = 8;
//      int inum = lnum; // 데이터 손실 가능성이 있으므로 자동 형변환되지 않는다
        int inum = (int) lnum;
        short snum = (short) inum;
        byte bnum = (byte) snum;

        /* 2-1-2. 실수끼리의 강제 혀변환 */
        double dnum = 8.0;
//      float fnum = dnum; // 데이터 손실 가능성이 있으므로 컴파일 에러가 발생한다.
        float fnum = (float) dnum;

        /* 2-2. 실수를 정수로 변경 시 강제 형변환이 필요하다. */
        float fnum2 = 4.0f;
//      long lnum2 = fnum2; // add long just in front of the fnum2 to change float to long
//        float는 4byte, long은 8byte임에도 자동 형변환 불가능하다. (소수점 자리 이하의 데이터 손실 가능성.)
        long lnum2 = (long) fnum2;


        /* 2-3. 문자형을 int형 미만 크기의 변수에 저장하려면 강제 형변환이 필요하다. */
        char ch = 'a';
//      short snum2 = ch; // 같은 2byte의 크기이지만, 부호비트로 인한 값의 범위가 다르기 때문에 강제 형변환이 필요하다.
        short snum2 = (short) ch;
        byte bnum2 = (byte) ch; //

        /* (추가) 정수를 char 자료형에 강제 형변환해서 대입하기 */
        int num1 = 97;
        int num2 = -97;

//      char ch2 = num1; // 큰 자료형 > 작은 자료형 ... 그렇기 때문에 강제 형변환을 해야한다.
        char ch2 = (char) num1;
        char ch3 = (char) num2; // 음수도 강제로 형변환 하면 대입을 할 수 있다
        System.out.println("ch2 : " + ch2);
        System.out.println("ch3 : " + ch3);

        /* 2-4. 논리형은 강제 형변환 규칙에서도 제외된다. */
        boolean isTrue = true;
//      byte b = (byte) isTrue;
//      short s = (short) isTrue;
//      int i = (int) isTrue;
//      float f = (float) isTrue;
//      double d = (double) isTrue;
//      char c = (char) isTrue;
//      다 같은 이유로 실행이 되지 않는다





    }
}
