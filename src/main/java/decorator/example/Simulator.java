package decorator.example;

/**
 * Created by Nicolas on 2/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        Beverage frenchCoffee = new FrenchCoffee();

        System.out.println(espresso.printDescription());
        System.out.println("Cost: "+ espresso.getCost());
        System.out.println(frenchCoffee.printDescription());
        System.out.println("Cost: "+ frenchCoffee.getCost());
        System.out.println("Add sugar to espresso");
        espresso = new WithSugar(espresso);
        System.out.println(espresso.printDescription());
        System.out.println("Cost: "+ espresso.getCost());
        System.out.println("Add milk to espresso");
        espresso = new WithMilk(espresso);
        System.out.println(espresso.printDescription());
        System.out.println("Cost: "+ espresso.getCost());
        System.out.println("Add milk to french coffee");
        frenchCoffee = new WithMilk(frenchCoffee);
        System.out.println(frenchCoffee.printDescription());
        System.out.println("Cost: "+ frenchCoffee.getCost());

    }
}
