import algorithms.BST;

/**
 * 
 */

/**
 * @author radoslaw
 *
 */
public class Main {

	/**
	 * metoda testująca bst
	 * @param args
	 */
	public static void main(String[] args) {
		
		//test1
		Integer[] a = {1,5,2,7,4,3,6};
		BST<Integer> bst = new BST<Integer>();
		for(Integer n : a) bst.insert(n);
		
		System.out.println(" Drzewo: " + bst.toString() + " wysokość drzewa: " + bst.height() + " ilość elementów: "+ bst.size());
		System.out.println("\n Drzewo zawiera 2: "+bst.search(2));
		
		//usuwanie elem
		bst.remove(7);
		System.out.println("\n Drzewo po usunięciu 7: " + bst.toString() + " Wysokość drzewa: " + bst.height() + " ilość elementów: "+ bst.size());
		//max min elem
		System.out.println("\n Maksymalny element: "+bst.max() + "\tMinimalny element: "+ bst.min());
		
		//czyszczenie
		bst.clear();
		System.out.println("\n Drzewo po wyczyszczeniu: " + bst.toString() + bst.size());
		for(Integer n : a) System.out.print(bst.search(n) + " ");
		
		
		//dadajmy do pustego drzewa nowe elementy
		Integer[] b = {3,1,3,4,2,1};
		for(Integer n : b) bst.insert(n);
		System.out.println("\n\n Drzewo: " + bst.toString() + " wysokość drzewa: " + bst.height() + " ilość elementów: "+ bst.size());
		System.out.println("\n Maksymalny element: "+bst.max() + "\tMinimalny element: "+ bst.min());
		
		//test 3 
		Integer[] c = {1, 2 ,0 ,-1 ,1};
		for(Integer n : c) bst.insert(n);
		//bst.insert(null);
		System.out.println("\n\n Drzewo: " + bst.toString() + " wysokość drzewa: " + bst.height() + " ilość elementów: "+ bst.size());
		System.out.println("\n Maksymalny element: "+bst.max() + "\tMinimalny element: "+ bst.min());
		
		//test 4
		BST<String> bsts = new BST<String>();
		String[] s = {"a","b","c ","ala", "ma", "kota"};
		for(String n : s) bsts.insert(n);
		System.out.println("\n\n Drzewo: " + bsts.toString() + " wysokość drzewa: " + bsts.height() + " ilość elementów: "+ bsts.size());
		System.out.println("\n Maksymalny element: "+bsts.max() + "\tMinimalny element: "+ bsts.min());
		
	}

}
