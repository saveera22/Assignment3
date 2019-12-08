
public class Main
{
    public Main(int i, String n) {
    }

    public static void main(String args[])
    {

        System.out.println("_______________");
        System.out.println("Demo Department Billing Service:");
        Grocery bread = new Grocery(11,"Bread",2,1.50,0,0);
        Grocery apple = new Grocery(12,"Apple",6,0.75,1,0);

        Clothing jeans = new Clothing(21,"Jeans","Levis",35,1,0);
        Clothing dShirt = new Clothing(21,"Dress Shirt","Izod",35,1,10);

        bread.displayGrocery();
        apple.displayGrocery();

        jeans.displayClothing();
        dShirt.displayClothing();

        System.out.println("_______________");
        System.out.println("Total Bill Amount: $"+((bread.computePrice() + apple.computePrice() + jeans.computePrice() + dShirt.computePrice())));
        System.out.println("_________________");
    }

    protected void display() {
    }
}


