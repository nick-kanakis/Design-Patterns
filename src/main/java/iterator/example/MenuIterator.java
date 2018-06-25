package iterator.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class MenuIterator implements MyIterator<String> {
    private String[] menuItems;
    int position = 0;

    MenuIterator(String[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position]==null)
            return false;
        return true;
    }

    @Override
    public String next() {
        String menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
