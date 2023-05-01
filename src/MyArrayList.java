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
}
