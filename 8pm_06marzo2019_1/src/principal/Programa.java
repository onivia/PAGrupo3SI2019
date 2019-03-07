package principal;
public class Programa {
	public static void main(String[] args) {
		//presedencia de operadores
		//1. () 2. ++,-- 3. */% 4. +-
		int r = 100 + 50 / 2 * 3;
		//100 + 25 * 3
		//100 + 75
		//175
		//CASO MAL:
		//150 / 2 * 3
		//75 * 3
		//225
		System.out.println(r);		
	}
}
