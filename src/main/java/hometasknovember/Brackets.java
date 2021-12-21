package hometasknovember;

import java.util.*;

public class Brackets  {


    Stack<Character> arr = new Stack<>();

    public static void main(String[] args) {
        Deque<Character> arr1 = new ArrayDeque<>();
        arr1.add('(');

        System.out.println(arr1.getFirst());
        for (char p : arr1) {
            System.out.println(p);
        }

        Iterator<Character> it = arr1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }



        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("bird");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals("cat")) {
                it2.remove();
            }
        }
//        for (String l : list){
//            if(l.equals("cat")){
//                list.remove(l);
//            }
//            System.out.println(l);
//        }
    }
    }

