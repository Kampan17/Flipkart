import java.util.Objects;

class ShoppingCartItem {
    private String itemName;
    private double price;
    private int quantity;

    public ShoppingCartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + "\nPrice: $" + price + "\nQuantity: " + quantity + "\nTotal: $" + getTotalPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCartItem that = (ShoppingCartItem) o;
        return Double.compare(that.price, price) == 0 &&
                quantity == that.quantity &&
                Objects.equals(itemName, that.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, price, quantity);
    }
}

public class ShoppingCartExample {
    public static void main(String[] args) {
        ShoppingCartItem item1 = new ShoppingCartItem("Laptop", 999.99, 2);
        ShoppingCartItem item2 = new ShoppingCartItem("Headphones", 79.99, 3);

        System.out.println("Item 1:\n" + item1);
        System.out.println("\nItem 2:\n" + item2);
    }
}
