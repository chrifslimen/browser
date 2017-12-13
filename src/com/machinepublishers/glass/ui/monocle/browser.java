package com.machinepublishers.glass.ui.monocle;

public class browser {
		public String  nom="chrif";
		public String  prenom="slimen";
		public String  version="1.0";
		public String  nomprojet="browser";
		public String getNom() {
			return nom;
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
