import java.util.Scanner;
class Login{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out. println("Dou you have acount or not if you can do something preas the key ");
        //String ask= sc.nextLine();
        int i,ch;
        
    do {
			System.out.println(
					"----------------------------------------------------------------------------------------------------");
			System.out.println(
					"|                                                                                                   |");
			System.out.println("|\t\t--------------------\t\t\t\t----------------------\t\t    |");
			System.out.println("|\t\t 1. Creat Acount   \t\t\t\t  2. Check Record     \t\t    |");
			System.out.println("|\t\t--------------------\t\t\t\t----------------------\t\t    |");
			System.out.println("|\t\t--------------------\t\t\t\t----------------------\t\t    |");
			System.out.println("|\t\t 3. Update Record   \t\t\t\t  4. Exit    \t\t\t    |");
			System.out.println("|\t\t--------------------\t\t\t\t----------------------\t\t    |");
			System.out.println(
					"|                                                                                                   |");
			System.out.println(
					"----------------------------------------------------------------------------------------------------");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					if (ch==1){
                        
						System.out.println("how any sutudent result");
						//n = sc.nextInt();
						
					}
					break;
				case 2:
					if (ch==2) {
						
					} else {
						System.out.println("\t\t-----------------------------------------------------------");
						System.out.println("\t\t     No Record Found Please First Insert Record \t");
						System.out.println("\t\t-----------------------------------------------------------");
					}
					break;
				case 3:
					if (ch==3) {
						System.out.println("how many update record you want to enter ");
						//m = sc.nextInt();
						
					} else {
						System.out.println("\t\t-----------------------------------------------------------");
						System.out.println("\t\t     No Record Found Please First Insert Record \t");
						System.out.println("\t\t-----------------------------------------------------------");
					}
					break;
			}
		} while (ch != 4);

       
    }
}