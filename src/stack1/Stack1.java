package stack1;


/**
 * Ein einfacher Stack (Stapel - wie ein Stapel Holz) von Objekten. 
 * Ein Stapel funktioniert nach der 
 * LIFO-Methode - last in first out.
 * @author Weiser
 * @version 2014-03-13
 */
public class Stack1 {
	
	/** Der Stapel der Objekte. */
	private Object[] os;
	/** Der Zeiger auf den n�chsten freien Platz. */
	private int tos;
	
	/**
	 * Ein neuer Stack wird erzeugt.
	 * @param size Die Gr��e des Stack (die maximale Anzahl der 
	 * Elemente.
	 */
	public Stack1(int size) {
		os = new Object[size];
		tos = 0;
	}
	
	/**
	 * Ein Objekt wird auf den Stapel gelegt.
	 * @param o Das Objekt.
	 */
	public void push(Object o) {
			os[tos++] = o;
	}
	
	/**
	 * Ein Objekt wir dvom Stapel heurnter geholt.
	 * @return das Objekt vom Stapel.
	 */
	public Object pop() {
		return os[--tos];
	}
	
	/**
	 * Pr�ft, ob der Stack leer ist.
	 * @return True wenn leer, sonst false.
	 */
	public boolean isEmpty() {
		return tos==0;
	}
	
	/**
	 * Pr�ft, ob der Stapel voll ist. 
	 * @return True wenn voll, sonst false.
	 * �nderung
	 */
	public boolean isFull() {
		return tos >= os.length;
	}

}
