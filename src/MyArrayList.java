public class MyArrayList<T> implements MyList {
    private Object[] arr;
    private int size = 0;

    MyArrayList(){
        this.arr = new Object[5];
        this.size = 0;
    }
    public void add(Object item) {
        if(size == arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }
    public void increaseBuffer(){
        Object[] newArr = new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
    public int size() {
        return size;
    }
    public boolean contains(Object o) {
        for(Object element : arr){
            if(element != null && element.equals(o)){
                return true;
            }
        }
        return false;
    }
    public void add(Object item, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (size == arr.length) {
            increaseBuffer();
        }
        for(int i=size-1; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = item;
        size++;
    }
    public boolean remove(Object item) {
        for(int i=0; i<size; i++){
            if(arr[i] != null && arr[i].equals(item)){
                remove(i);
                return true;
            }
        }
        return false;
    }
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
    public Object remove(int index) {
        checkIndex(index);
        T removed = (T) arr[index];
        for(int i=index; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        size--;
        return removed;
    }
    public void clear(){
        this.arr = new Object[5];
        this.size = 0;
    }
    public Object get(int index) {
        checkIndex(index);
        return (T) arr[index];
    }
    public int indexOf(Object o) {
        for(int i=0; i<size; i++){
            if(arr[i] != null && arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(Object o) {
        for(int i=size-1; i>=0; i--){
            if(arr[i] != null && arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (((Comparable)arr[i]).compareTo(arr[j]) > 0) {
                    Object temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
