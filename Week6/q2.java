import java.util.Scanner;

class TrafficLights {
    String color;
    int duration = 60;

    public void colourchange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color of the traffic light: ");
        color = sc.nextLine();
        System.out.println("The color of the traffic light is: " + color);
    }
}

class q2 {

    public static void main(String[] args) {
        TrafficLights t = new TrafficLights();
        t.colourchange();
    }

}