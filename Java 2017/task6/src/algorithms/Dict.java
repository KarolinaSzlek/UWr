/**
 * 
 */
package algorithms;

/**
 * @author radoslaw
 *
 */
public interface Dict <T extends Comparable<T>> {  

	public void insert(T data);
	public boolean search(T elemToSearch);
	public void remove(T toDel);
	public T max();
	public T min();
	
}
