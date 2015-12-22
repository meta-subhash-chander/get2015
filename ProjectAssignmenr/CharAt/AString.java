package CharAt;

public class AString {

	private final char value[];

	public AString() {
		this.value = new char[0];
	}

	public AString(AString original) {
		this.value = original.value;
	}

	public char charAt(int index) {
		if ((index < 0) || (index >= value.length)) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return value[index];
	}

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.charAt(1));
	}

}
