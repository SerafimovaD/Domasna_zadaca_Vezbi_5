import java.util.Scanner;
public class Zadaca {

	public static void main(String[] args) {
	int sumap=0, sumanep=0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Vnesi broevi");
	int size=scanner.nextInt();
	int[]n=new int[size];
	for(int i=0; i<size; i++) {
		n[i]=scanner.nextInt();}
	for(int i=0; i<size; i++) {
		if(n[i]%2==0 ) {
			sumap+=n[i];}else {
				sumanep+=n[i];
		}
	}
	System.out.print("Sumata na parnite broevi e:" + sumap);
	System.out.print("Sumata na neparnite broevi e:" + sumanep);
	}

}
