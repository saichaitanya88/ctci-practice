package ArraysAndStrings;

public class StringReplace {
    public static void main(String[] args){
        // src: https://en.wikipedia.org/wiki/Shock_tube
        String input = "The shock tube is an instrument used to replicate and direct blast waves at a sensor or a model in order to simulate actual explosions and their effects, usually on a smaller scale.";
        StringReplace sr = new StringReplace();
        sr.stringReplace(input);
        // Also possible to use Regex
        // or StringBuffer
    }

    public void stringReplace(String input){
        char[] str = input.toCharArray();
        int spaceCount = 0;
        int newLength = 0;
        int length = str.length;
        int i = 0;

        for (i = 0; i < length; i++){
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        newLength = length + (spaceCount*2);
        // reallocate to new size
        str = new char[newLength];
        for (int c = 0; c < input.length(); c++){
            str[c] = input.charAt(c);
        }
        for (i = length - 1; i >= 0; i--){
            if(str[i] == ' '){
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            }
            else{
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        System.out.println(String.valueOf(str));
    }
}
