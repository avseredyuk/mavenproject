package com.avseredyuk;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for (String s : args) {
            System.out.println(s);
        }
        System.out.println( "Hello World!" );
        System.out.println("asd" == "asdd");
        Object o = new String("asdzx");


    }

    protected Object clone() {
        return null;
    }
}
