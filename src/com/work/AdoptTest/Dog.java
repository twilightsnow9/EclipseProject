package com.work.AdoptTest;

public class Dog {
			
	    private String name;		
	    private String sex;
	    private String strain;
	    public Dog(String name, String sex) {
	        this.name = name;
	        this.sex = sex;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }	
	    public String getStrain() {
			return strain;
	    }
	    public void setStain(String strain) {
	        this.strain = strain;
	    }
	    public void introduce() {	
	        System.out.println("�װ������ˣ��ҵ����ֽ�" + this.name + "����һֻ�ɰ���" + this.sex+ "��");
	    }
	    public void eat(){	
	        System.out.println("����"+this.name+"�Ա�����");
	    }
	}

