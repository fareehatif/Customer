package customer;

/**
 * This class +++Insert Description Here+++
 *
 * @author Fareeha Mirza Feb 4th 2021
 */
class Customer {
    private final double subtotal;
    private double discountPercent;
    private double discountAmount;
    private double total;
    private final char type;

    public Customer(char type, double subtotal) {
    this.type = type;
    this.subtotal = subtotal;
        if (type == 'R') {
            calculateDiscountR();
            calculateTotal(); 
        }
        else if (type == 'C') {
            calculateDiscountC();
            calculateTotal();
        }
    }

    public void calculateDiscountR() {
        if (subtotal >= 250)
            discountPercent = 0.25;
        else if (subtotal >= 100)
            discountPercent = 0.10;
        else  if (subtotal < 100)
            discountPercent = 0;
    }

    public void calculateDiscountC() {
        if (subtotal >= 250)
            discountPercent = 0.30;
        else if (subtotal < 250)
            discountPercent = 0.20;
    }
    public void calculateTotal() {
        total = subtotal - (subtotal * discountPercent);

    }
    @Override
    public String toString() {
        return ("Discount Percent: " + discountPercent + "\n\n"
                + "Discounted Amount: " + discountAmount + "\n\n"
                + "Total: " + total);
    }
}
