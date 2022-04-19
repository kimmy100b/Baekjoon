/**
 *  번호: 7568
 *  날짜: 2022-04-19
 *  제목: 덩치
 *  링크: https://www.acmicpc.net/problem/7568
 * 
 */

import java.util.*;

class BigSize { // BigSize
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[][] arr = new int[M][2];
        int[] rank = new int[M];

        for(int i = 0; i < M; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            rank[i] = 1;
        }

        for(int i = 0; i < M ; i++) {
            for(int j = 0; j < M ; j++) {
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { // if 두 번을 and로 변경하기
                    rank[i]++;
                }
            }
            System.out.print(rank[i]+" "); // for문을 다시 돌려서 출력하는 것이 아니라 여기에다가 결과값 출력하기 - 이미 rank는 결정됨
        }
    }
}