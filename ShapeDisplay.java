class ShapeDisplay {
    private Shape shape;

    public ShapeDisplay(Shape shape) {
        this.shape = shape;
    }

    public void displayShapeName() {
        shape.display();
    }
}

