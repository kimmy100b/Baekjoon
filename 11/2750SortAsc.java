/**
 *  번호: 2750
 *  날짜: 2022-05-26
 *  제목: 수 정렬하기
 *  링크: https://www.acmicpc.net/problem/2750
 * 
 */

import java.io.IOException;
import java.util.Scanner;

class SortAsc {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] sortArr = new int[N];

        for(int i = 0; i < N; i++){
            sortArr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            int temp = -1;
            for(int j = i + 1; j < N; j++) {
                if(sortArr[i] > sortArr[j]) {
                    temp = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
            System.out.println(sortArr[i]);
        }
    }
}