public class Sorter {
	// fields
	private Soda[] sodas;

	// constructor
	public Sorter(Soda[] s) {
		sodas = s;
	}

	// am
	// Methods
	public void sortSodas(){
		quickSort(sodas, 0, sodas.length-1);
	}
	public static void quickSort(Soda[] array, int left, int right) {
		int index = partition(array, left, right);
		if (left < index - 1) {
			quickSort(array, left, index - 1);
		}
		if (right > index) {
			quickSort(array, index, right);
		}
	}

	private static int partition(Soda[] array, int left, int right) {
		int i = left;
		int j = right;
		int pivot = array[(left + right) / 2].getName();
		while (i <= j) {
			while (array[i].getName() < pivot) {
				i++;
			}
			while (array[j].getName() > pivot) {
				j--;
			}
			if (i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}
		}
		return i;
	}

	private static void swap(Soda[] array, int ind1, int ind2) {
		if (ind1 >= array.length || ind2 >= array.length) {
			return;
		}
		Soda temp = array[ind1];
		array[ind1] = array[ind2];
		array[ind2] = temp;
	}
	// toString()
	@Override
	public String toString(){
		String res = "";
		for(Soda s: sodas){
			res+=s + "\n";
		}
		return res;
	}
}
