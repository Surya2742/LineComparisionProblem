public class LineComparision {

    double coOrdinates (int x1, int x2, int y1, int y2) {
        double lengthFormula = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return lengthFormula;
    }

    public static void main(String[] args) {
        LineComparision calculation = new LineComparision();
        double length = calculation.coOrdinates(1, 5, 3, 4);
        System.out.println("Distance between two point is: " + length);
    }

}
