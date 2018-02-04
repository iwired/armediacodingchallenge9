package armedia;

public class myClass1 {

	public myClass1() {
		

	}

	public void aryPrint() {
		char[][] pic = new char[6][6];
        for (int i = 0; i < 6; i++)
           for (int j = 0; j < 6; j++) {
              if ( i == j  ||  i == 0  ||  i == 5 )
                 pic[i][j] = '*';
              else
                 pic[i][j] = '.';
           }
        for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 6; j++)
              System.out.print(pic[i][j]);
           System.out.println();
        }
		
		
	}
	public static void main(String [] args) {
		myClass1 myclass1 = new myClass1();
		myclass1.aryPrint();
		
	}
}
