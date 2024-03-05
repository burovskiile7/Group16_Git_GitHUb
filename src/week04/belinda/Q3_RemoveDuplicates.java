package week04.belinda;

public class Q3_RemoveDuplicates {
    public static void main(String[] args) {


        String str = "AAABBBCCC";
        String result= "";//ABC

        for(int i =0; i< str.length(); i++){

            if(result.contains("" + str.charAt(i) )){
                continue;
            }
            result += str.charAt(i);
        }
        System.out.println(result);


    }
}
