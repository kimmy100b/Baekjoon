/**
 *  번호: 2231
 *  날짜: 2022-04-18
 *  제목: 분해합
 *  링크: https://www.acmicpc.net/problem/2231
 * 
 */

import java.util.*;

class DigitGenerator { // Digit Generator
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= M ; i++) {
            int sum = i;
            String[] strNum = String.valueOf(i).split("");
            int[] num = new int[strNum.length];
            for(int j = 0; j < num.length ; j++) {
                num[j] = Integer.parseInt(strNum[j]);
                sum += num[j];
            }

            if(sum == M) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
