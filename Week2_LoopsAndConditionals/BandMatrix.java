public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        boolean isWithin = false;
        String result =  "0";

        int temp = 0;

        // iterate rows
        for(int i = 0; i < n; i++){
            // iterate collums
            for(int j = 0; j < n; j++){
                //initialize variables
                isWithin = false;
                temp = 0;

                // if diagonal row
                if(i == j)isWithin = true;
                else {
                    //keep adding to j, check if it reaches i

                    for(int k = temp; k <= width; k++){
                    //while (temp <= width) {
                        //if within width
                        if ((j + k) == i || (j - k) == i){
                            isWithin = true;
                            break;
                        }
                        //temp++;
                    }
                }

                if(isWithin)result = "*";
                else result = "0";

                System.out.print(result+" ");
            }
            System.out.println("");

        }

    }
}
