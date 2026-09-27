class Circle {
    double radius;
    Circle() {
        radius = 1;
    }
    Circle(double r) {
        radius = r;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        System.out.println("Circumference of c1 = " + c1.calculateCircumference());
        System.out.println("Circumference of c2 = " + c2.calculateCircumference());
    }
}
