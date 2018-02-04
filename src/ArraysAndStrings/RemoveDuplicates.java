package ArraysAndStrings;

public class RemoveDuplicates {
    public static void main(String[] args){
        String[] inputs = { "", "acbdefghijk", "abdjia", "fiafhueqf", "eoafeihfalq", "a", "abca", null };
        RemoveDuplicates rd = new RemoveDuplicates();
        for(String input : inputs){
            System.out.println(input + " => " + rd.dedupe(input));
        }
    }

    public String dedupe(String input){
        if (input == null)
            return null;
        if (input.length() <= 1){
            return input;
        }

        char[] output = new char[input.length()];
        int pos = 0;
        for(char c : input.toCharArray()){
            if (!charInArray(output, c)){
                output[pos] = c;
                pos++;
            }
        }
        // other languages have more elegant solutions for this
        char[] result = new char[pos];
        for (int i = 0; i < pos; i++){
            result[i] = output[i];
        }
        return String.valueOf(result);
    }

    private boolean charInArray(char[] array, char c){
        for(char a : array){
            if (a == c){
                return true;
            }
        }
        return false;
    }
}
