package com.Java8.stream;
//STRING PROGRAMME
import java.util.*;
import java.util.stream.Collectors;

//we can write only one terminal operation
//we can write multiple intermediate operation
public class Driver {
    public static void main(String[] args) {

        System.out.println("Print duplicate ele || remove unique elements");

        Set<Character> printDuplicate = new HashSet<>();
        String str = "Morining";
        str.chars()//convert string to intStream
                .mapToObj(c -> (char) c)//convert intStream to Char
                .filter(c -> !printDuplicate.add(c))
                .forEach(c -> System.out.println(c));

        System.out.println("remove duplicate || print unique elements from a given string");
 //       Set<Character> remove = new HashSet<>();
//        str.chars()//convert string to intStream
//                .mapToObj(c->(char)c).distinct()//convert intStream to Char
//                .filter(c->remove.add(c))
//                .forEach(c-> System.out.println(c));

        str.chars()//convert string to intStream
                .mapToObj(c -> (char) c)
                .distinct()
                .forEach(c -> System.out.println(c));


        System.out.println("occurance of each character");
        //groupingBy returns map
        Map<Character, Long> collect = str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, () -> new LinkedHashMap<Character, Long>(), Collectors.counting()));
        System.out.println(collect);

        /*
         quickly scan before interviews 👇

⸻

🧾 Problem

👉 Count occurrence of each character in a string using Streams

⸻

✅ Code

Map<Character, Long> map = str.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(
                c -> c,
                () -> new LinkedHashMap<>(),
                Collectors.counting()
        ));


⸻

🔍 Step-by-Step Flow

1️⃣ str.chars()
	•	Converts String → IntStream
	•	Each character → ASCII value

⸻

2️⃣ mapToObj(c -> (char) c)
	•	Converts int → Character
	•	Now → Stream<Character>

⸻

3️⃣ collect(...)

Terminal operation → converts stream → Map

⸻

🔥 groupingBy() Breakdown

groupingBy(keyMapper, mapSupplier, downstream)

✅ c -> c (Key Mapper)
	•	Groups by character itself
	•	Example: 'a' → group of all 'a'

⸻

✅ LinkedHashMap::new (Map Supplier)
	•	Maintains insertion order
	•	Output order same as input

⸻

✅ counting() (Downstream)
	•	Counts frequency of each character
	•	Returns Long

⸻

🧠 Example

Input:

"banana"

Output:

{b=1, a=3, n=2}


⸻

⚡ Key Points to Remember
	•	groupingBy() → creates Map<K, V>
	•	counting() → returns Long (not int)
	•	LinkedHashMap → preserves order
	•	Without it → order may be random (HashMap)

⸻

🎯 Interview Line

“I convert the string to a stream, group characters using groupingBy, and count occurrences using counting, while preserving order with LinkedHashMap.”

⸻

🔥 Short Version (if order not needed)

Map<Character, Long> map = str.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


⸻

🧩 Memory Trick

groupingBy = GROUP + COUNT

         */


        System.out.println("first repeating character");
        //findFirst() return should be optional
        Optional<Character> firstRepeating = collect.entrySet().stream()
                                                    .filter(e -> e.getValue() > 1)
                                                    .map(e -> e.getKey())
                                                    .findFirst();
        if (firstRepeating.isPresent()) {
            System.out.println(firstRepeating.get());
        } else {
            System.out.println("repeating char not present");


            //or
            //Character first  =collect.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst().get();

        }

        //first non repeating character
        System.out.println("first non repeating character");
        Optional<Character> firstNonRepeating = collect.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if (firstNonRepeating.isPresent()) {
            System.out.println(firstNonRepeating.get());
        } else {
            System.out.println("repeating char not present");


        }

        System.out.println("2nd repeating character");

        Optional<Character> seRepeating = collect.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).skip(1).findFirst();
        if (seRepeating.isPresent()) {
            System.out.println(seRepeating.get());
        } else {
            System.out.println("Second repeating char not present");


        }


        System.out.println("2nd non repeating character");
        Optional<Character> secNonRepeating = collect.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).skip(1).findFirst();
        if (secNonRepeating.isPresent()) {
            System.out.println(secNonRepeating.get());
        } else {
            System.out.println("repeating char not present");


        }









        //List of empl name whose name starts with vowels

        //list.stream().filter(e->e.startsWith("a")||e->e.startsWith("e")||e->e.startsWith("i")

        //reverse string // not asked using stream
        String str4="Morning";

        //Interview Question max,min,occu,

        //list of employee joining between 2018-2022

        //filter(),map(),skip(),limit(),findFirst()

        //flatMap() vs Map()

        //Map() accepts one argument,flatMap()
        /*
        List<String> list1=new ArrayList();
        list.add("kartik);
        list.add("goutam")

              List<String> list2=new ArrayList();
        list.add("kartik);
        list.add("goutam")



        List<list> list3=new ArrayList();
        list3.add(list1);
        list3.add(list2);

        //if ds is list of list,set of set type or list of set  .. then we use flatMap() method

        list3.stream().flatMap(e->e.stream().forEach());



        //parallelStream()

        ->operation in faster way
        //eg..add bonus to every employee
        Stream->follows sequential  operation
        parallelStream()->follow random operation
         */



    }
}
