package studio4;

public class Flag {
    public static void drawFlag() {
        StdDraw.setCanvasSize(600, 400);
        StdDraw.setXscale(0, 3);
        StdDraw.setYscale(0, 2);
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.filledRectangle(0.5, 1, 0.5, 1);
        StdDraw.setPenColor(255, 223, 0);
        StdDraw.filledRectangle(1.5, 1, 0.5, 1);
        StdDraw.setPenColor(255, 0, 0);
        StdDraw.filledRectangle(2.5, 1, 0.5, 1);
    }

    public static void main(String[] args) {
        drawFlag();
    }
}
