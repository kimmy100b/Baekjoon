/**
 *  번호: 10814
 *  날짜: 2022-06-08
 *  제목: 나이순 정렬
 *  링크: https://www.acmicpc.net/problem/10814
 * 
 */

import java.io.IOException;
import java.util.Scanner;

class SortAge {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] usrArr = new String[N][2];

        for(int i = 0; i < N; i++){
            int age = sc.nextInt();
            usrArr[i][0] = String.valueOf(age);
            usrArr[i][1] = sc.nextLine();
        }

        for(int i = 0; i < N; i++){
            String[] temp = new String[N];
            for(int j = i + 1; j < N; j++) {
                if(Integer.valueOf(usrArr[i][0]) > Integer.valueOf(usrArr[j][0])) {
                    temp = usrArr[i];
                    usrArr[i] = usrArr[j];
                    usrArr[j] = temp;
                }
            }
            System.out.println(usrArr[i][0] + " " + usrArr[i][1]);
        }
    }
}