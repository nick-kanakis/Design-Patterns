package iterator.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class Menu implements MyIterable<String> {
    private static final int MAX_MENU_ITEMS = 10;
    private String[] menuItems;

    public Menu() {
        menuItems = new String[MAX_MENU_ITEMS];
        menuItems[0] = "Salad #1";
        menuItems[1] = "Salad #2";
        menuItems[2] = "Main course #1";
        menuItems[3] = "Main course #2";
        menuItems[4] = "Main course #3";
        menuItems[5] = "Dessert #1";
        menuItems[6] = "Dessert #2";
        menuItems[7] = "Dessert #3";
    }

    @Override
    public MyIterator<String> iterator() {
        return new MenuIterator(menuItems);
    }
}
