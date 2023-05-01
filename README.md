# __MyArrayListQueue__
 `MyArrayListQueue` is a Java class that provides an implementation of a generic queue using an underlying `MyArrayList`.

<br />

## __How to Use__
To use `MyArrayListQueue`, you need to create an instance of the class and then call its methods to add, remove, or access elements in the queue. Here is an example of how to create a `MyArrayListQueue` object and add elements to it:

```java
MyArrayListQueue<String> queue = new MyArrayListQueue<String>();
queue.enqueue("apple");
queue.enqueue("banana");
queue.enqueue("orange");
```

<br />

You can remove elements from the front of the queue using the `dequeue` method:
```java 
 String first = queue.dequeue(); // returns "apple"
 ```

<br />
