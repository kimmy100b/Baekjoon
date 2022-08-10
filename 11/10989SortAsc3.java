/**
 *  번호: 10989
 *  날짜: 2022-08-10
 *  제목: 수 정렬하기3
 *  링크: https://www.acmicpc.net/problem/10989
 * 
 */

 /*

이 문제는 시간 제한, 메모리 제한을 신경써야한다.
수 정렬하기2에서 푼 코드를 가져와 제출하였을 때 Array.sort()를 사용한 코드는 통과되었지만 Collections.sort()를 사용한 코드는 메모리 초과로 통과되지 못하였다.
Array.sort() 외 다른 방법이 없을까 보는 중 카운팅정렬을 사용하는 방법을 보았다.
카운팅정렬의 시간복잡도는 O(N + K)로 K는 자릿수를 의미한다. 입력데이터가 K 보다 훨씬 큰 경우, 즉 데이터가 많으면 많을수록 O(N) 에 가깝기 때문에 이상적으로는 O(N) 이라고 보아도 무방하다. 

  */

 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class SortAsc3 { // SortAsc3
    public static void main(String[] args) throws IOException {
        // 수의 범위 (0 ~ 10000) 사실상 0은 제외
        int[] cnt = new int[10001];
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
 
        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            cnt[Integer.parseInt(br.readLine())] ++;
        }
 
        br.close();
 
        StringBuilder sb = new StringBuilder();
 
        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0이 될 때 까지 출력 (빈도수를 의미)
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}