/**
 *  번호: 1018
 *  날짜: 2022-04-
 *  제목: 체스판 다시 칠하기
 *  링크: https://www.acmicpc.net/problem/1018
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RepaintTheChessboard { // RepaintTheChessboard
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt(); // 가로
        // int M = sc.nextInt(); // 세로

        int M = Integer.parseInt(br.readLine());
        int N = 2;
        char[][] chessBoard = new char[M][N];
        int changeCnt = 0;

        for(int i = 0; i < M ; i++) {
            for(int j = 0; j < N ; j++) {
                chessBoard[i] = br.readLine().toChar();
            }
            System.out.println(chessBoard[i]);
        }

        // for(int i = 0; i < M ; i++) {
        //     for(int j = 0; j < N ; j++) {
        //         if(i == 0 && j == 0) {
        //             continue;
        //         }
        //        if (chessBoard[i][j] ==  chessBoard[i][j + 1]) {
        //            changeCnt++;
        //        }
        //     }
        // }
        // System.out.println(changeCnt);

        
    }
}
