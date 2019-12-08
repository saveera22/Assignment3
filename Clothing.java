public class Clothing extends Item implements Discount,Tax
{
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp=8.5;

    public Clothing(int i, String n, String b, double p, double u, double d)
    {
        super(i, n);
        brand = b;
        price = p;
        units = u;
        discount = d;

    }

    public double computeDiscount()
    {
        if (discount != 0)
        {
            return discount/100;
        }
        else
        {
            return 0.00;
        }
    }

    public double computeTax()
    {
        return taxp/100;
    }

    public double computePrice()
    {
        return ((price - (price*computeDiscount())) + (price*computeTax()));
    }

    public void displayClothing()
    {

        System.out.println("_________________");
        super.display();
        System.out.println("Brand: "+brand);
        System.out.println("Number of Units "+units);
        System.out.println("_________________");
        System.out.println("Original Price: $"+(price));
        System.out.println("Item Savings: "+discount+"%");
        System.out.println("Tax: "+taxp+"%");
        System.out.println("Final Price: $"+(computePrice()));
        System.out.println("_________________");
        System.out.println("");
        System.out.println("");
    }

}
