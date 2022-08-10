public class Main {

    public static void main(String[] args) {
        Point P1 = new Point();
        InputScanner ip = new InputScanner();
        System.out.print("Enter x value for point 1 : ");
        P1.x = ip.inputInteger();
        System.out.print("Enter y value for point 1 : ");
        P1.y = ip.inputInteger();

        Point P2 = new Point();
        System.out.print("Enter x value for point 2 : ");
        P2.x = ip.inputInteger();
        System.out.print("Enter y value for point 2 : ");
        P2.y = ip.inputInteger();

        Point P3 = new Point();
        System.out.print("Enter x value for point 3 : ");
        P3.x = ip.inputInteger();
        System.out.print("Enter y value for point 3 : ");
        P3.y = ip.inputInteger();

        Point P4 = new Point();
        System.out.print("Enter x value for point 4 : ");
        P4.x = ip.inputInteger();
        System.out.print("Enter y value for point 4 : ");
        P4.y = ip.inputInteger();

        Line line = new Line();
        Double lineOne = line.getLineLength(P1, P2);
        System.out.println("The Length of Line 1 is : " + lineOne);
        Double lineTwo = line.getLineLength(P3, P4);
        System.out.println("The Length of Line 2 is : " + lineTwo);

        LineComparision lc = new LineComparision();
        lc.compareToMethod(lineOne, lineTwo);
    }
}
