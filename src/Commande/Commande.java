package Commande;


public abstract  class  Commande {
	 protected Device device;

	    public Commande(Device device) {
	        this.device = device;
	    }
	public abstract void execute( );
    public abstract void undo();

}
