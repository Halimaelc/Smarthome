package Commande;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
	Commande slot;
	ArrayList executedCommands=new ArrayList();
	public Commande getSlot() {
		return slot;
	}

	public void setSlot(Commande slot) {
		this.slot = slot;
	}

	int nbrSlot;
	public RemoteControl(int nbrSlot) {
		super();
		this.nbrSlot = nbrSlot;
	}

	public RemoteControl( ) { }
	
	public void setCommand (Commande commande) {
		slot = commande;
	}
	public void buttonWasPressed ( ) {
		slot.execute();
	}

	 List<Device> device=new ArrayList<Device>();

		public List<Device> init(Device tv, Device camera) {
			 tv =new TV();
		     camera = new Camera();
		     device.add(tv);
		     device.add(camera);
		     return device;
		}

	public String getReport() {
		if(slot.device.on()=="On") {
			executedCommands.add(device+" On");
			
			
		}else if (slot.device.on()=="Off") {
			executedCommands.add(device+" Off");
		}
		
		return executedCommands.get(0)+"-"+executedCommands.get(nbrSlot-1);
	}

	

}
