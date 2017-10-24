

public interface MyCollection<E> {
	public boolean add(E item);
	public void add(int index, E item);
	public E get(int index);
	public E remove(int index);
	public boolean remove(Object o);
	public void clear();
	public E set(int index, E item);
	public int size();
	public boolean contains(Object o);
	public boolean isEmpty();
	public int indexOf(Object o);
	
}