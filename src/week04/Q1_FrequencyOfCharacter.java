package week04;

public class Q1_FrequencyOfCharacter {
    public static void main(String[] args) {


        String str = "AAABBCDD";
        String result = "";//A3B2C1D2


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch){
                    count++;
                }
            }

            if(result.contains("" + ch)){
                continue;
            }

            result += ch + "" + count;
        }

        System.out.println(result);



    }
}
