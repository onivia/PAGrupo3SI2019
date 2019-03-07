package principal;
public class Programa {	
	public static void main(String[] args) {
		//presedencia de operadores
		//1. () 2. ++,-- 3. */% 4. +-
		int i = 100;
		int j = 200;
		int r = 100 + 500 / (i++) * 2 + (j++) + (++i);
		//100 + 500 / 100 * 2 + 200 + 102  =>i=102, j=201
		//100 + 5 * 2 + 200 + 102
		//100 + 10 + 200 + 102
		//412
		System.out.println(r);
		System.out.println(i);
		System.out.println(j);
	}
}
