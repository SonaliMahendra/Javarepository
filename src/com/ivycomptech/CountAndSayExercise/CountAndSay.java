package com.ivycomptech.CountAndSayExercise;

public class CountAndSay {
    public String modifiedString(String s){
        char c=s.charAt(0);
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            count++;
            if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1)){
                sb.append(count).append(s.charAt(i));
                count=0;
            }
        }
        return sb.toString();
    }
    public String countAndSay(int n){
        if(n==1) return "1";
        String s=countAndSay(n-1);
        return modifiedString(s);
    }

}