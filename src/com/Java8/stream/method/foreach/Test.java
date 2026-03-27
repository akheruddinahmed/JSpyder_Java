package com.Java8.stream.method.foreach;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test implements Comparator<Integer> {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(20);



























//using limit and skip method
        //print 1st 4 element

        list.stream().limit(4).forEach(e-> System.out.println(e));


        System.out.println("-------------2nd max--------");


        Integer integer =list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);

        System.out.println("----------1st minimum ele-----------");

        //1st minimum ele
        list.stream().sorted().limit(1).forEach(e-> System.out.println(e));


        System.out.println("-----------2nd minimum element not using min method----------");
        //2nd minimum element not using min method
        list.stream().sorted().limit(2).skip(1).forEach(e-> System.out.println(e));

        //largest ele
        System.out.println("largest ele");
        list.stream().sorted(Collections.reverseOrder()).limit(1).forEach(e-> System.out.println(e));

        //2nd largest
        System.out.println("2nd largest ele");
        list.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(e-> System.out.println(e));

//3rd largest
        System.out.println("3rd largest ele");
        list.stream().sorted(Collections.reverseOrder()).limit(3).skip(2).forEach(e-> System.out.println(e));










 //these part will move to top
        //traditional for each loop
//        for(Integer integer:list){
//            System.out.println();
//            System.out.println(integer);
//        }

        System.out.println("******************");
        Consumer<Integer> consumer=a-> System.out.println(a);
        list.forEach(consumer); // not achieve functional programming
        System.out.println("*****");
        list.forEach(a-> System.out.println(a)); // achieve functional programming
        System.out.println("------------");

        System.out.println("print unique element from list");
        list.stream().distinct().forEach(e-> System.out.println(e));
        System.out.println("------------");
        System.out.println("print duplicate element from list");

        Set<Integer> set=new HashSet<Integer>();
        list.stream().filter(e->!set.add(e)).forEach(e-> System.out.println(e));

        System.out.println("------------");






        //minimum ele

//        int min=list.get(0);
//        for (Integer integer:list){
//            if(integer<min){
//                min=integer;
//            }
//        }
//        System.out.println(min);
//        System.out.println("------------------");
//        //min ele by conventional method
 //       Collections.sort(list); //natural sorting
//        System.out.println(list.get(0)); //print min ele
//        System.out.println(list);
//
//        //max ele by conventional method
//        Collections.sort(list,new Test()); //descending.....(custom sorting)
//        System.out.println(list);
//        System.out.println(list.get(0)); //print max ele


        System.out.println("minimum element by using stream");
        Integer smallest =list.stream().min((t1, t2)->(t1<t2)?-1:((t1==t2)?0:-1)).get();
        System.out.println(smallest);

        System.out.println("max element by using stream");
        Integer largest =list.stream().max((t1, t2)->(t1<t2)?-1:((t1==t2)?0:-1)).get();
        System.out.println(largest);


        System.out.println("min ele using stream");
//by default sorted sort in ascending order
        List<Integer> ls =list.stream().sorted().collect(Collectors.toList());
        System.out.println(ls);


// descending order
        List<Integer> ls1 =list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());//two sorted() in stream,one is no argument and another is one argument which sorted accepts comparator
        System.out.println(ls1);

        //1st min
        Integer firstmin=list.stream().sorted().findFirst().get();

        // 2nd min
        Integer secmin=list.stream().sorted().skip(1).findFirst().get();

        // 1st max
        Integer firstmax=list.stream().sorted((Collections.reverseOrder())).findFirst().get();
        // 2nd max
        Integer secmax=list.stream().sorted((Collections.reverseOrder())).skip(1).findFirst().get();




    }

    @Override
    public int compare(Integer x,Integer y ) {
        return (x<y)?-1:((x==y)?0:-1);
    }

    //

}



