package com.ducat.automation.TrickyProblem;

public class ReverseStrig {
    public static void main(String[] args) {
        // logic 1- using String concatenation operator;

        String str = "Kavya";
        String rev = "";
        /*int len = str.length();

        for(int i=len-1;i>=0;i--) {
            rev = rev+str.charAt(i);
        }*/

        //Logic 2 - Using character array

        /*char [] a= str.toCharArray();
        int len= a.length;
        for(int i=len-1;i>=0;i--){
            rev = rev + a[i];

        }*/

        //Logic 3- Using StringBuffer

        StringBuffer sb = new StringBuffer(str);
        StringBuffer reve = sb.reverse();

        System.out.println("Reverse String is : "+reve);
    }
}
