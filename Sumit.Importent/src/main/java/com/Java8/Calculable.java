package com.Java8;

public interface Calculable {
    public int add(int x,int y);
    default public int sub(int x,int y){
    	return x-y;
    }
}
