import java.util.EmptyStackException;
public class MyArrayListStack<E> {
    private MyArrayList<E> array;

    public MyArrayListStack() {
        array = new MyArrayList<>();
    }
    public void push(E element) {
        array.add(element);
    }

}