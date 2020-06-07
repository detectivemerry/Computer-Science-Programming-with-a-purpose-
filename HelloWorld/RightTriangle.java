//Computer Science: Programming with a purpose
// Week 1 assignment Hello, World
// Write a program RightTriangle that takes three int command-line arguments and determines
// whether they constitute the side lengths of some right triangle.
// The following two conditions are necessary and sufficient:
//     Each integer must be positive.
//     The sum of the squares of two of the integers must equal the square of the third integer.

public class RightTriangle {
    public static void main(String[] args) {

        int numOne = Integer.parseInt(args[0]);
        int numTwo = Integer.parseInt(args[1]);
        int numThree = Integer.parseInt(args[2]);

        boolean isPositive;
        boolean isAddedUp;
        boolean isRightTriangle;

        isPositive = numOne > 0 && numTwo > 0 && numThree > 0;
        isAddedUp = ((Math.pow(numOne, 2) + Math.pow(numTwo, 2)) == Math.pow(numThree, 2))
                || ((Math.pow(numThree, 2) + Math.pow(numTwo, 2)) == Math.pow(numOne, 2))
                || ((Math.pow(numThree, 2) + Math.pow(numOne, 2)) == Math.pow(numTwo, 2));
        isRightTriangle = isPositive && isAddedUp;

        System.out.println(isRightTriangle);


    }
}
