package Prob13.abhay.exception;

public class CarTest {
	public static void stop(String wish) 
	{   
		if(wish.equals("go")) {
			System.out.println("Car not stalled.");
		}
		else if(wish.equals("stop")) {
			try {
			throw new CarStoppedException("Car stopped for some reason.");
			}
			catch(CarStoppedException e) {
				System.out.println(e);
			}
		}
	}
	//===
	public static void puncture(String m) 
	{   
		if(m.equals("move")) {
			System.out.println("Car not punctured.");
		}
		else if(m.equals("puncture")) {
			try {
			throw new CarPunctureException("Car is punctured.");
			}
			catch(CarPunctureException f) {
				System.out.println(f);
			}
		}
	}
public static void carHeat(int x) {
	if(x>50) {
		try {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		}
		catch(CarHeatException g) {
			System.out.println(g);
		}
	}
	else if(x<50) {
		System.out.println("Car temperature normal.");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	

}
