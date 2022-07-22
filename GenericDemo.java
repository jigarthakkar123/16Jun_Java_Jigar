public class GenericDemo {

	public static <E> void printArray(E[] inputArray)
	{
		for(E e:inputArray)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer intarray[]={1,2,3,4,5};
		Double doublearray[]= {1.1,2.2,3.3,4.4,5.5};
		Character chararray[]= {'T','O','P','S'};
		String strarray[]= {"Java","Python","PHP","Android"};
		
		
		printArray(intarray);
		printArray(doublearray);
		printArray(chararray);
		printArray(strarray);
	}
}
