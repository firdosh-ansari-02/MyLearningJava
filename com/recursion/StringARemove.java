package com.recursion;

public class StringARemove {
    public static void main(String[] args) {
        System.out.println(skipappNotapple("bascappahcd"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a')
            skip(p,up.substring(1));
        else
            skip(p+ch,up.substring(1));
    }

    static String skip1(String up){
        if(up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a')
            return skip1(up.substring(1));
        else
           return ch + skip1(up.substring(1));
    }

    static String skipapp(String up){
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("apple"))
            return skipapp(up.substring(5));
        else
            return up.charAt(0) + skipapp(up.substring(1));
    }

    static String skipappNotapple(String up){
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple"))
            return skipappNotapple(up.substring(3));
        else
            return up.charAt(0) + skipappNotapple(up.substring(1));
    }
}
