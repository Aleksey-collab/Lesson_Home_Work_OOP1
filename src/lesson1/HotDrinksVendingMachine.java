package lesson1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Автомат горячих напитков.
public class HotDrinksVendingMachine implements VendingMachines {
    private List<HotDrink> hotDrinks;

    // конструктор
    public HotDrinksVendingMachine() {
        this.hotDrinks = new ArrayList<>();
    }

    // метод добавляющий горячий напиток в список
    public void addHotDrinks(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    @Override
    public void acceptingMoney() {
        System.out.println("Автомат принял деньги");
    }

    @Override
    public void productDelivery() {
        System.out.print("Автомат выдал горячий напиток: ");

    }

    @Override
    public void deliveryOfChange() {
        System.out.println("Автомат выдал сдачу");
    }
    public void shopHotDrinks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Введите горячий напиток который хотели бы купить,\n из перечисленных!");
        for (HotDrink hotDrink2 : hotDrinks) {
            System.out.print(hotDrink2.getDrink() + "  ");
            }
        System.out.print("\n Поле для ввода: ");
        String inputHotDrink = sc.nextLine();
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getDrink().equals(inputHotDrink)) {
                System.out.println("Внесите сумму стоимости напитка!\n Стоимость товара = " + hotDrink.getPrice());
                System.out.print("Внесение суммы: ");
                String enterMoney = sc.nextLine();
                int intMoney = Integer.parseInt(enterMoney);
                if (intMoney >= hotDrink.getPrice()) {
                    acceptingMoney();
                    productDelivery();
                    System.out.println(hotDrink);
                    int change = intMoney - hotDrink.getPrice();
                    deliveryOfChange();
                    System.out.println("Сдача = " + change);
                } else {
                        acceptingMoney();
                        System.out.println("Вы ввели недостаточно средств!");
                }

            }
        }
    }
}
