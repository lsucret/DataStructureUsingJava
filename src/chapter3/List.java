package chapter3;

public interface List<T> {
    void insert(T data);
    T first();
    T next();
    T remove();
    int size();
    boolean isNext();
    boolean isEmpty();
}
