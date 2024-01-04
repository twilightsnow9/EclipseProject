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
        System.out.println("亲爱的主人，我的名字叫" + this.name + "，是一只纯种的" + this.strain+ "。");
    }
    public void eat(){			
        System.out.println("猫咪"+this.name+"吃饱啦！ ");
    }
}