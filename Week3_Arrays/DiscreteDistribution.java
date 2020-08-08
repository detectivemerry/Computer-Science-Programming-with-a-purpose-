public class DiscreteDistribution {
    public static void main(String[] args) {

        int n = args.length;
        int m = Integer.parseInt(args[0]);
        int[] s = new int[n + 1];

        s[0] = 0;
        for (int i = 1; i < n; i++)
            s[i] = s[i - 1] + Integer.parseInt(args[i]);

        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * (s[n - 1]));
            int index = 0;

            while (!(r < s[index]))
                index++;

            System.out.print(index + " ");
        }


    }
}
