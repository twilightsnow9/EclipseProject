package test_methods;

import java.util.Scanner;

public class al123_321 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		System.out.print("������һ����λ������");
		int n=in.nextInt();
		int a=n/100;
		int b=n/10%10;
		int c=n%10;
		System.out.println("��������Ϊ��"+c*100+b*10+a);
			
		

	}

}
