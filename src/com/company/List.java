package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

    public void Method(){
        String a;
        String b;
/*
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=1;i<=100;i++){
            arrayList.add(i);
        }
        for (int j=0;j<arrayList.size();j++){
            System.out.println(arrayList.get(j));
        }*/

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("aa");
        linkedList.add("bb");
        linkedList.add("cc");

        //指定位置插入
        linkedList.add(0,"cc");
        for (int x=0;x<linkedList.size();x++){
            System.out.println(linkedList.get(x));
        }
        System.out.println("\n");

        //去重
        for (int y=0;y<linkedList.size();y++){
            for (int z=y+1;z<linkedList.size();z++){
                a=linkedList.get(y);
                b=linkedList.get(z);
                if (a==b){
                    linkedList.remove(b);
                }

            }
        }
        //索引值遍历
        for (int d=0;d<linkedList.size();d++){
            System.out.println(linkedList.get(d));
        }

        //
        System.out.println(linkedList.contains("aa"));
        System.out.println(linkedList.contains("dd"));

    }

}
