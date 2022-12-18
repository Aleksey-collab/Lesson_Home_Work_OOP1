package lesson1;
public class Main {

    public static void main(String[] args) {

        HotDrink coffee = new  HotDrink("Coffee", 0.4, true, 60, 100);
        HotDrink tea = new  HotDrink("Tea", 0.4, true, 80, 40);
        HotDrink HotChocolate = new  HotDrink("HotChocolate", 0.5, false, 50, 150);
        HotDrinksVendingMachine hotDrVenMach = new HotDrinksVendingMachine();
        hotDrVenMach.addHotDrinks(coffee);
        hotDrVenMach.addHotDrinks(HotChocolate);
        hotDrVenMach.addHotDrinks(tea);

        System.out.println(hotDrVenMach.getHotDrinks());

        hotDrVenMach.shopHotDrinks();
    }
}