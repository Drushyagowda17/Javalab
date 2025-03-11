package Java;

class Circle {
    private double radius;

    public Circle(double radius) { // Constructor name fixed
        this.radius = radius;
    }

    public double calculation() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() { // Method name formatting fixed
        return 2 * Math.PI * radius;
    }

    public void displayDetails() { // Method name fixed
        System.out.println("Circle details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculation());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0); // Object creation fixed
        circle1.displayDetails(); // Method call fixed
    }
}