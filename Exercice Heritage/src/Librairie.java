import java.util.Scanner;

public class Librairie {

	static Scanner scan = new Scanner(System.in);
	static String nom= "Librairie l'Heritage";
	static String adresse= "28 rue de la page";
	static String horaires= "Du Lundi au Vendredi de 9h30 à 17h30";
	static String titre;
	static String auteur;
	static String dessinateur = "---";
	static String type = "---";
	static String editeur;
	static double prix;
	static String disponible;
	static String client;
	static char y = 'o';
	
	public static String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public static String getHoraires() {
		return horaires;
	}

	public void setHoraires(String horaires) {
		this.horaires = horaires;
	}

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
			client2.setNom("Duval");
			client2.setPrenom("Henri");
			
			
		System.out.println("Bienvenue chez la "+Librairie.getNom()+".");
		System.out.println("Adresse: "+Librairie.getAdresse()+".");
		System.out.println("Horaires: "+Librairie.getHoraires()+".");
		
		while(y=='o'){
		System.out.println("\n\n\nChoisissez un produit:");
		System.out.println("Produit 1: "+livre1.getTitre()+".");
		System.out.println("Produit 2: "+livre2.getTitre()+".");
		System.out.println("Produit 3: "+bd1.getTitre()+".");
		System.out.println("Produit 4: "+bd2.getTitre()+".");
		System.out.println("\n\nProduit n°:");
		int x = scan.nextInt();
		
		if(x==1) {
			titre = livre1.getTitre();
			auteur = livre1.getAuteur();
			type = livre1.getType();
			editeur = livre1.getEditeur();
			prix = livre1.getPrix();
			if(livre1.isDisponible()==true) {
				disponible = "Actuellement en stock";
			}
			else {
				disponible = "Pas en stock actuellement";
			}
			client = client1.getPrenom()+" "+client1.getNom();
		}
		else if (x==2) {
			titre = livre2.getTitre();
			auteur = livre2.getAuteur();
			type = livre2.getType();
			editeur = livre2.getEditeur();
			prix = livre2.getPrix();
			if(livre2.isDisponible()==true) {
				disponible = "Actuellement en stock";
			}
			else {
				disponible = "Pas en stock actuellement";
			}
			client = client1.getPrenom()+" "+client1.getNom()+", "+client2.getPrenom()+" "+client2.getNom();
		}
		else if (x==3) {
			titre = bd1.getTitre();
			auteur = bd1.getAuteur();
			dessinateur = bd1.getDessinateur();
			editeur = bd1.getEditeur();
			prix = bd1.getPrix();
			if(bd1.isDisponible()==true) {
				disponible = "Actuellement en stock";
			}
			else {
				disponible = "Pas en stock actuellement";
			}
			client = client2.getPrenom()+" "+client2.getNom()+", "+client1.getPrenom()+" "+client1.getNom();
		}
		else if (x==4) {
			titre = bd2.getTitre();
			auteur = bd2.getAuteur();
			dessinateur = bd2.getDessinateur();
			editeur = bd2.getEditeur();
			prix = bd2.getPrix();
			if(bd2.isDisponible()==true) {
			disponible = "Actuellement en stock";
			}
			else {
				disponible = "Pas en stock actuellement";
			}
			client = client2.getPrenom()+" "+client2.getNom();
		}
		else {
			System.out.println("Produit inexistant.");
		}
		
		System.out.println("\nTitre: "+titre+"\nAuteur: "+auteur+"\nDessinateur: "+dessinateur+"\nStyle: "+type+"\nEditions: "+editeur+"\nPrix: "+prix+"€\nDisponibilit: "+disponible);
		System.out.println("\nRécemment acheté par: "+client);
		System.out.println("\nTapez 'o' pour voir un autre produit, 'n' pour arrêter:");
		y = scan.next().charAt(0);
		}
		
		System.out.println("\nMerci de votre visite, à bientôt!");
		
	}
	
	

}
