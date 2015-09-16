
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class GetBooksByAuthorName {
	
	public static void main(String[] args) throws IOException {
		Scanner scan =new Scanner(System.in);
		String authorName;
		System.out.print("\n Enter Author Name : ");
		authorName = scan.next();
		ArrayList<Books> titleList = Books.getBooksByAuthorName(authorName);
		ListIterator<Books> iterator = titleList.listIterator();
		
		if(!iterator.hasNext()){
			System.out.println("No Books found for this author name..");
		}
		else{
			System.out.println("\n Books are as follow: ");
			while(iterator.hasNext()){
				System.out.println(iterator.next().getTitleName()+"\t");
			}

		}
		scan.close();
	}
	
}