interface Resizable {
    void resizeWidth(int width);

    void resizeHeight(int height);
}
class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void resizeWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width. Width should be greater than 0.");
        }
    }
    @Override
    public void resizeHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Invalid height. Height should be greater than 0.");
        }
    }

    public void displayDimensions() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);}}
public class q7 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Original Dimensions:");
        rectangle.displayDimensions();
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(25);

        System.out.println("\nResized Dimensions:");
        rectangle.displayDimensions();
    }
}
