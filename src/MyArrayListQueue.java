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
    public E peek() {
        checkEmpty();
        return (E) array.get(0);
    }

    public boolean isEmpty() {
        return array.size() == 0;
    }
    public int size() {
        return array.size();
    }
    public void checkEmpty(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
}