package principal;
public class Programa {
	public static void main(String[] args) {
		//[2][3][4]  der a izq
		int[][][] n = {
				{
					{10,20,30,40},
					{50,60,70,80},
					{90,100,110,120}
				},
				{
					{130,140,150,160},
					{170,180,190,200},
					{210,220,230,240}
				}
		};
		for (int[][] dim1_2 : n) {
			for (int[] dim2_3 : dim1_2) {
				for (int dim3_4 : dim2_3) {
					System.out.println(dim3_4);										
				}				
			}			
		}
	}
}
