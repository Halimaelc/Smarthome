package SmartHome;

import Commande.Adresse;
import Commande.RemoteControl;

public class ConcretSmartHomeBuilder {
	private String name;
	private Integer id;
	private Adresse adresse;
	private RemoteControl remoteControl;
	
	public ConcretSmartHomeBuilder(String name, int id) {
		 this.name=name;
	     this.id=id;
	}
	public ConcretSmartHomeBuilder withAdresse(Adresse adresse) {
		this.adresse=adresse;
		return this;
	}
	public ConcretSmartHomeBuilder withRemoteControl(RemoteControl remoteControl) {
		this.remoteControl=remoteControl;
		return this;
	}
	public SmartHome build() {
		/*
		 * SmartHome smartHome=new SmartHome(String name, int id, Adresse adresse,
		 * RemoteControl remoteControl); smartHome.name=this.name; smartHome.id=this.id;
		 * smartHome.adresse=this.adresse; smartHome.remoteControl=this.remoteControl;
		 * return smartHome;
		 */
		 return new SmartHome(name,id,adresse,remoteControl);
		
}}
