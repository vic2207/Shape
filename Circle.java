class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String name() {
        return "Circle";
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Quad extends Shape {
    private double sideLength;

    public Quad(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String name() {
        return "Quadrilateral";
    }

    public double area() {
        return Math.pow(sideLength, 2);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String name() {
        return "Triangle";
    }

    public double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    public double area() {
        return width * height;
    }
}

class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public String name() {
        return "Ellipse";
    }

    public double area() {
        return Math.PI * majorAxis * minorAxis;
    }
}

