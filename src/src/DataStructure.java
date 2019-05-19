package src;

public class DataStructure {

	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];
	
	public DataStructure() {
		
		for(int i=0; i < SIZE; i ++){
			
			arrayOfInts[i] = i;		}
	}
	
	public void PrintEven() {
		DataStructureIterator iterator = this.new EvenIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "  ");
			
		}
		System.out.println();
	}
	
	interface DataStructureIterator extends java.util.Iterator<Integer> { } 
	
	public class EvenIterator implements  DataStructureIterator{
		private int nextIndex = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (nextIndex <= SIZE - 1);
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
			
			nextIndex += 2;
			return retValue;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStructure ds = new DataStructure();
		ds.PrintEven();
	}

}
