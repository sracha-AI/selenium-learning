package santosh_New;

public class Ford_Figo extends Test_Car{

	private void audiosystems() {
		
		System.out.println("This is audio system");
	}
	
	private void foglamps() {
		
		System.out.println("This is foglamps");
	}

	public static void main(String[] args) {
		
		Ford_Figo obj1Figo=new Ford_Figo();
		
		obj1Figo.airbag();
		obj1Figo.body();
		obj1Figo.gear();
		obj1Figo.seats();
		obj1Figo.audiosystems();
		obj1Figo.foglamps();
		
		
		
	}
	
	
}

