package Entitites;

public class Grupo {
	private Pessoa[] team;
	
	public Grupo(int n, double[] alt) {
		this.team = new Pessoa[n];
		
		for(int i = 0; i < n; i++) {
			this.team[i] = new Pessoa(alt[i]);
		}
	}
	
	public double[] getAlturas() {
		double [] temp = new double[this.team.length];
		for(int i = 0; i < this.team.length; i++) {
			temp[i] = this.team[i].getAltura();		
		}
		return temp;
	}
		
	public double getMediaAltura() {
		double temp = 0;
		for(Pessoa pessoa : this.team) {
			temp += pessoa.getAltura();
		}
		
		double media = temp/this.team.length;
		
		return media;
	}
}


