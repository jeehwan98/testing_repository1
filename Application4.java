package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {
        /* 형변환 사용 시 주의할 점 : 데이터 손실에 유의해야 한다. */

        /* 1. 의도하지 않은 데이터 손실 */
        int inum = 300;
        byte bnum = (byte) inum;
        System.out.println("inum : " + inum);   // 300
        System.out.println("bnum : " + bnum);   // 44? 강제로 형변환을 하면 예측을 할 수 없는 값이 나온다...
//      int > byte형으로 변환을 하기 때문에 overflow? ... 3byte의 내용이 날라가기 때문에 데이터가 유실 해지는 것이다.

        /* 2. 의도한 데이터 손실 */

        double weight = 10.9234567890;
        int floorWeight = (int) weight; // double > integar
        System.out.println("weight : " + weight);
        System.out.println("floorWeight : " + floorWeight); // 소수점 절삭을 위해 형변환을 이용할 수 있음
    }
}
