package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        //remove all the elements that are less than 4
        //

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println("-----------------------------------------------------");
        List<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        //remove all the elements that are less than 4
        /*

        boolean r1= it.hasNext();//this method returns a boolean it means it has the next element to be iterated
        System.out.println(r1);
        System.out.println(it.next());
        boolean r2= it.hasNext();
        System.out.println(r2);
        System.out.println(it.next());

         */
        Iterator<Integer>it= list2.iterator();
        while (it.hasNext()){//in such conditions while loop is the best
            if (it.next()<4){
                it.remove();
            }
        }
        System.out.println(list2);

        System.out.println("-----------------------------------------------------");

        List<Integer>list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (Iterator<Integer>i=list3.iterator();i.hasNext();){

            if (i.next()<4){
                i.remove();
            }
        }
        System.out.println(list3);
         //lambda expression is much easier to do this KendiCalismalarim.task lambda removeif() method are added  after java 8
        System.out.println("-----------------------------------------------------");
        List<Integer>list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        list4.removeIf(each->each<4);//we pass the condition as an parametr to remove if method
        System.out.println(list4);
        //this is the short way remove the element


    }
}
