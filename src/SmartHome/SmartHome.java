package SmartHome;

import Commande.Adresse;
import Commande.Commande;
import Commande.RemoteControl;

public class SmartHome {
	private String name;
	private Integer id;
	private Adresse adresse;
	private RemoteControl remoteControl;
	private SmartHome() {}
	
	public SmartHome(String name, Integer id, Adresse adresse, RemoteControl remoteControl) {
        this.name = name;
        this.id = id;
        this.adresse = adresse;
        this.remoteControl = remoteControl;
    }
	 public String report() {
		 String expectedReport=remoteControl.getReport();
		 return expectedReport;
	 }
	}
