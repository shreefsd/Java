import java.util.*;
import java.io.*;

class ReverseString{
    public static void main(String [] args){
        Scanner sca=new Scanner(System.in);
        String str=sca.next();
        reverse(str);
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
    public static void reverse(String str){
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp += str.charAt(i);
        }
        System.out.println(temp);
    }
}
