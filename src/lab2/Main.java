package lab2;

/*
    C5 = 0
    C7 = 0
    C11 = 6
 */



public class Main {
    public static final double NUM = 5;
    public static void main(String[] args) {
        double[][] arr = {
                {1, 7, 5, 3},
                {5, 4, 6},
                {2, 7, 3, 3, -6},
                {5, 4, 7, 2, -6}
        };
        Operations.printMatrix(arr);

        System.out.println("-----------");

        arr = Operations.multiplyMatrixByNumber(arr, NUM);
        Operations.printMatrix(arr);

        System.out.println("-----------");

        System.out.println("Sum max: " + Operations.findSumOFMaxElementsInEvenColumns(arr));

        System.out.println("Sum min: " + Operations.findSumOFMinElementsInOddColumns(arr));
    }
}
