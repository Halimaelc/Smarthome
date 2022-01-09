package Commande;

public class onButtonPressed extends Commande {
	private Device device;
	public onButtonPressed(Device device) {
		 super(device);
	}

	@Override
	public void execute() {
        System.out.print("execute ");
		device.on();
		
		
	}

	@Override
	public void undo() {
		System.out.print("undo");
        device.off();
		
	}

}
