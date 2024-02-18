import java.util.Scanner;
public class OrdineStringhe
{
	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    boolean isCrescente=true;
	    String[] parole=new String[10];
	    System.out.println("inserisci 10 stringhe");
	    
	    for (int i=0;i<10;i++){
	        parole[i]=in.nextLine();
	    }
	    
	    for (int i=0;i<9;i++){
	        if (parole[i].charAt(0) > parole[i+1].charAt(0)) 
                isCrescente = false;
	    }
	    
	    if(isCrescente)
	        System.out.println("le stringhe sono in ordine");
        else
            System.out.println("le stringhe non sono in ordine");
	}
}
