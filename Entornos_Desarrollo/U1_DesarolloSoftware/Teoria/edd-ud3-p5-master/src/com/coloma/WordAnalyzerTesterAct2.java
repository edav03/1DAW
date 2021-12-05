package com.coloma;

/**
 * Class to test Repeated Counter Characters
 */
public class WordAnalyzerTesterAct2
{
    public static void main(String[] args)
    {
        test("mississippiii"); // expect: 4 (ss, ss, pp, iii)
        test("test"); // expect: 0 (no repeated letters)
        test("aaaaabbcdaaaaaabbbb"); // expect: 4 (aa, bb, aaaa, bb)
    }

    public static void test(String s)
    {
        WordAnalyzer wa = new WordAnalyzer(s);
        int result = wa.countRepeatedCharacters();
        System.out.println(result + " repeated characters.");
    }
}