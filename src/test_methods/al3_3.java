package test_methods;

import java.util.Random;
import java.util.Scanner;

public class al3_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int randomNumber = new Random().nextInt(100);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        System.out.println("������Ѿ�'�롯���ˣ�");
        System.out.println("���������µ����֣�");
        Scanner sc=new Scanner(System.in);
        int enterNumber=sc.nextInt();
        while(enterNumber!=randomNumber) {
        	if(enterNumber>randomNumber) {
        		System.out.println("sorry,���´��ˣ�");
        	}
        	else {
        		System.out.println("sorry,����С�ˣ�");
        	}	
    System.out.println("���������µ����֣�");
                enterNumber=sc.nextInt();
        	}
            System.out.println("��ϲ�㣬����ˣ�");
	}

}
