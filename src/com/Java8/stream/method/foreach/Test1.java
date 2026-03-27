package com.Java8.stream.method.foreach;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> employee= new ArrayList<>();
        employee.add(new Employee(101,"Akher",999999999));
        //employee.add(new Employee(101,"Akher",999999999));
        employee.add(new Employee(102,"Anis",9999));
        employee.add(new Employee(103,"BulBul",999999999));
        employee.add(new Employee(104,"Abir",999999));
        employee.add(new Employee(105,"Chinmoy",999999));



        //mapToDouble   convert list to double list
        //List<Double> sal =(List<Double>) employee.stream().mapToDouble(e->e.getSal()).collect(Collectors.toList()));










//        System.out.println("convert list of emp to map");
//        Map<Integer,Employee> map =employee.stream().collect(Collectors.toMap(e->e.getId(),e->e));
//        System.out.println(map);
//
//        System.out.println("To Find min,max,avg salary from a list");
//
//        DoubleSummaryStatistics statistics =employee.stream().collect(Collectors.summarizingDouble(e->e.getSal()));
//        System.out.println(statistics);
//        System.out.println(statistics.getAverage());
//        System.out.println(statistics.getMax());
//        int min =(int)statistics.getMin();
//        System.out.println("find the employee who got minimum salary");
//        employee.stream().filter(e->e.getSal()==min).forEach(e-> System.out.println(e));









//sorting employee
//employee.stream().sorted().forEach(e-> System.out.println(e));

        System.out.println("print unique employees based on id");
        employee.stream().sorted().distinct().forEach(e-> System.out.println(e));




        //employee.forEach(e-> System.out.println(e.getName()+" "+e.getSal()));


//        employee.forEach((e)->{
//            if(e.getSal()>999){
//                System.out.println(e.getName());
//            }
//        });

        //name ends with er..using conventional method
//        for (Employee employee1:employee){
//            if (employee1.getName().endsWith("er")){
//                System.out.println(employee1.getName());
//            }
//        }

        //name ends with er..using forEach method
//        employee.forEach((e)->{
//            if(e.getName().endsWith("er")){
//                System.out.println(e.getName());
//            }
//        });


        //deduct 10 % sal .using conventional method
//        for (Employee employee1:employee){
//            employee1.setSal(employee1.getSal()-employee1.getSal()*10/100);
//            System.out.println(employee1.getSal());
//        }


        //deduct 10 % sal .using forEach method
//        employee.forEach((e)->{
//            e.setSal(e.getSal()-e.getSal()*10/100);
//            System.out.println(e.getSal());
//        });


        //remove employee whose name ends with s using removeIf()
//        employee.removeIf(e->e.getName().endsWith("s"));
//        employee.forEach(e-> System.out.println(e.getName()));


        //print employee whose name ends with er
        employee.stream().filter(e->e.getName().endsWith("er")).forEach(e-> System.out.println(e.getName()));

        //get emp  names store it in different list
        List<String> names=employee.stream().filter(e->e.getName().endsWith("er")).map((e)->e.getName()).collect(Collectors.toList());
        System.out.println(names);

        //count

        Long count=employee.stream().filter(e->e.getName().endsWith("er")).map((e->e.getName())).count();
        System.out.println(count);


        System.out.println("lowest salary");
        Employee employee1 =employee.stream().min((t1, t2)->(t1.getSal()<t2.getSal())?-1:((t1.getSal()==t2.getSal())?0:-1)).get();
        System.out.println(employee1.getName());

        System.out.println("==================");


        System.out.println("highest salary person name (we give the implementation here of compare())");
        Employee employee2 =employee.stream().max((t1, t2)->(t1.getSal()<t2.getSal())?-1:((t1.getSal()==t2.getSal())?0:-1)).get();
        System.out.println(employee2.getName());
        System.out.println("==================");

        System.out.println("maximun sal using Integer compare() method");
        Employee employee3=employee.stream().max(
                (t1,t2)->((Integer.compare(t1.getSal(),t2.getSal())))).get();
        System.out.println(employee3.getName());
        System.out.println("==================");
        System.out.println("Only max salary we need");
        Integer max =employee.stream().map(t1->t1.getSal()).max(
                (t1,t2)->((Integer.compare(t1,t2)))).get();
        System.out.println(max);
        System.out.println("==================");
        System.out.println("List of employee who got max sal");
        employee.stream()
                .filter(e -> e.getSal() == max)
                .forEach(e -> System.out.println(e.getName()));



        System.out.println("==================");
        System.out.println("minimum sal using Integer compare() method");
        Employee employee4=employee.stream().min(
                (t1,t2)->((Integer.compare(t1.getSal(),t2.getSal())))).get();
        System.out.println(employee3.getName());

        System.out.println("==================");

        System.out.println("lowest employee id");
        Employee employee5 =employee.stream().min((t1, t2)->(t1.getId()<t2.getId())?-1:((t1.getId()==t2.getId())?0:-1)).get();
        System.out.println(employee5.getName());

        System.out.println("==================");

        System.out.println("2nd max sal person");

        Employee secondmax=employee.stream().sorted(
                (t1,t2)->((Integer.compare(t2.getSal(),t1.getSal())))).skip(1).findFirst().get(); //skip() ->skip 1st  1 element,findFirst()->give 1st element
        System.out.println(secondmax.getName());
        System.out.println("==================");
        //second lowest
        Employee secondlow=employee.stream().sorted(
                (t1,t2)->((Integer.compare(t1.getSal(),t2.getSal())))).skip(1).findFirst().get(); //skip() ->skip 1st  1 element,findFirst()->give 1st element
        System.out.println(secondlow.getName());


    }
}
