package com.Practice.Stream;
//find unique characters in a String using Java Stream.
public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "programming";

        str.chars()                                   // Convert String → IntStream of character ASCII values
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c)) // Keep characters that appear only once
                .forEach(c -> System.out.print((char) c));  // Convert int → char and print
    }
}

/*
REVISION NOTES

1. chars()
   - Converts String into IntStream
   - Each character becomes its ASCII/Unicode value

2. indexOf(c)
   - Returns first occurrence of character

3. lastIndexOf(c)
   - Returns last occurrence of character

4. indexOf(c) == lastIndexOf(c)
   - Means character appears only once → UNIQUE character

5. forEach()
   - Iterates over stream elements

6. (char) c
   - Cast int ASCII value back to character

Example:
String = "programming"

Unique characters → p o a i n
Output → poain
*/