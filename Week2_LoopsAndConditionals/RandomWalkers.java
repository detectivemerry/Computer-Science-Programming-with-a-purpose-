public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int tempTrials = trials;

        int x = 0, y = 0, select = 0;
        double count =0;

        while(tempTrials > 0){
            x = 0;
            y = 0;

            while (Math.abs(x) + Math.abs(y) != r) {
                //initialize variables
                select = (int) (Math.random() * 4);
                if(select == 0)x++;
                else if(select == 1)y++;
                else if(select == 2)x--;
                else if(select == 3)y--;
                count++;

            }
            tempTrials--;
        }
        count = count/trials;
       System.out.println("average number of steps = "+count);
    }
}
