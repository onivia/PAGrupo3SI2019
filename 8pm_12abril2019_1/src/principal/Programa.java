package principal;

public class Programa {
	public static void main(String[] args) {
		String s1 = "100";
		String s2 = new String("100");
		String s3 = String.valueOf(100);
		String s4 = "100";
		
		if(s4.equals(s2)) {
			System.out.println("son iguales");
		} else {
			System.out.println("NO son iguales");
		}
	}
}
