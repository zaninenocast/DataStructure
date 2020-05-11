
class Array{
	private int[] items;
	private int count;

	public Array(int length) {
		 items = new int[length];
		 
	}
	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
			
		}
	}
		public void insert (int item) {
			if (items.length == count) {
				int[] newItems = new int[count * 2]; 
				for (int i = 0; i < count ; i++) 
					newItems[i] = items[i];
			items = newItems;
				
			}
			items[count] = item;
			count++;
		}
     public void removeAt(int index) {
    	  if (index < 0 || index >=count) {
    		  throw new IllegalArgumentException();
    	  }
    	  for (int i = 0; i < count; i ++) 
    		  items[i] = items [i+1];
    	 count--;
    	  
      }
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array number = new Array(3);
		System.out.println(number);
		number.insert(10);
		number.insert(20);
		number.insert(30);
		number.insert(40);
		number.print();
		System.out.println("***************");
		number.removeAt(1);
		number.print();
		System.out.println("***************");
		number.removeAt(2);
		number.print();

	}

}
