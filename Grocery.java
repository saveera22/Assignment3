
public class Grocery extends Main implements Discount, Tax
{
    double price;
    double units;
    double discount;
    double taxp;

    public Grocery(int i, String n, double u, double p, double d, double t)

    {
        super (i, n);
        price = p;
        units = u;
        discount = d;
        taxp = t;
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
        if (taxp != 0)
        {
            return taxp/100;
        }
        else
        {
            return 0.00;
        }
    }

    public double computePrice()
    {
        return ((price - (price*computeDiscount())) + (price*computeTax()));
    }

    public void displayGrocery()
    {

        System.out.println("____________");
        super.display();
        System.out.println("Number of Units: "+units);
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

