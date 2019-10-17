package Ch01;

import java.util.Scanner;

public class _0101_Max3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("세 정수의 최대값");
	System.out.println("a : "); int a = sc.nextInt();
	System.out.println("b : "); int b = sc.nextInt();
	System.out.println("c : "); int c = sc.nextInt();
	
	int max = a;
	if( b > max ) max = b;
	if( c > max ) max = c;
	
	System.out.printf("최대값은 %d 입니다.", max);
}
}
