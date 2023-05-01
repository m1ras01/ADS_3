public class MyLinkedList<T> implements MyList{
    private class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Object o) {
        Node currentNode = head;
        while (currentNode != null){
            if(currentNode.equals(o)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public void add(Object item) {
        Node newNode = new Node(item, null, tail);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public void add(Object item, int index) {
        checkIndex(index);
        if (index == size) {
            add(item);
        } else {
            Node curNode;
            if (index < size / 2) {
                curNode = head;
                for (int i = 0; i < index; i++) {
                    curNode = curNode.next;
                }
            } else {
                curNode = tail;
                for (int i = size - 1; i > index; i--) {
                    curNode = curNode.prev;
                }
            }
            Node prevNode = curNode.prev;
            Node newNode = new Node(item, curNode, prevNode);
            curNode.prev = newNode;
            if (prevNode != null) {
                prevNode.next = newNode;
            } else {
                head = newNode;
            }
            size++;
        }
    }



    @Override
    public boolean remove(Object item) {
        Node currentNode = head;
        while (currentNode != null && !currentNode.element.equals(item)) {
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            if (currentNode == head) {
                head = currentNode.next;
                if (head != null) {
                    head.prev = null;
                }
            } else if (currentNode == tail) {
                tail = currentNode.prev;
                if (tail != null) {
                    tail.next = null;
                }
            } else {
                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
            }
            size--;
            return true;
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Node curNode;
        if (index < size / 2) {
            curNode = head;
            for (int i = 0; i < index; i++) {
                curNode = curNode.next;
            }
        } else {
            curNode = tail;
            for (int i = size - 1; i > index; i--) {
                curNode = curNode.prev;
            }
        }
        Node prevNode = curNode.prev;
        Node nextNode = curNode.next;
        if (prevNode != null) {
            prevNode.next = nextNode;
        } else {
            head = nextNode;
        }
        if (nextNode != null) {
            nextNode.prev = prevNode;
        } else {
            tail = prevNode;
        }
        size--;
        return curNode.element;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        Node currentNode;
        if (index < size / 2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode.element;
    }

    @Override
    public int indexOf(Object o) {
        Node curNode = head;
        int index = 0;
        while (curNode != null) {
            if (curNode.element.equals(o)) {
                return index;
            }
            curNode = curNode.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node curNode = tail;
        int index = size - 1;
        while (curNode != null) {
            if (curNode.element.equals(o)) {
                return index;
            }
            curNode = curNode.prev;
            index--;
        }
        return -1;
    }

    @Override
    public void sort() {
        if (size < 2) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node min = current;
            Node innerCurrent = current.next;

            while (innerCurrent != null) {
                if (((Comparable) innerCurrent.element).compareTo(min.element) < 0) {
                    min = innerCurrent;
                }

                innerCurrent = innerCurrent.next;
            }

            if (min != current) {
                // Swap the values of the current and minimum nodes
                Object temp = current.element;
                current.element = min.element;
                min.element = temp;
            }

            current = current.next;
        }
    }
    public void checkIndex(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }



}