package estados;

public class Estado 
{
	
	enum State{
		CEARA,
		PERNAMBUCO,
		BAHIA,
		PARAIBA
	}
	
	//State est = State.BAHIA;
	
	public static void main(String[] args) { 
		    State est = State.BAHIA; 
		    System.out.println(est); 
		    
		    
		    for(int i = 0; i < 10; i++) {
		    	
		    	System.out.println(i);
		    	
		    }
		    
		    double x = 0;
		    
		    while(x<10) {
		    	System.out.println(x);
		    	x++;

		    	
		    }
		    
		    int idade = 12;
		    
		    if(idade>17) {
		    	System.out.println("é maior de idade");
		    }
		    else {
		    	System.out.println("é menor de idade");
		    }
		  } 
	
	

}


