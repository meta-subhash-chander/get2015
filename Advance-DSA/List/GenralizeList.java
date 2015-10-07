/****************************************************************************************
Name            :  generalizedList 
Revision Log    :  2015-10-05: Subhash Chander : created.
                : 
                : 
Use             : This class is used to perform all opertion of GenralizeList
                :
 ****************************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class GenralizeList {
	private Node start;
	private Stack expression;
	private int max = 0;
	private int sum = 0;
	private String outputList = "";
	private boolean b = false;

	/**
	 * getStart method : method to get Start node
	 * */
	public Node getStart() {
		return start;

	}

	/**
	 * GenralizeList method : constructor to set Start node
	 * */
	public GenralizeList() {
		start = null;
	}

	/**
	 * GenralizeList method :Generate the GenralizeList
	 * 
	 * @param : String of input
	 * */
	public GenralizeList(String input) {
		expression = new Stack(input.length());
		int num = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == '(') {
				expression.push("(");

			} else if (input.charAt(i) == ',') {
				if (input.charAt(i - 1) != ')') {

					Node node = new Node(num);
					expression.push(node);
					num = 0;
				}
			} else if (input.charAt(i) == ')') {

				if (input.charAt(i - 1) != ')') {
					Node node = new Node(num);
					expression.push(node);
					num = 0;
				}
				List<Object> innerList = new ArrayList<Object>();
				while (!(expression.peek().toString().equals("("))) {

					innerList.add(expression.pop());

				}
				expression.pop();
				Node node1 = new Node();

				node1.value = (Node) innerList.get(innerList.size() - 1);
				for (int j = innerList.size() - 1; j >= 1; j--) {
					((Node) innerList.get(j)).next = (Node) innerList

					.get(j - 1);

				}
				expression.push(node1);
				start = node1;

			} else {
				num = num * 10 + Integer.parseInt("" + input.charAt(i));
			}
		}
	}

	/**
	 * toString method : method is use to traverse the list
	 * 
	 * @param : start node of GenralizeList
	 * */
	public String toString(Node start) {
		if (start == null) {
			return outputList;
		} else if (start.value instanceof Integer) {
			outputList = outputList + start.value;
			toString(start.next);

		} else {

			toString((Node) start.value);
			toString((Node) start.next);

		}
		return outputList;

	}

	/**
	 * calculateMaximumElement method : find max element into list
	 * 
	 * @param : start node of GenralizeList
	 * @return : maximum element of GenralizeList
	 * */
	public int calculateMaximumElement(Node start) {
		if (start == null) {
			return max;
		} else if (start.value instanceof Integer) {
			if ((Integer) start.value > max) {
				max = (Integer) start.value;

			}
			calculateMaximumElement(start.next);

		} else {

			calculateMaximumElement((Node) start.value);
			calculateMaximumElement((Node) start.next);

		}

		return max;
	}

	/**
	 * calculateSum method : sum of all element into list
	 * 
	 * @param : start node of GenralizeList
	 * @return : elements sum
	 * */
	public int calculateSum(Node start) {
		if (start == null) {
			return sum;
		} else if (start.value instanceof Integer) {
			sum = sum + (Integer) start.value;
			calculateSum(start.next);

		} else {

			calculateSum((Node) start.value);
			calculateSum((Node) start.next);

		}

		return sum;
	}

	/**
	 * search method : method is use find element into list
	 * 
	 * @param : int x:element to search
	 * @param : node start :start node of GenralizeList
	 * @return : boolean result
	 * */
	public boolean search(Node start, int x) {
		if (start == null) {
			return b;
		} else if (start.value instanceof Integer) {
			if ((Integer) start.value == x) {

				b = true;
			}

			search(start.next, x);

		} else {

			search((Node) start.value, x);
			search((Node) start.next, x);

		}

		return b;
	}

}
