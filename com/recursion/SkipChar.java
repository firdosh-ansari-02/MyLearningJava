package com.recursion;

public class SkipChar {
    public static void main(String[] args) {

        System.out.println(skipappnotapple("saaappevassajf"));
    }

    public static String skipa(String up){
        if(up.isEmpty())
            return "";

        char ch = up.charAt(0);

        if(ch=='a')
        return skipa(up.substring(1));

        return ch + skipa(up.substring(1));
    }


    public static String skipapple(String up){
        if(up.isEmpty())
            return "";

        if(up.startsWith("apple"))
            return skipapple(up.substring(5));

        return up.charAt(0) + skipapple(up.substring(1));
    }
    public static String skipappnotapple(String up){
        if(up.isEmpty())
            return "";

        if(up.startsWith("app") && !up.startsWith("apple"))
            return skipapple(up.substring(5));

        return up.charAt(0) + skipapple(up.substring(1));
    }

}
