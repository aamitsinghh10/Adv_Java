package ConcurrentCollectionsDemo;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionsDemo {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        try{
            for(Integer i:list){
                list.add(5);
                System.out.println(i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
