import java.util.EmptyStackException;
public class MyArrayListQueue<E> {
    private MyArrayList<E> array;

    public MyArrayListQueue() {
        array = new MyArrayList<E>();
    }

    public void enqueue(E element) {
        array.add(element);
    }

    public E dequeue() {
        checkEmpty();
        return (E) array.remove(0);
    }
}