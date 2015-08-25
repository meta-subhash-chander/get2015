
public class MainClassOfArrayList {
	public static void main(String a[]) {
		ArrayList mal = new ArrayList();
		 
		mal.addElement(new Integer(1));
		mal.addElement(new Integer(3));
		mal.addElement(new Integer(1));
		mal.addElement(new Integer(14));
		mal.addElement(new Integer(23));
		mal.addElement(new Integer(14));
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.getElement(i) + " ");
		}
		System.out.println();
		mal.addElementOnIndex(4,30);
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.getElement(i) + " ");
		}
		mal.addElement(new Integer(29));
		System.out.println("\nElement at Index 5:" + mal.getElement(5));
		System.out.println("\nList size: " + mal.size());
		System.out.println("\nRemoving element at index 2: " + mal.removeElementByIndex(2));
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.getElement(i) + " ");
		}
		System.out.println("\nRemoving element BY VALUE : " ); mal.removeElementByValue(30);
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.getElement(i) + " ");
		}
		System.out.println("first Occuerence of 14"+ mal.firstOccuerence(1, (Object)14));
		 
		System.out.println("\nreverse list");
		mal.reverseOfArrayList();
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.getElement(i) + " ");
			}
	
		mal.removeAll();
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.getElement(i) + " ");
			}
	}

}
