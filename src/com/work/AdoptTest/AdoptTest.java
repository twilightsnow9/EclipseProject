package com.work.AdoptTest;


import java.util.Scanner;

public class AdoptTest {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("��ӭ����������֮�ң�");
	        System.out.println("***********************");		
	        System.out.print("������Ҫ�����ĳ���è�����֣�");
	        String name1 = input.next();		
	        System.out.println();
	        System.out.print("��ѡ��è���Ʒ��:(1����˹è" + " 2��Ų����ɭ��)");
	        String strain = null;
	        if (input.nextInt() == 1) {
	            strain = "��˹è";
	        } else {
	            strain = "Ų����ɭ��";
	        }
	        Cat cat = new Cat();
	        cat.introduce();
	        cat.eat();		
	        System.out.print("������Ҫ�����ĳ��ﹷ�������֣�");
	        String name2 = input.next();			
	        System.out.println();
	        System.out.print("��ѡ�񹷹����Ա�:(1����GG" + " 2����MM)");
	        String sex = null;
	        if (input.nextInt() == 1) {
	            sex = "��GG";
	        } else {
	            sex = "��MM";
	        }		
	        Dog dog = new Dog(name2,sex);		
	        dog.introduce();	
	        dog.eat();			
	        System.out.println("�˳��˳���֮�ң�");
	    }
	}

	    
