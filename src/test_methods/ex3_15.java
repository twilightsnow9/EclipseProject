package test_methods;

import java.util.Scanner;

public class ex3_15 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner ins =new Scanner(System.in);
		System.out.println("������һ����");
		int n = ins.nextInt();
		if (isPrime(n))
		System.out.print(n + "������");
		else
			System.out.print("��������");
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
