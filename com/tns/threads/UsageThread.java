package com.tns.threads;

public class UsageThread extends Thread{
    
    public synchronized void mul(int n){
        for(int i=0; i<11; i++){
            int result = n*i;
            System.out.println(result);
        }
    }
    
}
