package ArraysAndStrings;

import java.util.HashSet;

public class UniqueChars {
    public static void main(String[] args){
        String[] inputs = { "abcd", "aacd", "abded", "", null, "c" };
        UniqueChars uc = new UniqueChars();
        for(String input: inputs){
            System.out.println(input + " => " + uc.stringHasUniqueChars1(input));
            System.out.println(input + " => " + uc.stringHasUniqueChars2(input));
            System.out.println(input + " => " + uc.stringHasUniqueCharsBitwise(input));
        }
    }

    public boolean stringHasUniqueChars1(String input){
        if(input == null || input.length() == 0)
            return true;
        for(int i = 0; i < input.length(); i++){
            for(int j = i+1; j < input.length(); j++){
                if (input.charAt(j) == input.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean stringHasUniqueChars2(String input){
        if(input == null || input.length() == 0)
            return true;

        HashSet<Character> hs = new HashSet<>();
        for(char c : input.toCharArray()){
            if (hs.contains(c)){
                return false;
            }
            hs.add(c);
        }
        return true;
    }

    public boolean stringHasUniqueCharsBitwise(String input){
        // Most optimal space-wise
        // However, the algorithm does not work for chars other than a to z
        if(input == null || input.length() == 0)
            return true;

        int checker = 0;
        for(int i = 0; i < input.length(); i++){
            int v = input.charAt(i) - 'a';
            if((checker & (1 << v)) > 0)
                return false;

            checker |= 1 << v;
        }

        return true;
    }
}
