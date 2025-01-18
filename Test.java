public class Test {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape quad = new Quad(4);
        Shape triangle = new Triangle(3, 6);
        Shape rectangle = new Rectangle(5, 10);
        Shape ellipse = new Ellipse(7, 3);


        Shape[] shapes = {circle, quad, triangle, rectangle, ellipse};


        System.out.println("Testing Shape Names:");
        for (Shape shape : shapes) {
            ShapeDisplay shapeDisplay = new ShapeDisplay(shape);
            shapeDisplay.displayShapeName();
        }


        System.out.println("\nTesting Shape Areas:");
        for (Shape shape : shapes) {
            System.out.print(shape.name() + " Area: ");
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println(c.area());
            } else if (shape instanceof Quad) {
                Quad q = (Quad) shape;
                System.out.println(q.area());
            } else if (shape instanceof Triangle) {
                Triangle t = (Triangle) shape;
                System.out.println(t.area());
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.println(r.area());
            } else if (shape instanceof Ellipse) {
                Ellipse e = (Ellipse) shape;
                System.out.println(e.area());
            }
        }
    }
}
