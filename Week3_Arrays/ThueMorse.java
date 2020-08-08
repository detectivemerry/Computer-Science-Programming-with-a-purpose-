public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] tm = new boolean[n];

        tm[0] = true;
        int p = 1;

        // Generate a Thue Morse suite of size n
        while (p < n) {
            int pcopy = p;
            // Copy the previous suite but inverted
            for (int i = 0; i < p; i++) {
                tm[pcopy] = !tm[i];
                pcopy++;

                if (pcopy == n)
                    break;
            }

            p = pcopy;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tm[i]) {
                    if (tm[j])
                        System.out.print("+  ");
                    else
                        System.out.print("-  ");
                }
                else {
                    if (tm[j])
                        System.out.print("-  ");
                    else
                        System.out.print("+  ");
                }
            }
            System.out.println();
        }


        // //create the morse array
        // Integer[] arrMorse = new Integer[n];
        //
        // //create morse code in string
        // String thue   = "0";
        // String morse  = "1";
        //
        // for (int i = 1; i <= n; i++) {
        //     String t = thue;             // save away values
        //     String m = morse;
        //     thue  += m;
        //     morse += t;
        // }
        //
        // // extract required number of morse code into array
        // for(int i =0; n > i; i++){
        //     arrMorse[i] = Integer.parseInt(String.valueOf(morse.charAt(i)));
        //     //System.out.println(arrMorse[i]);
        // }
        //
        // //Create matrix
        // for(int i = 0 ; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         if(arrMorse[i] == arrMorse[j])
        //             System.out.print("+ ");
        //         else System.out.print("- ");
        //     }
        //     System.out.println("");
        // }


    }
}
