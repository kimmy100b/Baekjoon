/**
 *  번호: 2798
 *  날짜: 2022-04-11
 *  제목: 블랙잭
 *  링크: https://www.acmicpc.net/problem/2798
 * 
 */

import java.util.*;

class Jack {
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 카드의 개수
        int m = sc.nextInt();
        int[] num = new int[n];
        int nearSum = -1;
        int diff = 99999;

        for(int i = 0 ; i < n ; i++) {
            num[i] = sc.nextInt();
        }

        for(int a = 0; a < n - 2 ; a++) {
            for(int b = a + 1; b < n - 1 ; b++) {
                for(int c = b + 1; c < n ; c++) {
                    int sum = num[a] + num[b] + num[c];
                    if(Math.abs(sum - m) <= diff && sum <= m) {
                        diff = Math.abs(sum - m);
                        nearSum = sum;
                    }
                }
            }
        }

        System.out.println(nearSum);    
    }
}