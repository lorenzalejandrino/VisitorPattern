public class ShippingCalc {
    public static void main(String[] args) {
        Furniture[] items = {
                new Chair(10),
                new Table(15),
                new Sofa(35, 100.0)
        };

        ShippingVisitor calculator = new StandardShippingCalc();
        for (Furniture item : items) {
            item.accept(calculator);
        }
    }
}