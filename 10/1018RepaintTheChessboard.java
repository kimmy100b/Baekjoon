/**
 *  번호: 1018
 *  날짜: 2022-08-08
 *  제목: 체스판 다시 칠하기
 *  링크: https://www.acmicpc.net/problem/1018
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class RepaintTheChessboard { // RepaintTheChessboard
    // 상단 좌측이 하얀색으로 시작하는 체스판
    private static final boolean[][] WHITE = {
        { true, false, true, false, true, false, true, false },
        { false, true, false, true, false, true, false, true },
        { true, false, true, false, true, false, true, false },
        { false, true, false, true, false, true, false, true },
        { true, false, true, false, true, false, true, false },
        { false, true, false, true, false, true, false, true },
        { true, false, true, false, true, false, true, false },
        { false, true, false, true, false, true, false, true },
    };

    // 상단 좌측이 검은색으로 시작하는 체스판
    private static final boolean[][] BLACK = {
        { false, true, false, true, false, true, false, true },
        { true, false, true, false, true, false, true, false },
        { false, true, false, true, false, true, false, true },
        { true, false, true, false, true, false, true, false },
        { false, true, false, true, false, true, false, true },
        { true, false, true, false, true, false, true, false },
        { false, true, false, true, false, true, false, true },
        { true, false, true, false, true, false, true, false },
    };

    // 체스판
    private static boolean[][] board;
    /**
     * 메인 함수
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] temp = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        // 세로 길이
        int N = temp[0];
        
        // 가로 길이
        int M = temp[1];
        
        board = new boolean[N][M];
        
        for (int n = 0; n < N; n++)
        {
            String[] line = reader.readLine().split("");
            
            for (int m = 0; m < M; m++)
            {
                board[n][m] = line[m].equals("W");
            }
        }
        
        // 결과
        int result = Integer.MAX_VALUE;
        
        // 1 ~ 8까지 총 8칸을 전달하므로 최대값에서 8을 뺀다.
        for (int n = 0; n < N - 8; n++)
        {
            for (int m = 0; m < M - 8; m++)
            {
                int count = solve(n, m);
                
                if (result > count) // 현재 결과보다 더 작은 수일 경우
                {
                    result = count;
                }
            }
        }
        
        writer.write(Integer.toString(result));
        writer.newLine();
        writer.close();
        reader.close();
    }

    /**
     * 새로 덧칠할 칸의 갯수 반환 함수
     *
     * @param x: [int] x의 시작좌표
     * @param y: [int] y의 시작좌표
     *
     * @return [int] 새로 덧칠할 칸의 갯수
     */
    private static int solve(int x, int y)
    {
        int white = 0;
        int black = 0;
        
        for (int n = x; n < x + 8; n++)
        {
            for (int m = y; m < y + 8; m++)
            {
                // 하얀색으로 시작하는 체스판과 비교
                if (board[n][m] != WHITE[n - x][m - y])
                {
                    white++;
                }
                
                // 검은색으로 시작하는 체스판과 비교
                if (board[n][m] != BLACK[n - x][m - y])
                {
                    black++;
                }
            }
        }
        
        // 둘 중 더 적게 칠할 수 있는 체스판의 값을 반환
        return Math.min(white, black);
    }
}
