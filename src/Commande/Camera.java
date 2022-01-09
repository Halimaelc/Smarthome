package Commande;

public class Camera implements Device{
	public String deviceName;
	String etat;

	@Override
	public String on() {
		etat="On";
		return etat;
	}

	@Override
	public String off() {
		etat="Off";
		return etat;
	}

}
