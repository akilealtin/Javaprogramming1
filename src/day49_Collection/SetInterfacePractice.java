package day49_Collection;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("list = " + list);
        System.out.println(list.get(4));
        
        Set<Integer>hashSet=new HashSet<>();
       hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null,null));

        System.out.println("hashSet = " + hashSet);
      //  System.out.println(hashSet.get(4)); // we can not use the index number

       Set<Integer>linkedHashSet=new LinkedHashSet<>();
       Set<Integer> treeSet= new TreeSet<>();
    }
}