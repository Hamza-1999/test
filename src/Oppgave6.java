import java.util.Arrays;

public class Oppgave6 {



        public static void rotasjon(char[] a, int k) {

                    String rotation;

                    if (k < 0) { // hvis K er mindre enn 0, så er det negativt tall.
                        k = -k; // vi lagrer k som -K
                        rotation = "left"; // her inne tildeles Rotation negativ verdi, den får det hvis K viser seg å være negativ
                    } else {
                        rotation = "right"; // Eller så har den ikke vært i den negative IF statement, og er positiv
                    }

                    if (k < a.length) { // Hvis K er  mindre enn array sin lengde så kjør. viktig å påse at den er mindre..

                        for (int i = 0; i < k; i++) { // // Kjør gjennom K, hva er input verdiene?? Det skal være mindre enn K

                            char temp;

                            int j;

                            if (rotation.equals("left")) { // Hvis K var negativ, altså - kjør denne if statement...
                                temp = a[0]; // første verdi i array, lagre første verdi nå starter du fra start.
                                for (j = 0; j < a.length - 1; j++) { // kjør gjennom array

                                    a[j] = a[j + 1]; // alt som ble truffet på veien i array, lagres i a[j]

                                }
                            } else {
                                temp = a[a.length-1]; // Siste indeks i array, lagre siste verdi i arrayet, fordi nå starter du bakfra
                                for (j = a.length-1; j > 0; j--) { // kjører fra slutt og bakover
                                    a[j] = a[j - 1]; // lagrer alt som traff på veien bak i a{j]
                                }
                            }

                            a[j] = temp;



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