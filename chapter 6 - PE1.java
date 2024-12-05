public class Circle {
    private double radius; //private because we don't want this number changing

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative. Setting radius to 0.");
            this.radius = 0.0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative.");
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle [Radius: " + radius + ", Area: " + getArea() + "]";
    }

    public boolean equals(Circle otherCircle) {
        return this.radius == otherCircle.radius;
    }

    public boolean greaterThan(Circle otherCircle) {
        return this.getArea() > otherCircle.getArea();
    }

    public static void compareCircles(Circle c1, Circle c2) {
        if (c1.equals(c2)) {
            System.out.println("Both circles are equal.");
        } else if (c1.greaterThan(c2)){
            System.out.println("The first circle is larger.");
        } else {
            System.out.println("The second circle is larger.");
        }
    }

    public static void main(String[] args) {

        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);

        System.out.println(circle1);
        System.out.println(circle2);

        compareCircles(circle1, circle2);

        circle2.setRadius(5.0);
        compareCircles(circle1, circle2);
    }

}
