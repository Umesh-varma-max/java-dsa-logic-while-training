// Base Class
class FoodItem {
    int itemId;
    String itemName;
    double unitPrice, quantity;

    FoodItem(int itemId, String itemName, double unitPrice, double quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    double calculateBill() {
        double baseCost = unitPrice * quantity;
        double gst = baseCost * 0.05;
        double total = baseCost + gst;
        if (total > 1000) {
            double discount = total * 0.10;
            total -= discount;
        }
        return total;
    }

    void displayDetails() {
        System.out.println("Food Item Record:");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
    }
}

// DineIn Class
class DineIn extends FoodItem {
    double serviceCharge;

    DineIn(int itemId, String itemName, double unitPrice, double quantity, double serviceCharge) {
        super(itemId, itemName, unitPrice, quantity);
        this.serviceCharge = serviceCharge;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + serviceCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        if (total > 1000) {
            double discount = total * 0.10;
            total -= discount;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity;
        double totalBeforeDiscount = subtotal + serviceCharge;
        double gst = totalBeforeDiscount * 0.05;
        double discount = 0;
        double total = totalBeforeDiscount + gst;
        if (total > 1000) {
            discount = total * 0.10;
            total -= discount;
        }

        super.displayDetails();
        System.out.println("Service Charge: " + serviceCharge);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
        System.out.println();
    }
}

// Takeaway Class
class Takeaway extends FoodItem {
    double packingCharge;

    Takeaway(int itemId, String itemName, double unitPrice, double quantity, double packingCharge) {
        super(itemId, itemName, unitPrice, quantity);
        this.packingCharge = packingCharge;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + packingCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        if (total > 1000) {
            double discount = total * 0.10;
            total -= discount;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity;
        double totalBeforeDiscount = subtotal + packingCharge;
        double gst = totalBeforeDiscount * 0.05;
        double discount = 0;
        double total = totalBeforeDiscount + gst;
        if (total > 1000) {
            discount = total * 0.10;
            total -= discount;
        }

        super.displayDetails();
        System.out.println("Packing Charge: " + packingCharge);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
        System.out.println();
    }
}

// Delivery Class
class Delivery extends FoodItem {
    double deliveryCharge;

    Delivery(int itemId, String itemName, double unitPrice, double quantity, double deliveryCharge) {
        super(itemId, itemName, unitPrice, quantity);
        this.deliveryCharge = deliveryCharge;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + deliveryCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        if (total > 1000) {
            double discount = total * 0.10;
            total -= discount;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity;
        double totalBeforeDiscount = subtotal + deliveryCharge;
        double gst = totalBeforeDiscount * 0.05;
        double discount = 0;
        double total = totalBeforeDiscount + gst;
        if (total > 1000) {
            discount = total * 0.10;
            total -= discount;
        }

        super.displayDetails();
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
        System.out.println();
    }
}

// Main Class
public class RestaurantBillingSystem {
    public static void main(String[] args) {
        FoodItem[] orders = new FoodItem[3];

        orders[0] = new DineIn(101, "Paneer Butter Masala", 250.0, 4, 50.0);
        orders[1] = new Takeaway(102, "Veg Biryani", 180.0, 2, 20.0);
        orders[2] = new Delivery(103, "Chicken Pizza", 300.0, 4, 40.0);

        for (FoodItem item : orders) {
            item.displayDetails(); // Runtime Polymorphism
        }
    }
}
