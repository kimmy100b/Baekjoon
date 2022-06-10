/**
 *  번호: 10815
 *  날짜: 2022-06-10
 *  제목: 숫자 카드
 *  링크: https://www.acmicpc.net/problem/10815
 * 
 */

/**
// 시간초과 - 선형탐색으로 탐색할 경우 시간 복잡도가 ON(MN)이다. 이진탐색으로 탐색해야한다.
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

class NumberCard {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] usrCard = new int[N];
        for(int i = 0; i < N; i++){
            usrCard[i] = sc.nextInt();
        }
        
        int M = sc.nextInt();
        int[] compareCard = new int[M];
        for(int i = 0; i < M; i++){
            compareCard[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++){
            int key = compareCard[i];
            int result = Arrays.stream(usrCard).anyMatch(x -> x == key) ? 1 : 0;
            System.out.print(result + " ");
        }
    }
}
*/

/* 참고한 코드
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
 
        int N = Integer.parseInt(br.readLine()); // 카드의 개수
        int[] cards = new int[N];
 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
 
        Arrays.sort(cards); // 이분탐색할 배열은 정렬되어 있어야 함.
        int M = Integer.parseInt(br.readLine()); // 구별할 수의 개수
 
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, N, temp) + " ");
        }
 
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
    public static int binarySearch(int[] cards, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid = 0;
 
        while (first <= last) {
            mid = (first + last) / 2; // 중간 인덱스
 
            if (cards[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
                return 1;
            }
 
            if (cards[mid] < search) { // 중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요 없음.
                first = mid + 1;
            } else { // 중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음.
                last = mid - 1;
            }
        }
 
        return 0;
    }
 
}
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

class NumberCard {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] usrCard = new int[N];
        for(int i = 0; i < N; i++){
            usrCard[i] = sc.nextInt();
        }

        Arrays.sort(usrCard);
        
        int M = sc.nextInt();
        int[] result = new int[M];
        for(int i = 0; i < M; i++){
            int compareNum = sc.nextInt();
            result[i] = getContainCard(usrCard, N, compareNum);
        }

        for(int i = 0; i < M; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int getContainCard(int[] cards, int N, int search) {
        int start = 0;
        int last = N - 1;
        int mid = 0;

        
        while(start <= last) {
            mid = (start + last) / 2;
            if(cards[mid] == search) {
                return 1;
            }

            if(cards[mid] < search) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return 0;
    }
}