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
	        System.out.println("亲爱的主人，我的名字叫" + this.name + "，是一只可爱的" + this.sex+ "。");
	    }
	    public void eat(){	
	        System.out.println("狗狗"+this.name+"吃饱啦！");
	    }
	}

