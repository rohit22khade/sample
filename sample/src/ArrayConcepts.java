

public class ArrayConcepts {

	public ArrayConcepts() {}
	
	
	public static void main(String[] args) {


		int [] arrayNum = fillDataInArray();
		String str = "Yogesh Chame";
		
		
		for (Character ch : str.toCharArray()) {
			System.out.println(ch);
		}
		
		for(int i=0;i<arrayNum.length;i++)
			System.out.println(arrayNum[i]);
		for (int i : arrayNum) {
			System.out.println(i);
		}
	
		
		
	}


	private static int[] fillDataInArray() {
		int num[] = new int[5];
		for(int i=0;i<num.length;i++)
			num[i]=10*i;
		
		return num;
		
	}

}
