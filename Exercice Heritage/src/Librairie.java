
public class Librairie {

	String nom= "Mibrairie l'Heritage";
	String adresse= "28 rue de la page";
	String horaires= "Du Lundi au Vendredi de 9h30 à 17h30";
	
	public static void main(String[] args) {
		
		Livre livre1 = new Livre();
			livre1.setTitre("Fondation");
			livre1.setType("Science-fiction");
			livre1.setAuteur("Isaac Asimov");
			livre1.setEditeur("Folio");
			livre1.setPrix(14.90);
			livre1.setDisponible(true);
			
		
		Livre livre2 = new Livre();
			livre2.setTitre("Le Meurtre de Roger Ackroyd");
			livre2.setType("Policier");
			livre2.setAuteur("Agatha Christie");
			livre2.setEditeur("Collins");
			livre2.setPrix(8.90);
			livre2.setDisponible(false);
		
		Bd bd1 = new Bd();
			bd1.setTitre("L'incal, Integrale");
			bd1.setAuteur("Alexandro Jodorowsky");
			bd1.setDessinateur("Moebius");
			bd1.setEditeur("Les Humanoïdes associés");
			bd1.setPrix(36.81);
			bd1.setDisponible(true);
		
		Bd bd2 = new Bd();
			bd2.setTitre("Machine qui rêve");
			bd2.setAuteur("Tome");
			bd2.setDessinateur("Janry");
			bd2.setEditeur("Dupuis");
			bd2.setPrix(12.90);
			bd2.setDisponible(true);
		
		Client client1 = new Client();
			client1.setNom("Dupont");
			client1.setPrenom("Robert");
		
		Client client2 = new Client();
			client1.setNom("Duval");
			client1.setPrenom("Henri");
	}

}
