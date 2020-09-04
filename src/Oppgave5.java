import java.util.NoSuchElementException;

public class Oppgave5 {


    public static void rotasjon(char[] a)
    {
        int n = 1;

            if (a == null) {
                System.out.println(0);
            }


if(a.length>0) {
    for (int i = 0; i < n; i++) {

        int sisteElement = a[a.length - 1];

        for (int j = a.length - 1; j > 0; j--) {
            a[j] = a[j - 1];
        }

        a[0] = (char) sisteElement;
    }


    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }

}


    }


//

    public static void main(String args[]) {

        char [] a = {};
        Oppgave5.rotasjon(a);

    }
}
