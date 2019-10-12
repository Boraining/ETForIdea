package com.et.test;

/**
 * @AUTHOR Brain
 * @DATE 2019/10/12 - 11:07
 **/

public class TestAuthor {

    /**
     * 用户ID
     */
    private int id = 1;

    /**
     * 用户名
     */
    private String name = "小百";


    public static void main(String[] args) {
        int id = 2;
        String name = "小新";
        System.out.println(id + name);

    }
    
    public void testUpdate(){
        System.out.println(id + name);
    }
    
}
