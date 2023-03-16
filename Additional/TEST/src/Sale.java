/**
 * @author Elias De Hondt
 * 16/03/2023
 */
public class Sale {
    public double getTotal() {
        SalesLineItem[] lineItems = new SalesLineItem[3];

        double total = 0;
        for (SalesLineItem sli: lineItems) {
            ProductDescription description = sli.getProductDescription();
            total += sli.getQuantity() * description.getPrice();
        }
        return total;
    }
}

