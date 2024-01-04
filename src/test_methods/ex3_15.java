package test_methods;

import java.util.Scanner;

public class ex3_15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner ins =new Scanner(System.in);
		System.out.println("请输入一个数");
		int n = ins.nextInt();
		if (isPrime(n))
		System.out.print(n + "是质数");
		else
			System.out.print("不是质数");
	}	
		static boolean isPrime(int n) {
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
			

	}

}
