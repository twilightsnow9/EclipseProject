package test_methods;

import java.util.Scanner;

public class chushihua {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double y, r;
		int a, n;
		Scanner in = new Scanner(System.in);
		System.out.print("����������ܽ�Ԫ����");
		a = in.nextInt();
		System.out.print("���������������:");
		n = in.nextInt();
		System.out.print("������������:");
		r = in.nextDouble();
		y = a * r *Math.pow(1 + r ,  n) / (Math.pow(1 + r , n) - 1);
		System.out.println("ÿ�µĻ�����Ϊ:" + y + "Ԫ��");

	}

}
