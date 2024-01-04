package test_methods;

import java.util.Scanner;

public class fuzhi2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		System.out.println("输入第一个数：");
		int a =in.nextInt();
		System.out.println("输入第二个数：");
		int b = in.nextInt();
		int max = a > b ? a : b;
		System.out.println(a + "和" + b +"的最大值为"+ max);

	}

}
