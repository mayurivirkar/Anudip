import java.util.*;

public class patternNum3 {
    public static void main(String[] args) {

        int n = 5;
        int number = 1;

        for (int i=1; i<=n; i++){

            for (int j=1; j<= i; j++){
                System.out.print(number+ " ");

                number++; //Number incresed by 1
            }
            System.out.println();
        }
    }
}
