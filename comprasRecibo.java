public static void main(String[] args) {
        // Create items
        Item milk = new Item("dairy-011", "1 Gallon Milk", 2, 2.50);
        Item yogurt = new Item("dairy-032", "Peach Yogurt", 4, 0.68);
        Item bread = new Item("bakery-023", "Sliced Bread", 1, 2.55);
        Item soap = new Item("household-21", "6 Pack Soap", 1, 4.51);

        // Apply discounts
        milk.setDiscount(0.15);

        // Get adjusted prices
        double milkPrice = milk.getAdjustedTotal();
        double yogurtPrice = yogurt.getAdjustedTotal();
        double breadPrice = bread.getAdjustedTotal();
        double soapPrice = soap.getAdjustedTotal();

        // Print receipt
        System.out.println("Thank You For Your Purchase.");
        System.out.println("Please, Come again!");
        System.out.println(milk.getDescription() + "\t $" + milkPrice);
        System.out.println(yogurt.getDescription() + "\t $" + yogurtPrice);
        System.out.println(bread.getDescription() + "\t $" + breadPrice);
        System.out.println(soap.getDescription() + "\t $" + soapPrice);

        // Calculate and print total
        double total = milkPrice + yogurtPrice + breadPrice + soapPrice;
        System.out.println("Total Price \t $" + total);
}

