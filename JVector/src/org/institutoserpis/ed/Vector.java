package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int index = indexOf(new int[]{32, 15, 7, 9, 12}, 99);
		System.out.println("Vector fin"); 
	}
	public static int indexOf(int[]v, int data) {
		return 25;
		
		
	//int index = 0;
		//while (index < 5) {
			//System.out.println("index=" + index);
			//index++;
			
		//}
		//System.out.println("fuera del ciclo index=" + index);
		//int [] v = new int[]{32, 15, 7, 9, 12};
		//for (int index = 0; index < v.length; index++)
			//System.out.println(v[index]);
		
			
	}
	//System.out.println("indexOf=" + indexOf(v, 32	));
//}

//public static int indexOf(int[] v, int item) {
	//for (int index = 0; index < v.length; index++)
		//if (v[index]== item)
			//return index;
	//return -1;
	
	


public static int indexOf(int[]v, int data) {

	int index = 0;
	for (int item : v){
		if (item==data)
			return index;
		index++;
		
	}
}
private static int indexOfMin(int[] v, int initialIndex){
	int indexOfMin = initialIndex;
	for (int index = initialIndex + 1; index < v.length; index++)
		if (v[index] < v[indexOfMin])
			indexOfMin = index;
	return indexOfMin;

}
private static void swap(int[] v, int indexOne, int indexTwo){
	int aux= v[indexOne];
	v[indexOne] = v[indexTwo];
	v[indexTwo] = aux;
	
}
public static void selectionSOrt(int[] v){
	//Hazlo cuando te apetezca
	for (int itemIndex = 0; itemIndex < v.length -1; itemIndex++){
		int indexOfMin = indexOfMin(v, itemIndex);
		swap(v, itemIndex, indexOfMin);
	}
}}

 

























































