package com.coloma;
/**
 * Class to test Locate First Repeated Counter Characters
 */
public class WordAnalyzerTesterAct1
{
    public static void main(String[] args)
    {
        test("aardvark"); // expect: a
        test("roommate"); // expect: o (not m)
        test("test"); // expect: 0 (the t isn't repeatin)
        test("mate"); // expect: 0 (no duplicate letters)
        
    }

    public static void test(String text)
    {
        WordAnalyzer wa = new WordAnalyzer(text);
        char result = wa.firstRepeatedCharacter();

        if (result == 0) {
            System.out.println("No repeated character.");
        } else {
            System.out.println("First repeated character = " + result);
        }
    }
}
