


public interface Lista<E> {
    
    public int size();
    public boolean add(E e);
    public boolean isEmpty();
    public boolean contains(Object o);
    public int indexOf(Object o);
    public boolean remove(Object o);
    public void clear();
    public E remove(int index);
}
