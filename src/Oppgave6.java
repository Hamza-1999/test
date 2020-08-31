import java.util.Arrays;

public class Oppgave6 {

    public static void rotasjon(char[]a, int k){

        if (k<0){
            for (int i = 0; i < k; i++)
            {
               int temp = a[0];

                for (int j = 0; j < a.length-1; j++)
                {
                    a[j] = a[j+1];
                }

                a[a.length - 1] = (char) temp;

        }
        }



        if(k>0) {
            for (int i = 0; i < k; i++) {
                int sisteElement = a[a.length - 1];

                for (int j = a.length - 1; j > 0; j--) {
                    a[j] = a[j-1];
                }

                a[0] = (char) sisteElement;
            }
        }


    }








    public static void main(String args[]) {

        char [] a = {'A','B','C','D','E','F','G','H','I','J'};
        System.out.println(Arrays.toString(a));

        rotasjon(a,3);
        System.out.println(Arrays.toString(a));

        rotasjon(a,-2);
        System.out.println(Arrays.toString(a));


    }
}