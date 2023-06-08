public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item("mocha", 3.00);
        Item item2 = new Item("latte", 7.00);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino", 8.00);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Everett");
        Order order4 = new Order("Wendy");
        Order order5 = new Order("Vince");


        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item4);

        order4.addItem(item3);
        order4.addItem(item3);

        order5.addItem(item4);
        order5.addItem(item2);


        System.out.println(order3.getStatusMessage());
        order3.setReady(true);
        System.out.println(order3.getStatusMessage());

        System.out.println(order1.getOrderTotal());
        order1.display();
    }
}