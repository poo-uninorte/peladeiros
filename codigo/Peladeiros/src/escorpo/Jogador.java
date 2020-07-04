package escorpo;


public class Jogador {

	/** Nome do Jogador. */
	private String mNome;
	
	/** Nivel do Jogador. */
	private Nivel mNivel;
	
	public Jogador(String nome, Nivel nivel) {
		mNome = nome;
		mNivel = nivel;
	}

	
	public Nivel getNivel() {
		return mNivel;
	}
	
	public String getNome() {
		return mNome;
	}
}
