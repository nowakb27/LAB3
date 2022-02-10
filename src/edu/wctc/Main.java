package edu.wctc;
public class Main {
    public static void main(String[] args) {
        edu.wctc.Triplet<String> NAME = new edu.wctc.Triplet<>("BRANDON", "MICHAEL", "NOWAK");
        edu.wctc.Triplet<Integer> NUMBERS = new edu.wctc.Triplet<>(1, 2, 3);
        edu.wctc.Triplet<Character> LETTERS = new edu.wctc.Triplet<>('A', 'B', 'C');
        System.out.println(NAME);
        System.out.println(NUMBERS);
        System.out.println(LETTERS);
    }
}