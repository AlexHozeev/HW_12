package com.alexshab;

class wordsReserveOrder{


    public static void main(String[] args) {

        String String = "Odessa is beautiful city";
        System.out.println(String);
        System.out.println(reverseString(String));
        }

private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        String words[] = str.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
        char c = words[i].charAt(0);
        int index = sb.length();
        sb.append(words[i] + " ");
        sb.setCharAt(index, Character.toUpperCase(c));
        }

        return sb.toString().trim();
        }
}