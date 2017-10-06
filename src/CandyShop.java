public class CandyShop {
    int sugar;
    int money = 0;

    public CandyShop() {
        this.sugar = sugar;
        this.money = money;
    }

    // It can store sugar and money as income. The constructor should take the amount of sugar in gramms.
    public CandyShop(int sugar) {
        this.sugar = sugar;
    }

    //Sweet type String, name it to print it

    public static String CANDY = "candy";
    public static String LOLLIPOP = "lollipop";

    // One lollipop's price is 10$
    // One candie's price is 20$
    // The price of 1000gr sugar is 100$

    int lollipopPrice = 10;
    int candyPrice = 20;

    // we can create lollipops and candies store them in the CandyShop's storage
    int candies = 0;
    int lollipops = 0;

    //create lollipop and candies, aka Sweets
    // If we create a candie or lollipop the CandyShop's sugar amount gets reduced by the amount needed to create the sweets

    public void createSweets(String type) {
        if (type.equals(CANDY)) {
            this.sugar -= 10;
            this.candies ++;
        }
        if (type.equals(LOLLIPOP)) {
            this.sugar -= 5;
            this.lollipops ++;
        }
    }

    // We can raise the prices of all candies and lollipops with a given percentage
    public void raise(int giveRaiseNumber) {
        this.candyPrice = this.candyPrice + (this.candyPrice * (giveRaiseNumber / 100));
        this.lollipopPrice = this.lollipopPrice + (this.lollipopPrice * (giveRaiseNumber / 100));
    }

    // If we sell sweets the income will be increased by the price of the sweets and we delete it from the inventory
    // We can sell candie or lollipop with a given number as amount
    public void sell(String type, int numberSell) {
        if (type.equals(CANDY)) {
            this.candies -= numberSell;
            this.money += this.candyPrice * numberSell;
        }
        if (type.equals(LOLLIPOP)) {
            this.lollipops -= numberSell;
            this.money += this.lollipopPrice * numberSell;
        }
    }
    // We can buy sugar with a given number as amount. The price of 1000gr sugar is 100$
    // If we buy sugar we can raise the CandyShop's amount of sugar and reduce the income by the price of it.
    public void buySugar(int sugarAmount) {
        this.sugar += sugarAmount;
        this.money -= Math.round(sugarAmount/10);
    }
    // "Inventory: 3 candies, 2 lollipops, Income: 100, Sugar: 400gr"

    @Override
    public String toString() {
        return ("Invetory: " + this.candies + " candies, " + this.lollipops + " lollipops, " + "Income: " + this.money + ", Sugar: " + this.sugar + "gr");
    }


}
