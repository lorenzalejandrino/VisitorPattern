class Table implements Furniture {
    private double area;

    public Table(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
