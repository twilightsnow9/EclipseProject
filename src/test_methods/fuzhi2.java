package test_methods;

import java.util.Scanner;

public class fuzhi2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		System.out.println("�����һ������");
		int a =in.nextInt();
		System.out.println("����ڶ�������");
		int b = in.nextInt();
		int max = a > b ? a : b;
		System.out.println(a + "��" + b +"�����ֵΪ"+ max);

	}

}
