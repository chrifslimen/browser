package com.machinepublishers.glass.ui.monocle;

public class browser {
	public String  nom3="Rache7";
	public String  prenom3="wifek";
	public String  nom2="maha ben";
	public String  prenom2="ghzala";
		public String  nom="chrif";
		public String  prenom="slimen";
		public String  version="1.0";
		public String  nomprojet="browser";
		public String getNom() {
			return nom;
		}
		public browser(String nom3, String prenom3, String nom2, String prenom2, String nom, String prenom,
				String version, String nomprojet) {
			super();
			this.nom3 = nom3;
			this.prenom3 = prenom3;
			this.nom2 = nom2;
			this.prenom2 = prenom2;
			this.nom = nom;
			this.prenom = prenom;
			this.version = version;
			this.nomprojet = nomprojet;
		}
		public String getNom3() {
			return nom3;
		}
		public void setNom3(String nom3) {
			this.nom3 = nom3;
		}
		public String getPrenom3() {
			return prenom3;
		}
		public void setPrenom3(String prenom3) {
			this.prenom3 = prenom3;
		}
		public browser(String nom2, String prenom2, String nom, String prenom, String version, String nomprojet) {
			super();
			this.nom2 = nom2;
			this.prenom2 = prenom2;
			this.nom = nom;
			this.prenom = prenom;
			this.version = version;
			this.nomprojet = nomprojet;
		}
		public String getNom2() {
			return nom2;
		}
		public void setNom2(String nom2) {
			this.nom2 = nom2;
		}
		public String getPrenom2() {
			return prenom2;
		}
		public void setPrenom2(String prenom2) {
			this.prenom2 = prenom2;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		public String getNomprojet() {
			return nomprojet;
		}
		public void setNomprojet(String nomprojet) {
			this.nomprojet = nomprojet;
		}
		public browser(String nom, String prenom, String version, String nomprojet) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.version = version;
			this.nomprojet = nomprojet;
		}
		
}
