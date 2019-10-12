package com.et.test;

import java.util.ArrayList;
import java.util.Arrays;

public class TempleteTest {
    //prsf
    //private static final Customer CUT = new Customer();
    //psf
    public static final int NUM = 2;
    //psfi
    public static final int NUM2 = 3;



    //psfs
    public static final String NATION = "CHINA";


    //test
    public void testUpdate(){
        //修改
    }

    /**
     * pric
     */
    private int NUM3 = 4;

    /**
     * prsc
     */
    private String name;


    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("Hello World!");
        //soutp 参数 soutm 方法 soutv 变量 xxx.sout 变量
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TempleteTest.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println(num2);

        //fori
        String[] arr = new String[]{"xiaoxin","xiaohong","xiaobai","huluwa"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }

        //itar
        for (int i = 0; i < arr.length; i++) {
            String s2 = arr[i];
            System.out.println("s2 = " + s2);
        }

        //list.for
        ArrayList<String> list = new ArrayList<String>();
        list.add("123");
        list.add("456");
        list.add("789");
        for (String s3 : list) {
            System.out.println("s3 = " + s3);
        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);
        }

        //list.forr 倒序遍历
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            System.out.println("i2 = " + i2);
        }

        //ifn
        if (list == null) {

        }

        //inn
        if (list != null) {

        }

        //xxx.nn  /xxx.null
        if (list != null) {

        }

        if (list == null) {

        }

    }
}
