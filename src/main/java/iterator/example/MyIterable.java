package iterator.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public interface MyIterable <T> {
    MyIterator<T> iterator();
}
