public class LineComparision {
    double coOrdinates (int x1, int x2, int y1, int y2) {
        double lengthFormula = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return lengthFormula;
    }
    public static void main(String[] args) {
        LineComparision calculation = new LineComparision();
        Double lengthOne = calculation.coOrdinates(1, 5, 3, 4);
        System.out.println("LengthOne value is " + lengthOne);
        Double lengthTwo = calculation.coOrdinates(1, 7, 2, 4);
        System.out.println("LengthTwo value is " + lengthTwo);
        int compareValue = lengthOne.compareTo(lengthTwo);
        if (compareValue < 0) {
            System.out.println("LengthTwo is greater than LengthOne");
        }
        else if (compareValue > 0) {
            System.out.println("LengthOne is greater than LengthTwo");
        }
        else {
            System.out.println("LengthOne and LengthTwo are equal");
        }
    }
}
