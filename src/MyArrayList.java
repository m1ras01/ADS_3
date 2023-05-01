public class MyArrayList {
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
}
