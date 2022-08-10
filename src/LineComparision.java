public class LineComparision {
    void compareToMethod(Double lengthOne, Double lengthTwo) {

        int compareValue = lengthOne.compareTo(lengthTwo);
        if (compareValue < 0) {
            System.out.println("Length of Line 2 is greater than Length of Line 1.");
        }
        else if (compareValue > 0) {
            System.out.println("Length of Line 1 is greater than Length of Line 2.");
        }
        else {
            System.out.println("Length of Line 1 and Length of Line 2 both are equal");
        }
    }
}
