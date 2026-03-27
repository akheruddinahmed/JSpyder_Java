package com.AdvProgramming.String;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String str = "hello hello world world";
        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            if (!result.contains(word + " ")) {
                result += word + " ";
            }
        }
        return result.trim();
    }
}