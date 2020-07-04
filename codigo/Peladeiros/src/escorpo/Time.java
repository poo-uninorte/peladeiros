package escorpo;

import java.util.ArrayList;

public class Time {

	private String mNomeTime;
	
	private ArrayList<Jogador> mJogadores;
	
	public Time(String nomeTime) {
		this.mNomeTime = nomeTime;
		mJogadores = new ArrayList<Jogador>();
	}
	
	public String getNomeTime() {
		return mNomeTime;
	}
	
	public boolean addJogador(Jogador jogador) {
		boolean adicionou = false;
		
		if (timeCompleto()) {
			adicionou = false;
		}
		
		if (jogador.getNivel() != Nivel.NIVEL03) {
			if (temVaga(jogador.getNivel())) {
				mJogadores.add(jogador);
				adicionou = true;
			}
		} else {
			if (temVagaPraNormal()) {
				mJogadores.add(jogador);
				adicionou = true;
			}
		}
		
		return adicionou;
	}
	
	public boolean timeCompleto() {
		if (mJogadores.size() == 5) {
			return true;
		}
		
		return false;
	}
	
	private boolean temVaga(Nivel nivel) {
		for (Jogador jogador : mJogadores) {
			if (jogador.getNivel() == nivel) {
				return false;
			}
		}
		return true;
	}
	
	private boolean temVagaPraNormal() {
		int numVagas = 2;
		for (Jogador jogador : mJogadores) {
			if (jogador.getNivel() == Nivel.NIVEL03) {
				numVagas--;
			}
		}
		
		if (numVagas > 0) {
			return true;
		}
		return false;
	}
	
	private Jogador getJogadorPorNivel(Nivel nivel) {
		if (nivel == Nivel.NIVEL03) {
			for (Jogador jogador : mJogadores) {
				if (jogador.getNivel() == nivel) {
					return jogador;
				}
			}
		}
		
		for (Jogador jogador : mJogadores) {
			if (jogador.getNivel() == nivel) {
				return jogador;
			}
		}
		
		return new Jogador("", Nivel.NIVEL01);
	}
	
	private Jogador getSegundoNormal() {
		for (int i = mJogadores.size()-1 ; i >= 0; i--) {
			if (mJogadores.get(i).getNivel() == Nivel.NIVEL03) {
				return mJogadores.get(i);
			}
		}
		return new Jogador("", Nivel.NIVEL03);
	}
	
	public String toString() {
		String time = "";
		
		time = ""+ getJogadorPorNivel(Nivel.NIVEL01).getNome() + "\n";
		time += "" + getJogadorPorNivel(Nivel.NIVEL02).getNome() + "\n";
		time += "" + getJogadorPorNivel(Nivel.NIVEL03).getNome() + "\n";
		time += "" + getSegundoNormal().getNome() + "\n";
		time += "" + getJogadorPorNivel(Nivel.NIVEL04).getNome();
		
		return time;
	}
}
