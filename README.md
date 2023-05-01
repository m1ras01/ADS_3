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

You can access the element at the front of the queue without removing it using the `peek` method:
```java
String front = queue.peek();  // returns "banana"
```

<br/>

You can check if the queue is empty using the `isEmpty` method:

```java 
boolean empty = queue.isEmpty();  // returns false
```

<br/>

You can get the number of elements in the queue using the `size` method:

<br/>

```java
int count = queue.size();  // returns 2
```
If you attempt to dequeue or peek an element from an empty queue, the methods will throw an EmptyStackException.

## __Implementation Details__
The `MyArrayListQueue` class uses an underlying `MyArrayList` to store the elements in the queue. The `enqueue` method adds an element to the back of the queue by calling the add method on the underlying `MyArrayList`. The `dequeue` method removes and returns the element at the front of the queue by calling the `remove` method on the underlying `MyArrayList` and casting the result to the generic type `E`. The `peek` method returns the element at the front of the queue without removing it by calling the `get` method on the underlying `MyArrayList` and casting the result to the generic type `E`. The `isEmpty` method checks if the underlying `MyArrayList` has any elements, and the size method returns the size of the underlying `MyArrayList`. The `checkEmpty` method is a helper method that is used to ensure that the queue is not empty before attempting to remove or return an element.

![](https://c.tenor.com/5GmWzNk994gAAAAC/thank-you-obama.gif)
