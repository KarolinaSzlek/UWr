/**
 * 
 */
package algorithms;

import java.util.Comparator;

/**
 * @author radoslaw
 *
 */
public class BST<T extends Comparable<T>> implements Dict<T> {
	/**
	 * @author radoslaw
	 * Definition of a Node in BST
	 * @param <T>
	 */
	private class Node <T extends Comparable<T>> {
		
		private Node<T> left,right;
		private T data;
		/*
		public Node(T data, Node<T> l, Node<T> r ) {
			this.left = l;
			this.right = r;
			this.data = data;
		}*/
		public Node(T data){
			this.data = data;
		}
		public String toString() {
			return data.toString();
		}
	}
	private Node<T> root;
	
	private Comparator<T> comparator;
	
	public BST() {
		this.root = null;
		this.comparator = null;
	}
	public BST(Node<T> root) {
		this.root = root;
		this.comparator = null;
	}
	
	public BST(Comparator <T> comp) {
		this.root = null;
		this.comparator = comp;
	}
	
	private int compareTo(T x, T y) {
		if(comparator == null) return x.compareTo(y);
		else
			return comparator.compare(x, y);
	}
	
	/**
	 * metda do czyszczenia całego drzewa
	 */
	public void clear() {
		this.comparator = null;
		this.root = null;		
		//sb.setLength(0);
	}
	/**
	 * metoda insercji danych do BST
	 */
	public void insert(T data) {
		root = insert(root, data);
	}
	private BST<T>.Node<T> insert(BST<T>.Node<T> root, T dataToIns) throws NullPointerException {
		
		if(dataToIns == null) throw new NullPointerException("Inserted object can not be null");
		if(root == null) return new Node<T>(dataToIns);
		if(compareTo(dataToIns, root.data)== 0) return root;
		if(compareTo(dataToIns,root.data) < 0) root.left = insert(root.left, dataToIns);
		else root.right = insert(root.right,dataToIns);
		return root;
		
		/* try {
			if(root == null) return new Node<T>(dataToIns);
			if(compareTo(dataToIns, root.data)== 0) return root;
			if(compareTo(dataToIns,root.data) < 0) root.left = insert(root.left, dataToIns);
			else root.right = insert(root.right,dataToIns);
			return root;
		}
		catch(NullPointerException e) {
			System.out.print("Inserted object cant by null");
			return root;
			}
		 */
	}
	

	/**
	 * matoda szukania danej
	 */
	
	@Override
	public boolean search(T elemToSearch) {
		return search(root, elemToSearch);
	}
	private boolean search(BST<T>.Node<T> root, T elem) {
		if(root == null) return false;
		else
			if(compareTo(elem, root.data) == 0) return true;
			else 
				if(compareTo(elem, root.data) < 0) return search(root.left, elem);
				else return search(root.right, elem);
	}
	
	/**
	 * metoda do usuwania elementów
	 */
	@Override
	public void remove(T toDel) {
		root = remove(root, toDel);	
	
	}
	private BST<T>.Node<T> remove(BST<T>.Node<T> root, T toDel) {
		if(root == null) throw new RuntimeException("There's no elem to remove");
		
		if(compareTo(toDel, root.data) < 0) root.left = remove(root.left, toDel);
		if(compareTo(toDel, root.data) > 0) root.right = remove(root.right, toDel);
		else{
			if(root.left == null) return root.right;
			if(root.right == null) return root.left;
			else {
				root.data = retrieveData(root.left);
				root.left = remove(root.left, root.data);
			}
		}
		return root;
	}
	/**
	 * metoda pomocnicza do usuwania zwraca najbarziej prawy wierzchołek z lewego poddrzewa
	 * @param root
	 * @return root.data 
	 */
	private T retrieveData(BST<T>.Node<T> root) {
		while(root.right != null) root = root.right;
		return root.data;
	}
	
	
	/**
	 * moetoda zwracająca liczbę liści w drzewie
	 * @return int LiczbaLiści
	 */
	
	public int size() {
		return size(root);
	}
	private int size(BST<T>.Node<T> root) {
		if(root == null ) return 0;
		if(root.left == null && root.right == null) return 1;
		else return  1 + size(root.left) + size(root.right);
	}
	
	/**
	 * metoda do przedstawienia drzewa jako string
	 */
	public String toString() {
		return toString(root).toString();
	}
	
	private StringBuffer toString(BST<T>.Node<T> root) {
		StringBuffer sb = new StringBuffer();
		if(root != null) {
			sb.append(toString(root.left));
			sb.append(root.data);
			sb.append(" ");
			sb.append(toString(root.right));
		}
		return sb;
	}
	
	/**
	 * metoda zwraca wysokość drzewa
	 * @return int height
	 */
	public int height() {
		return height(root);
	}
	private int height(BST<T>.Node<T> root) {
		if(root == null) return -1;
		else return 1 + Math.max(height(root.left), height(root.right));
	}
	
	
	/**
	 * metoda zwracająca njamniejszy element w bst
	 * @return T maxElem
	 */
	@Override
	public T max() {
		return max(root); 
		
	}
	private T max(BST<T>.Node<T> root) {
		while(root.right != null) root = root.right; 
		return root.data;
	}
	
	/**
	 * metoda zwracająca njamniejszy element w bst
	 * @return T minElem
	 */
	@Override
	public T min() {
		return min(root); 
		
	}
	private T min(BST<T>.Node<T> root) {
		while(root.left != null) root = root.left; 
		return root.data;
	}
	
	
	
	
	
	
	
}
