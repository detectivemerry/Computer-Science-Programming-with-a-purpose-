public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int count = 0, x = 0, y = 0, select = 0;

        System.out.println("(0, 0)");

        while(Math.abs(x) + Math.abs(y) != r){
            //initialize variables
            select = (int)(Math.random()*4);

            if(select == 0)x++;
            else if(select == 1)y++;
            else if(select == 2)x--;
            else if(select == 3)y--;

            count++;
            System.out.println("("+x+", "+y+")");

        }
        System.out.println("steps = "+count);



    }
}
