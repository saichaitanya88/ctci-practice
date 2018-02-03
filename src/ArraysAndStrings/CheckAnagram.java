package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

public class CheckAnagram {
    public static void main(String[] args){
        CheckAnagram ca = new CheckAnagram();
        ca.check("abc", "cba");
        ca.check("listen", "silent");
        ca.check("abet", "beta");
        ca.check("largely", "regally");
        ca.check("a", "ab");
        ca.check("a", "a");
        ca.check("abc", null);
        ca.check("", "");
    }

    public void check(String a, String b){
        checkBySorting(a,b);
        checkByCounts(a,b);
        checkByMap(a,b);
    }

    public void checkBySorting(String a, String b){
        System.out.print("checking " + a + " & " + b + " : ");
        if (a == null && b == null){
            System.out.println("true");
            return;
        }
        if ((a == null && b != null) || (a != null && b == null)){
            System.out.println("false");
            return;
        }
        if (a.length() != b.length()){
            System.out.println("false");
            return;
        }
        if (a.length() == 0 && b.length() == 0){
            System.out.println("true");
            return;
        }
        System.out.println(sort(a).equals(sort(b)));
    }
    public void checkByCounts(String a, String b){
        System.out.print("checking " + a + " & " + b + " : ");
        if (a == null && b == null){
            System.out.println("true");
            return;
        }
        if ((a == null && b != null) || (a != null && b == null)){
            System.out.println("false");
            return;
        }
        if (a.length() != b.length()){
            System.out.println("false");
            return;
        }
        if (a.length() == 0 && b.length() == 0){
            System.out.println("true");
            return;
        }

        int[] letters = new int[256];
        char[] aArr = a.toCharArray();
        int numUniqueChars = 0;
        int numCompletedB = 0;
        for(char c : aArr){
            if (letters[c] == 0)
                ++numUniqueChars;
            ++letters[c];
        }
        for(int i = 0; i < b.length(); ++i){
            int c = b.charAt(i);
            if (letters[c] == 0) {
                System.out.println("false");
                return;
            }
            --letters[c];
            if (letters[c] == 0){
                ++numCompletedB;
                if (numCompletedB == numUniqueChars){
                    System.out.println(i == b.length() - 1);
                    return;
                }
            }
        }
        System.out.println("false");
    }
    public void checkByMap(String a, String b){
        System.out.print("checking " + a + " & " + b + " : ");
        if (a == null && b == null){
            System.out.println("true");
            return;
        }
        if ((a == null && b != null) || (a != null && b == null)){
            System.out.println("false");
            return;
        }
        if (a.length() != b.length()){
            System.out.println("false");
            return;
        }
        if (a.length() == 0 && b.length() == 0){
            System.out.println("true");
            return;
        }

        HashMap<Character,Integer> aHash = stringToHashMap(a);
        HashMap<Character,Integer> bHash = stringToHashMap(b);
        System.out.println(aHash.equals(bHash));
    }
    public String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    public HashMap<Character, Integer> stringToHashMap(String s){
        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
        for(char c : s.toCharArray()){
            if (hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }
            else{
                hm.put(c,1);
            }
        }
        return hm;
    }
}
