package com.company;

public class Main {

    public static void main(String[] args) {
        int max=0;
        int []a={10,22,33,19,11};
        for(int b:a){
            if(max<b){
                max=b;
            }
        }
        System.out.println(max);
    }
}
