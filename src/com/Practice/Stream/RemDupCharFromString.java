package com.Practice.Stream;

public class RemDupCharFromString {
    public static void main(String[] args) {

        String str = "programming";

        str.chars()                       // Convert String → IntStream of character ASCII values
                .distinct()                    // Remove duplicate characters from the stream
                .forEach(c -> {                // Iterate each remaining element
                    System.out.print((char) c); // Cast int → char and print character
                });
    }
}

/*
REVISION NOTES

1. chars()
   - Converts the string into an IntStream
   - Each character becomes its ASCII/Unicode value

2. distinct()
   - Removes duplicate elements from the stream
   - Keeps only the first occurrence

3. forEach()
   - Performs an action for each element in the stream

4. (char) c
   - Converts ASCII integer back to character

Example:
String = "programming"

Characters:
p r o g r a m m i n g

After distinct():
p r o g a m i n

Output:
progamin

--------
String
  ↓
chars()
  ↓
distinct()
  ↓
forEach()
  ↓
print characters
*/