package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();// hashSet does not ollowed dublicated
        
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        
        System.out.println(set);

      //  Integer[] array=  set.toArray(new Integer[0]);

        List<Integer>list=new ArrayList<>(set);//now we have index number
        
        System.out.println(list);

        //  List<String> names = null;//null means no obj has been created
        // System.out.println(names.size());

        System.out.println("----------------------------------------");

        //pop()===> last in first out
        List<Character>chars =new Stack<>();
        
        chars.addAll(Arrays.asList('A','B','C','D'));//[a,b,c,d,]
        
        System.out.println("chars = " + chars);
        
        ((Stack)chars).pop();
        
        System.out.println("chars = " + chars);//[a,b,c]
        
        //poll()===> first in first out,(this method only for queue)
        List<String>names=new LinkedList<>();

        names.addAll(Arrays.asList("james","jimmy","kathy","Breanne","Max"));

        System.out.println(names);

        ((LinkedList<String>)names).poll();

        System.out.println(names);

        ((LinkedList<String>)names).poll();

        System.out.println(names);
        



    }




}
