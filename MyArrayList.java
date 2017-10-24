


public class MyArrayList<E> implements MyCollection<E> {

	private E[] list;
	private int size;
	private int capacity;

	
	public MyArrayList(int capacity) {
		list = (E[]) new Object[capacity]; 
		this.capacity = capacity; 
	}

	
	public MyArrayList() {
		this(10); 
	}

	private void ensureCapacity(int minCapacity) {
		if (capacity < minCapacity) {
			capacity = minCapacity; 
			E[] temp = (E[]) new Object[capacity]; 
			System.arraycopy(list, 0, temp, 0, size);
			list = temp;
		}
	}

	
	public boolean add(E item) { // done
		if (size == capacity) {
			ensureCapacity(size * 2);
		}
		list[size] = item;
		size++;
		return true;
	}

	
	public void add(int index, E item) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if (size == capacity) {
			ensureCapacity(size * 2); // doubles the array
		}
		System.arraycopy(list, index, list, index + 1, size  - index);
		list[index] = item;
		size++;

	}

	
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}

		return list[index];
	}

	
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		E tmp = list[index];
		System.arraycopy(list, index+1, list, index, size - index - 1);
		size--;
		return tmp;
	}

	
	public boolean remove(Object o) {
		int index = 0;
		boolean flag = false;
		while (index < size && !flag) {
			if (list[index].equals(o)) {
				System.arraycopy(list, index+1, list, index, size - index - 1);
				flag = true;
				size--;
			}
			index++;
		}
		return flag;
	}

	
	public void clear() {
		for (int i = 0; i < size; i++) {
			list[i] = null;
		}
		size = 0;
	}

	
	public E set(int index, E item) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		E tmp = list[index];
		list[index] = item;
		return tmp;
	}

	public int size() {
		return size;
	}

	public boolean contains(Object o) {
		int i = 0;
		boolean flag = false;
		while (i < size && !flag) {
			flag = list[i++].equals(o);
		}
		return flag;
	}

	
	public boolean isEmpty() {
		return size == 0;
	}

	
	public int indexOf(Object o) {
		int index = 0;
		boolean flag = false;
		while (index < size && !flag) {
			if (list[index].equals(o)) {
				flag = true;
			}
			else {
			  index++;
			}
		}
		if (!flag) {
			index = -1;
		}
		return index;
	}
}

