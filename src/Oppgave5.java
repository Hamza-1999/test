public class Oppgave5 {


    public static void rotasjon(char[] a)
    {
        int n = 1; // antall ganger man ønsker å rotere arrayet.
        int j;

        for (int i=0;i<n;i++){ // Roterer den antall ganger N ganger til høyre

            int sisteElement = a[a.length-1]; // lagrer siste element av arrayet, må minus 1 for åfinne det siste element.

            for(j=a.length-1;j>0;j--){ // Ny for loop i en for loop der man shifter elementene,1 og 1
                a[j] = a[j-1];
            }

            a[0] = (char) sisteElement; // Her settes siste element til å være første. Altså J til å bli A.
        }



        for(int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }



    }


//

    public static void main(String args[]) {

        char [] a = {'A','B','C','D','E','F','G','H','I','J'};
        Oppgave5.rotasjon(a);

    }
}
