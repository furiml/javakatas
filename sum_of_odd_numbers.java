/* Adrien Scrève
 * https://www.codewars.com/kata/sum-of-odd-numbers/train/java
*/


class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int firstInt = n * (n-1) + 1; // determines the first int of the row
        int sum = 0;
        if (n > 1) {
          for (int j = 0; j < n; j++) { // number of numbers on the row
            sum += firstInt + j * 2; }}
        else {
          return 1; }
        return sum;
    }
}

// and all you had to do was return n*n*n ._.
