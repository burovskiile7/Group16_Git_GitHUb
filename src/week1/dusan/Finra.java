package week1.dusan;

public class Finra {

    public static void main(String[] args) {

        String str = "";


        for (int i = 1; i < 31; i++) {



            if(i % 3 == 0){
             str += "FIN";
            }else if (i % 5 == 0){
               str += "RA";
            }else if (i % 15 == 0){
                str += "FINRA";
            }else {
               str += i + " ";
            }
        }
        System.out.println(str);

















    }
}
