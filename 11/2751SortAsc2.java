/**
 *  번호: 2751
 *  날짜: 2022-08-08 ~ 2022-08-10
 *  제목: 수 정렬하기2
 *  링크: https://www.acmicpc.net/problem/2751
 * 
 */

/*

Arrays.sort()의 경우 평균 시간복잡도가 O(nlogn)이고 매우 빠른 알고리즘이지만, 최악의 경우 시간복잡도는 O(n^2)이다. 
따라서, Collections.sort()를 사용해 문제를 풀어야한다.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class SortAsc2 { // SortAsc2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for(int i = 0; i < N; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numList);

        for(int item : numList) {
            sb.append(item).append('\n');
        }
        System.out.println(sb);
    }
}

/*

Arrays.sort()는 worst case의 속도가 Arrays.sort(int) < Arrays.sort(Integer)이다.
데이터 타입이 primitive 일 때 Arrays.sort는 Quick sort를 사용하지만, 
Integer와 같은 객체일 때는 Merge sort를 사용하기 때문이다.
worst case일 때, Quick sort는 시간복잡도는 O(n^2)이지만, Merge sort는 시간복잡도가 O(nlogn)이기 때문에
Arrays.sort(Integer)를 사용해서 풀 수도 있다.

참고: https://dev-coco.tistory.com/151 [슬기로운 개발생활:티스토리]

*/
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class SortAsc2 { // SortAsc2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];

        for(int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        for(int i = 0; i < N; i++) {
            sb.append(numArr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
 */