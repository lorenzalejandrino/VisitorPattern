class StandardShippingCalc implements ShippingVisitor {
    @Override
    public void visit(Chair chair) {
        double cost = 30;
        System.out.println("Shipping cost for Chair: ₱" + cost);
    }

    @Override
    public void visit(Table table) {
        double cost = table.getArea() * 2.5;
        System.out.println("Shipping cost for Table: ₱" + cost);
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = (sofa.getVolume() * 3.0) + (sofa.getDistance() * 0.5);
        System.out.println("Shipping cost for Sofa (Distance: " + sofa.getDistance() + " km): ₱" + cost);
    }
}