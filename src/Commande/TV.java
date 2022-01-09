package Commande;

public class TV implements Device{
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
		// TODO Auto-generated method stub
		return etat;
	}

}
