package iterator.example;


/**
 * Created by Nicolas on 10/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        Menu myMenu = new Menu();

        MyIterator<String> menuIterator = myMenu.iterator();

        while (menuIterator.hasNext()){
            System.out.println(menuIterator.next());
        }
    }
}
