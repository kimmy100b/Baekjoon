/**
 *  번호: 9012
 *  날짜: 2022-07-25
 *  제목: 괄호
 *  링크: https://www.acmicpc.net/problem/9012
 * 
 */

import java.io.IOException;
import java.util.*;

class IsCollectBracket {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] strArr = new String[N];

        for(int i = 0 ; i < N ; i++) {
            strArr[i] = sc.next();
            String[] str = strArr[i].split("");
            Stack<String> bracketStack = new Stack<String>();
            for(int j = 0 ; j < str.length ; j++) {
                switch(str[j]) {
                    case "(":
                        bracketStack.push("(");
                        break;
                    case ")":
                        if(bracketStack.peek() == "(") {
                            bracketStack.pop();
                        }
                        break;
                    default:
                        System.out.println("ERROR : Input string made up '(', ')'");
                }
            }
            if(bracketStack.size() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}