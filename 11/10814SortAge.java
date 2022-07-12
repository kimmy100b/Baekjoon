/**
 *  번호: 10814
 *  날짜: 2022-07-12
 *  제목: 나이순 정렬
 *  링크: https://www.acmicpc.net/problem/10814
 * 
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.*;
 

class SortAge { // SortAge
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 클래스 배열 생성
		User[] userList = new User[N];

        for(int i = 0; i < N; i++){
            int age = sc.nextInt();
            String name = sc.nextLine();
            userList[i] = new User(age, name);
        }

        Arrays.sort(userList); // compareTo 함수가 없으면 ERROR
        
        for (User usr : userList) {
            System.out.println(usr.toString());
        }
    }
}

class User implements Comparable<User> {
    private int age;
    private String name;

    User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User usr)
    {
        if (this.age != usr.getAge()) {
            return this.age - usr.getAge();
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.age + this.name;
    }
}