package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        // key not dublicated but value dublicate
        //   key     value
        Map<Integer,String>hashMap=new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, null);
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");


        System.out.println("hashMap = " + hashMap);
       // System.out.println(hashMap.get());


        Map<Integer,String>LinkedHashMap=new LinkedHashMap<>();
        LinkedHashMap.put(10,"Arthur");
        LinkedHashMap.put(20,"George");
        LinkedHashMap.put(3,"jack");
       LinkedHashMap.put(40,"Emma");
       LinkedHashMap.put(5,"Ahmet");
        LinkedHashMap.put(5,"Isabella");
        LinkedHashMap.put(null, "Hulya");

        System.out.println("LinkedHashMap = " + LinkedHashMap);
        

        Map<Integer,String>TreeMap=new TreeMap<>();//key cannot be null value can be null and dublicated
        TreeMap.put(10, "Arthur");
        TreeMap.put(20, "George");
        TreeMap.put(3, "Jack");
        TreeMap.put(40, "Emma");
        TreeMap.put(5, "Ahmet");
        TreeMap.put(5,"Isabella");
       TreeMap.put( 7,null);
        System.out.println("TreeMap = " + TreeMap);

        Map<Integer,String>Hashtable=new Hashtable<>();//key and value can not be null
        Hashtable.put(10, "Arthur");
        Hashtable.put(20, "George");
        Hashtable.put(3, "Jack");
        Hashtable.put(40, "Emma");
        Hashtable.put(5, "Ahmet");
        Hashtable.put(5,"Isabella");
       // Hashtable.put(6, null);

        System.out.println("hashtable = " + Hashtable);
/*
        String str=null;
        System.out.println(str.toUpperCase());

 */

    }
}
