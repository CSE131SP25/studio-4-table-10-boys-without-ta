package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class InterpretDrawingFile {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        JFileChooser fileChooser = new JFileChooser(new File("resources"));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + file.getName());
            try {
                Scanner in = new Scanner(file);
                String shapeType = in.next();
                int red = in.nextInt();
                int green = in.nextInt();
                int blue = in.nextInt();
                boolean isFilled = in.nextBoolean();
                StdDraw.setPenColor(red, green, blue);
                if (shapeType.equals("rectangle")) {
                    double x = in.nextDouble();
                    double y = in.nextDouble();
                    double halfWidth = in.nextDouble();
                    double halfHeight = in.nextDouble();
                    if (isFilled) {
                        StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
                    } else {
                        StdDraw.rectangle(x, y, halfWidth, halfHeight);
                    }
                } else if (shapeType.equals("ellipse")) {
                    double x = in.nextDouble();
                    double y = in.nextDouble();
                    double halfWidth = in.nextDouble();
                    double halfHeight = in.nextDouble();
                    if (isFilled) {
                        StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
                    } else {
                        StdDraw.ellipse(x, y, halfWidth, halfHeight);
                    }
                } else if (shapeType.equals("triangle")) {
                    double x1 = in.nextDouble();
                    double y1 = in.nextDouble();
                    double x2 = in.nextDouble();
                    double y2 = in.nextDouble();
                    double x3 = in.nextDouble();
                    double y3 = in.nextDouble();
                    if (isFilled) {
                        StdDraw.filledPolygon(new double[]{x1, x2, x3}, new double[]{y1, y2, y3});
                    } else {
                        StdDraw.polygon(new double[]{x1, x2, x3}, new double[]{y1, y2, y3});
                    }
                }
                in.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found!");
            }
        } else {
            System.out.println("No file selected.");
        }
    }
}
