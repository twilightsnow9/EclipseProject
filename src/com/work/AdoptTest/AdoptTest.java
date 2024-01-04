package com.work.AdoptTest;


import java.util.Scanner;

public class AdoptTest {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("欢迎您来到宠物之家！");
	        System.out.println("***********************");		
	        System.out.print("请输入要领养的宠物猫咪名字：");
	        String name1 = input.next();		
	        System.out.println();
	        System.out.print("请选择猫咪的品种:(1、波斯猫" + " 2、挪威的森林)");
	        String strain = null;
	        if (input.nextInt() == 1) {
	            strain = "波斯猫";
	        } else {
	            strain = "挪威的森林";
	        }
	        Cat cat = new Cat();
	        cat.introduce();
	        cat.eat();		
	        System.out.print("请输入要领养的宠物狗狗的名字：");
	        String name2 = input.next();			
	        System.out.println();
	        System.out.print("请选择狗狗的性别:(1、狗GG" + " 2、狗MM)");
	        String sex = null;
	        if (input.nextInt() == 1) {
	            sex = "狗GG";
	        } else {
	            sex = "狗MM";
	        }		
	        Dog dog = new Dog(name2,sex);		
	        dog.introduce();	
	        dog.eat();			
	        System.out.println("退出了宠物之家！");
	    }
	}

	    
