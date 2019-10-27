package helloworld;

import java.util.ArrayList;

public class helloworld1{

    public static void main(String[] args){
        System.out.println("helloworld");

        ArrayList list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(4);

        if (list != null) {
            System.out.println("111");
        }

    }

}