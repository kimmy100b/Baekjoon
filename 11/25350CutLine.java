/**
 *  번호: 25305
 *  날짜: 2022-08-10
 *  제목: 커트라인
 *  링크: https://www.acmicpc.net/problem/25305
 * 
 */

/*
// 카운팅 정렬, BufferedReader 사용하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
class CutLine { // CutLine
    public static void main(String[] args) throws IOException {
        int[] score = new int[10001]; // 점수의 범위 (0 ~ 10000)
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 학생 인원수 | 몇 번째까지 합격인지
        int[] inputScore = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
 
        for (int i = 0; i < info[0]; i++) {
            score[inputScore[i]]++;
        }
        br.close();

        int count = 0;
        int i = 10001;
        
        while(info[1] > count) {
            i--;
            if(score[i] > 0) {
                while(score[i] > 0) { // 같은 점수가 2명 이상이 받았을 경우
                    count++;
                    score[i]--;
                }
            }
        };
        System.out.println(i);
    }
}
*/

// 날짜: 2022-08-12 : Scanner와 Colleaction 사용하기
import java.util.Scanner;
import java.io.IOException;
import java.util.*;
 
class CutLine { // CutLine
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 학생 인원수
        int K = sc.nextInt(); // 몇 번째까지 합격인지
        ArrayList<Integer> scoreList = new ArrayList<>();
 
        for (int i = 0; i < N; i++) {
            scoreList.add(sc.nextInt());
        }

        Collections.sort(scoreList, Collections.reverseOrder());

        System.out.println(scoreList.get(K - 1));
    }
}