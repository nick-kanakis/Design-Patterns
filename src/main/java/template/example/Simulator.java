package template.example;

/**
 * Created by Nicolas on 9/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        BeverageTemplate coffee = new Coffee();
        BeverageTemplate tea = new Tea();

        System.out.println("COFFEE");
        coffee.prepareBeverage();
        System.out.println("TEA");
        tea.prepareBeverage();
    }
}
