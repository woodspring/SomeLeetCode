package woodspring.someleetcode.service;

import woodspring.someleetcode.Exception.SpringException;

public interface LinkedListService<T> {
	public void add(T node);
	public void addAtHead( T node);
	public void addAtTail( T node);
	public void append(T node);
	public void addAtIndex( int index, T node) throws SpringException;
	
	public T get(int index) throws SpringException;
	public boolean deleteAtIndex(int index) throws SpringException;
	public T replaceAt(int index, T node) throws SpringException;
	public boolean swapNode(int index1, int index2) throws SpringException;

	

}
