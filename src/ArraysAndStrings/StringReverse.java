package ArraysAndStrings;

public class StringReverse {

    public static void main(String args[]){
        StringReverse sr = new StringReverse();
        System.out.println("abcd => " + sr.reverse("abcd"));
        System.out.println("'' => " + sr.reverse(""));
        System.out.println("null => " + sr.reverse(null));
        System.out.println("a => " + sr.reverse("a"));
        System.out.println("abd => " + sr.reverse("abd"));
        System.out.println("ad => " + sr.reverse("ad"));
    }

    public String reverse(String input){
        if (input == null) return null;
        if (input.length() < 2) return input;

        // initialize c-style array from string
        char[] chars = new char[input.length() + 1];
        for(int i = 0; i < input.length(); i++){
            chars[i] = input.charAt(i);
        }
        chars[input.length()] = '\0';

        int lastIndex = chars.length - 2;
        for(int i = 0; i <= lastIndex/2; i++){
            char t = chars[i];
            chars[i] = chars[lastIndex-i];
            chars[lastIndex-i] = t;
        }

        return String.valueOf(chars);
    }
}
