package patterns;

public class StarWithLetters {
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int n=4;
		for(i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" "+(char)(65+i));
			}
			System.out.println("");
		}
	}
}
