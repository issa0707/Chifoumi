package fr.issa.chifoumi;

import java.util.ArrayList;
import java.util.Scanner;

public class Laucher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String tab[] = {"caillou", "ciseaux", "papier"};
		ArrayList<String> tab = new ArrayList<String>();
		tab.add("caillou");
		tab.add("ciseaux");
		tab.add("papier");
		final int POINTS_MAX = 10;
		int nombreDePointsOrdinateur = 0;
		int nombreDePointsJoueur = 0;
		String motJoueur;
		//String reponse = "oui";

		System.out.println("Bienvenue au jeu de Chifoumi ");
		System.out.println("À chaque victoire, le joueur gagne 2 poins de plus");
		System.out.println("Le premier à avoir 10points remporte la partie");
		System.out.println("Voulez-vous commencer une nouvelle partie ?");
		String reponse = sc.nextLine();
		do {
			do {
				do {
					System.out.println("choisir un mot");
					motJoueur = sc.nextLine();
				} while (!tab.contains(motJoueur));
				System.out.println("Vous avez choisi " + motJoueur);
//		Collections.shuffle(tab);
//		System.out.println(tab);
				int nbrIA = (int) (tab.size() * Math.random());
				String motOrdinateur = " ";
				if (nbrIA == 0) {
					motOrdinateur = "caillou";
					System.out.println("l'ordinateur a choisi 'caillou'");
				} else if (nbrIA == 1) {
					motOrdinateur = "ciseaux";
					System.out.println("l'ordinateur a choisi 'ciseaux'");
				} else {
					motOrdinateur = "papier";
					System.out.println("L'ordinateur a choisi 'papier'");
				}

				if (motJoueur.equals(motOrdinateur)) {
					System.out.println("Pas de gagnant !");
				}

				if (motJoueur.equals("caillou") && motOrdinateur.equals("ciseaux")) {
					System.out.println("Vous avez gagné !");
					nombreDePointsJoueur = nombreDePointsJoueur + 2;
				}

				if (motJoueur.equals("caillou") && motOrdinateur.equals("papier")) {
					System.out.println("L'odrinateur a gagné !");
					nombreDePointsOrdinateur = nombreDePointsOrdinateur + 2;
				}

				if (motJoueur.equals("ciseaux") && motOrdinateur.equals("caillou")) {
					System.out.println("L'odrinateur a gagné !");
					nombreDePointsOrdinateur = nombreDePointsOrdinateur + 2;
				}

				if (motJoueur.equals("ciseaux") && motOrdinateur.equals("papier")) {
					System.out.println("Vous avez gagné !");
					nombreDePointsJoueur = nombreDePointsJoueur + 2;
				}

				if (motJoueur.equals("papier") && motOrdinateur.equals("caillou")) {
					System.out.println("Vous avez gagné !");
					nombreDePointsJoueur = nombreDePointsJoueur + 2;
				}

				if (motJoueur.equals("papier") && motOrdinateur.equals("ciseaux")) {
					System.out.println("L'odrinateur a gagné !");
					nombreDePointsOrdinateur = nombreDePointsOrdinateur + 2;
				}

				if (nombreDePointsOrdinateur == 8) {
					System.out.println("Attention l'ordinateur est sur le point de gagner !");
				}

				if (nombreDePointsOrdinateur == 10) {
					System.out.println("Vous avez perdu, l'ordinateur a gagné !");
				}

				if (nombreDePointsJoueur == 10) {
					System.out.println("BRAVO vous avez gagné !");
				}
				System.out.println("l'ordinateur " + nombreDePointsOrdinateur);
				System.out.println("le joueur " + nombreDePointsJoueur);
				System.out.println("Fin de la partie");

			} while (nombreDePointsOrdinateur < POINTS_MAX && nombreDePointsJoueur < POINTS_MAX);

			System.out.println(
					"le score est : joueur " + nombreDePointsJoueur + "/ordinateur " + nombreDePointsOrdinateur);
		} while (reponse.equals("oui"));

		sc.close();
	}
}
