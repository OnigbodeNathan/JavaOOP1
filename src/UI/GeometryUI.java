package UI;

import javax.swing.*;
import java.awt.*;

public class GeometryUI {
    JFrame myFrame = new JFrame("Geometry");
    JButton areaOfSquareButton = new JButton("Area of a Square");
    JButton areaOfTriangleButton = new JButton("Area of a Triangle");
    JButton areaOfRectangleButton = new JButton("Area of a Rectangle");
    JFrame areaOfSquareFrame = new JFrame("Area of Square");
    JTextField enterLengthOfSquare = new JTextField("Enter Length");
    JButton calculateAreaOfSquare = new JButton("calculate");
    JFrame areaOfTriangleFrame = new JFrame("Area of Triangle");
    JTextField enterHeightOfTriangle = new JTextField("Enter Height");
    JTextField enterBaseOfTriangle = new JTextField("Enter Base");
    JButton calculateAreaOfTriangle = new JButton("calculate");
    JFrame areaOfRectangleFrame = new JFrame("Area of Rectangle");
    JTextField enterLengthOfRectangle = new JTextField("Enter Length");
    JTextField enterBreadthOfRectangle = new JTextField("Enter Breadth");
    JButton calculateAreaOfRectangle = new JButton("calculate");

    public void mainUI(){
        myFrame.add(areaOfSquareButton);
        myFrame.add(areaOfTriangleButton);
        myFrame.add(areaOfRectangleButton);
        myFrame.setSize(1150, 1200);
        myFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        // FIRST BUTTONS ON GUI !!!
        areaOfSquareButton.addActionListener(e -> {
            System.out.println("Calculate area of Square");
            JOptionPane.showMessageDialog(null, " Calculate the area of the Square");
            drawAreaOfSquareUI();
        });
        areaOfTriangleButton.addActionListener(e -> {
            System.out.println("Calculate area of Triangle");
            JOptionPane.showMessageDialog(null, " Calculate the area of the Triangle");
            drawAreaOfTriangleUI();
        });
        areaOfRectangleButton.addActionListener(e -> {
            System.out.println("Calculate area of Rectangle");
            JOptionPane.showMessageDialog(null, " Calculate the area of the Rectangle");
            drawAreaOfRectangleUI();
        });

        // FUNCTION CALL !!!
        calculateAreaOfTriangle.addActionListener(e -> {
            try{
                float height = Float.parseFloat(enterHeightOfTriangle.getText());
                float base = Float.parseFloat(enterBaseOfTriangle.getText());
                double area = 0.5 * height * base;
                JOptionPane.showMessageDialog(null, "The area of the triangle is " + area);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });

        calculateAreaOfRectangle.addActionListener(e -> {
            try{
                float length = Float.parseFloat(enterLengthOfRectangle.getText());
                float breadth = Float.parseFloat(enterBreadthOfRectangle.getText());
                float area = length * breadth;
                JOptionPane.showMessageDialog(null, "The area of the Rectangle is " + area);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });

        calculateAreaOfSquare.addActionListener(e -> {
            try{
                float length = Float.parseFloat(enterLengthOfSquare.getText());
                float area = length * length;
                JOptionPane.showMessageDialog(null, "The area of the square is " + area);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });
    }

    public void drawAreaOfSquareUI(){
        areaOfSquareFrame = new JFrame("Area of Square");
        areaOfSquareFrame.add(enterLengthOfSquare);
        areaOfSquareFrame.add(calculateAreaOfSquare);
        areaOfSquareFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        areaOfSquareFrame.setSize(150, 200);
        areaOfSquareFrame.setVisible(true);
    }
    public void drawAreaOfTriangleUI(){
        areaOfTriangleFrame = new JFrame("Area of Triangle");
        areaOfTriangleFrame.add(enterBaseOfTriangle);
        areaOfTriangleFrame.add(enterHeightOfTriangle);
        areaOfTriangleFrame.add(calculateAreaOfTriangle);
        areaOfTriangleFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        areaOfTriangleFrame.setSize(900,990);
        areaOfTriangleFrame.setVisible(true);
    }

    public void drawAreaOfRectangleUI(){
        areaOfRectangleFrame = new JFrame("Area of Rectangle");
        areaOfRectangleFrame.add(enterLengthOfRectangle);
        areaOfRectangleFrame.add(enterBreadthOfRectangle);
        areaOfRectangleFrame.add(calculateAreaOfRectangle);
        areaOfRectangleFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        areaOfRectangleFrame.setSize(900,990);
        areaOfRectangleFrame.setVisible(true);
    }
}
