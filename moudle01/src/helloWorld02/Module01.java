package helloWorld02;

import java.util.ArrayList;

public class Module01 {

    public static void main(String[] args){
        System.out.print("helloworld!!");
        int a=5;
        int b=6;
        ArrayList list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(a+b);
        System.out.print(list);
    }
}
