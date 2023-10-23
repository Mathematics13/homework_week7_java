package java_hw;

/** Wall. This class has two parameters width and height and provides the area of the wall
 * for a given width and height
 */

public class Wall {
    private double width;
    private double height;


    public Wall(double width, double height) {                                      // Constructor with parameters

        this.width = (width < 0) ? 0 : width;                                       // Set width to 0 if it's less than 0
        this.height = (height < 0) ? 0 : height;                                   // Set height to 0 if it's less than 0
    }

    /**
     *
     * @return width
     */
    public double getWidth()
    {
        return width;
    }

    /**
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     *
     * @param width
     */
    public void setWidth(double width) {

        this.width = (width < 0) ? 0 : width;                                     // Set width to 0 if it's less than 0
    }

    /**
     *
     * @param height
     */
    public void setHeight(double height) {

        this.height = (height < 0) ? 0 : height;                               // Set height to 0 if it's less than 0
    }

    /**
     * Method to calculate and return the area of the wall
     * @return area
     */

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);

        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}

/**
 * constructor has parameters width and height of type double and it needs to initialize the fields.
 * In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.
 *
 * Write the following methods (instance methods):
 * Method named getWidth without any parameters, it needs to return the value of width field.
 * Method named getHeight without any parameters, it needs to return the value of height field.
 * Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
 * Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * Method named getArea without any parameters, it needs to return the area of the wall.
 */
