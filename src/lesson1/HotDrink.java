package lesson1;
// Горячий напиток.
public class HotDrink extends Drink{
    int temperature;
    int price;


    public HotDrink(String drink, double volume, Boolean sugar, int temperature, int price) {
    super(drink, volume, sugar);
    this.temperature = temperature;
    this.price = price;
}

    public int getTemperature() {
        return temperature;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
    return "\n \n drink = " + super.getDrink() + "\n volume = " + super.getVolume() + "\n sugar = " + super.getSugar() + "\n temperature = " + temperature + "\n price = " + price ;
}
}
