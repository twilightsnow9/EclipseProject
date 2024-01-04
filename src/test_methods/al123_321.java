package test_methods;

import java.util.Scanner;

public class al123_321 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个三位正整数");
		int n=in.nextInt();
		int a=n/100;
		int b=n/10%10;
		int c=n%10;
		System.out.println("倒序整数为："+c*100+b*10+a);
			
		

	}

}
