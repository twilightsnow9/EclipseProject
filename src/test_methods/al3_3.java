package test_methods;

import java.util.Random;
import java.util.Scanner;

public class al3_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int randomNumber = new Random().nextInt(100);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        System.out.println("计算机已经'想’好了！");
        System.out.println("请输入您猜的数字：");
        Scanner sc=new Scanner(System.in);
        int enterNumber=sc.nextInt();
        while(enterNumber!=randomNumber) {
        	if(enterNumber>randomNumber) {
        		System.out.println("sorry,您猜大了！");
        	}
        	else {
        		System.out.println("sorry,您猜小了！");
        	}	
    System.out.println("请输入您猜的数字：");
                enterNumber=sc.nextInt();
        	}
            System.out.println("恭喜你，答对了！");
	}

}
