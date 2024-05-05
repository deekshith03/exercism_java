import java.util.*;  
import java.lang.reflect.Array;
class SimpleLinkedList<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();
    SimpleLinkedList() {
    }

    public SimpleLinkedList(T[] values) {
        linkedList.addAll(List.of(values));
    }

    void push(T value) {
        linkedList.offerFirst(value);
    }

    T pop() {
        return linkedList.removeFirst();
    }

    void reverse() {
      Collections.reverse(linkedList);
    }

    T[] asArray(Class<T> clazz) {
        return linkedList.toArray((T[]) Array.newInstance(clazz, 0));
    }

    int size() {
      return linkedList.size();
    }
}
