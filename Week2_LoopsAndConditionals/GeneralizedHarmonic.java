public class GeneralizedHarmonic {
    public static void main(String[] args) {
        double answer = 0;
        double n = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);

        //while(n > 0){
        for(double i = n; i > 0; i--){

            answer += (1/Math.pow(i,r));
             //n--;

        }

        System.out.println(answer);



    }
}
