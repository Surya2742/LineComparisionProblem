public class Line {
    double getLineLength(Point P1, Point P2) {
        return Math.sqrt(Math.pow((P2.x-P1.x), 2) + Math.pow((P2.y-P1.y), 2));
    }
}
