package com.work.AdoptTest;

public class Cat {
    private String name;		
    private String strain;
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
        System.out.println("�װ������ˣ��ҵ����ֽ�" + this.name + "����һֻ���ֵ�" + this.strain+ "��");
    }
    public void eat(){			
        System.out.println("è��"+this.name+"�Ա����� ");
    }
}