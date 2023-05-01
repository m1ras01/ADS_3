import java.util.EmptyStackException;
public class MyArrayListStack<E> {
    private MyArrayList<E> array;

    public MyArrayListStack() {
        array = new MyArrayList<>();
    }
    public void push(E element) {
        array.add(element);
    }
    public E pop() {
        checkEmpty();
        return (E) array.remove(array.size() - 1);
    }
    public void checkEmpty(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
    public E peek() {
        checkEmpty();
        return (E) array.get(array.size() - 1);
    }
    public boolean isEmpty() {
        return array.size() == 0;
    }
    public int size() {
        return array.size();
    }

}