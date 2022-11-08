package lab2;

public abstract class Operations {
    public static double[][] multiplyMatrixByNumber(double[][] matrix, double num) {
        double[][] resMatrix = new double[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            resMatrix[i] = new double[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                resMatrix[i][j] = matrix[i][j] * num;
            }
        }
        return resMatrix;
    }

    public static double findSumOFMaxElementsInEvenColumns(double[][] matrix) {

        matrix = sortByLengthOfRows(matrix);

        double sum = 0;

        if (matrix.length == 0 || matrix[0].length == 0) {
            return sum;
        }

        double maxElementInColumn;
        double countMaxElementsInColumn;

        for (int i = 1; i < matrix[0].length; i += 2) {
            maxElementInColumn = matrix[0][i];
            countMaxElementsInColumn = 1;
            for (int j = 1; j < matrix.length; j++) {
                try {
                    if (matrix[j][i] > maxElementInColumn) {
                        maxElementInColumn = matrix[j][i];
                        countMaxElementsInColumn = 1;
                    } else if (matrix[j][i] == maxElementInColumn) {
                        countMaxElementsInColumn++;
                    }
                } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    break;
                }

            }

            sum += maxElementInColumn * countMaxElementsInColumn;
        }

        return sum;
    }


    public static double findSumOFMinElementsInOddColumns(double[][] matrix) {

        matrix = sortByLengthOfRows(matrix);

        double sum = 0;

        if (matrix.length == 0 || matrix[0].length == 0) {
            return sum;
        }

        double minElementInColumn;
        double countMinElementsInColumn;

        for (int i = 0; i < matrix[0].length; i += 2) {
            minElementInColumn = matrix[0][i];
            countMinElementsInColumn = 1;
            for (int j = 1; j < matrix.length; j++) {
                try {
                    if (matrix[j][i] < minElementInColumn) {
                        minElementInColumn = matrix[j][i];
                        countMinElementsInColumn = 1;
                    } else if (matrix[j][i] == minElementInColumn) {
                        countMinElementsInColumn++;
                    }
                } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    break;
                }

            }

            sum += minElementInColumn * countMinElementsInColumn;
        }

        return sum;
    }


    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static double[][] sortByLengthOfRows(double[][] matrix) {
        double[][] resMatrix = new double[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            resMatrix[i] = new double[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                resMatrix[i][j] = matrix[i][j];
            }
        }

        double[] temp;
        for (int i = resMatrix.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (resMatrix[j].length < resMatrix[j+1].length) {
                    temp = resMatrix[j];
                    resMatrix[j] = resMatrix[j+1];
                    resMatrix[j+1] = temp;
                }
            }
        }

        return resMatrix;
    }

}
