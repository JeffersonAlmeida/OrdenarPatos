package ordenaPatos;

import java.util.Arrays;

public class TestDuckSort {

	
	public static void main(String[] args) {
		
		Duck duck0 = new Duck("Jefferson",10);
		Duck duck1 = new Duck("azeitona",5);
		Duck duck2 = new Duck("Rodolfo",9);
		Duck duck3 = new Duck("Allan",7);
		Duck duck4 = new Duck("Dao",18);
		Duck duck5 = new Duck("Kennedy",0);
		Duck duck6 = new Duck("Tito",3);
		
		Duck[] ducks = {duck0, duck1, duck2,duck3,duck4,duck5,duck6};
		
		System.out.println("Before Sorting");		
		TestDuckSort.display(ducks);
		System.out.println("\n*****************************\n");
		
		Arrays.sort(ducks);

		//Arrays.sort utiliza o metodo compareTo para ordenar
		//sendo assim, fizemo Duck implementar Comparable, e consequentemente
		//implementamos compareTo, dai é bem mais fácil realizar uma ordenação
		
		System.out.println("After Sorting");		
		TestDuckSort.display(ducks);
		
	}
	static void display(Duck[] ducks){
		for(Duck duck: ducks){
			System.out.println(duck);
		}
	}

}
