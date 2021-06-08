import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work. " +"\r" );
		System.out.println("Step 1 reboot your computer");
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Are you able to connect with the internet? Type y/n: ");
		String firststep = obj.nextLine();
		
		if (firststep.equals("y")){
			System.out.println("All Done");
			System.exit(0);
		}
		else if(firststep.equals("n")){
			System.out.println("Second step: reboot your router; ");
			System.out.println("Are you able to connect with the internet? Type y/n");
		}
		else {
			System.exit(0);
		}
		
		
		String secondstep = obj.nextLine();
		if (secondstep.equals("y")) {
			System.out.println("All Done");
			System.exit(0);
		}
		else if (secondstep.equals("n")){
			System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
			System.out.println("Are you able to connect with the internet? Type y/n");
		}
		else {
			System.exit(0);
		}
		
		String thirdstep = obj.nextLine();
		if (thirdstep.equals("y")) {
			System.out.println("All Done");
			System.exit(0);
		}
		else if(thirdstep.equals("n")){
			System.out.println("Fourth step: move your computer closer to your router");
			System.out.println("Are you able to connect with the internet? Type y/n");
			
		}
		else {
			System.exit(0);	
		}
		
		String fourthstep = obj.nextLine();
		if (fourthstep.equals("y")) {
			System.out.println("All Done");
			System.exit(0);
		}
		else if (fourthstep.equals("n")) {
			System.out.println("Fifth step: contact your ISP");
		}
		else {
			System.exit(0);
		}
}
}