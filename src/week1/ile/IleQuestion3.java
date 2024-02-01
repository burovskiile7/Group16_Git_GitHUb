package week1.ile;

public class IleQuestion3 {

    //FINRA
    public static void main(String[] args) {
        finra(31);
    }

    public static void finra(int n){
        for (int i = 0; i < n ; i++) {
            String str = "";

            if (i % 3 == 0){
                str += "FIN";
            }
            if (i%5 == 0){
                str += "RA";
            }
            System.out.println(str.isEmpty() ? i : str);
        }
    }
}
