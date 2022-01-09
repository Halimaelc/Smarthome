package Commande;

public class offButtonPressed extends Commande {
	private Device device;
	public offButtonPressed(Device device) {
		 super(device);}

	@Override
	public void execute() {
        System.out.print("execute ");
		device.off();
		
	}

	@Override
	public void undo() {
		 System.out.print("undo");
	        device.off();
		
	}

}
