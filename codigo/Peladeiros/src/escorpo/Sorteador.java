package escorpo;

import java.util.ArrayList;
import java.util.Random;


public class Sorteador {

	public static void main(String[] args) {

		
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		
		jogadores.add(new Jogador("Braulio", Nivel.NIVEL01));
		jogadores.add(new Jogador("Bruno", Nivel.NIVEL01));
;

		jogadores.add(new Jogador("Palitot", Nivel.NIVEL02));
		jogadores.add(new Jogador("Netto", Nivel.NIVEL02));


		jogadores.add(new Jogador("Antonio Neto", Nivel.NIVEL03));
                jogadores.add(new Jogador("Fabio", Nivel.NIVEL03));
                jogadores.add(new Jogador("Hermano", Nivel.NIVEL03));


		jogadores.add(new Jogador("Pedro Rafael", Nivel.NIVEL04));
		jogadores.add(new Jogador("Raul", Nivel.NIVEL04));

		
		Time time1 = new Time("Time 1");
		Time time2 = new Time("Time 2");
		Time time3 = new Time("Time 3");
		Time time4 = new Time("Time 4");
		
		for (Jogador jogador : jogadores) {
			int timeSorteado = randInt(1, 4);
			switch (timeSorteado) {
				case 1:
					if (!time1.addJogador(jogador)) {
						timeSorteado = randInt(2, 4);
						if (timeSorteado == 2) {
							if (!time2.addJogador(jogador)) {
								timeSorteado = randInt(3, 4);
								if (timeSorteado == 3) {
									if (!time3.addJogador(jogador)) {
										time4.addJogador(jogador);
									}
								} else if (timeSorteado == 4) {
									if (!time4.addJogador(jogador)) {
										time3.addJogador(jogador);
									}
								}
							}
						} else if (timeSorteado == 3) {
							if (!time3.addJogador(jogador)) {
								timeSorteado = randInt(1, 2);
								if (timeSorteado == 1) {
									if (!time2.addJogador(jogador)) {
										time4.addJogador(jogador);
									}
 								} else if (timeSorteado == 2) {
 									if (!time4.addJogador(jogador)) {
 										time2.addJogador(jogador);
 									}
 								}
							}
						} else if (timeSorteado == 4) {
							if (!time4.addJogador(jogador)) {
								timeSorteado = randInt(2, 3);
								if (timeSorteado == 2) {
									if (!time2.addJogador(jogador)) {
										time3.addJogador(jogador);
									}
 								} else if (timeSorteado == 3) {
 									if (!time3.addJogador(jogador)) {
 										time2.addJogador(jogador);
 									}
 								}
							}
						}
					}
					break;
				case 2:
					if (!time2.addJogador(jogador)) {
						timeSorteado = randInt(2, 4);
						if (timeSorteado == 2) {
							if (!time1.addJogador(jogador)) {
								timeSorteado = randInt(3, 4);
								if (timeSorteado == 3) {
									if (!time3.addJogador(jogador)) {
										time4.addJogador(jogador);
									}
								} else if (timeSorteado == 4) {
									if (!time4.addJogador(jogador)) {
										time3.addJogador(jogador);
									}
								}
							}
						} else if (timeSorteado == 3) {
							if (!time3.addJogador(jogador)) {
								timeSorteado = randInt(1, 2);
								if (timeSorteado == 1) {
									if (!time1.addJogador(jogador)) {
										time4.addJogador(jogador);
									}
 								} else if (timeSorteado == 2) {
 									if (!time4.addJogador(jogador)) {
 										time1.addJogador(jogador);
 									}
 								}
							}
						} else if (timeSorteado == 4) {
							if (!time4.addJogador(jogador)) {
								timeSorteado = randInt(1, 2);
								if (timeSorteado == 1) {
									if (!time1.addJogador(jogador)) {
										time3.addJogador(jogador);
									}
 								} else if (timeSorteado == 2) {
 									if (!time3.addJogador(jogador)) {
 										time1.addJogador(jogador);
 									}
 								}
							}
						}
					}
					break;
				case 3:
					if (!time3.addJogador(jogador)) {
						timeSorteado = randInt(2, 4);
						if (timeSorteado == 2) {
							if (!time1.addJogador(jogador)) {
								timeSorteado = randInt(1, 2);
								if (timeSorteado == 1) {
									if (!time2.addJogador(jogador)) {
										time4.addJogador(jogador);
									}
								} else if (timeSorteado == 2) {
									if (!time4.addJogador(jogador)) {
										time2.addJogador(jogador);
									}
								}
							}
						} else if (timeSorteado == 3) {
							if (!time2.addJogador(jogador)) {
								timeSorteado = randInt(1, 2);
								if (timeSorteado == 1) {
									if (!time1.addJogador(jogador)) {
										time4.addJogador(jogador);
									}
 								} else if (timeSorteado == 2) {
 									if (!time4.addJogador(jogador)) {
 										time1.addJogador(jogador);
 									}
 								}
							}
						} else if (timeSorteado == 4) {
							if (!time4.addJogador(jogador)) {
								timeSorteado = randInt(1, 2);
								if (timeSorteado == 1) {
									if (!time1.addJogador(jogador)) {
										time2.addJogador(jogador);
									}
 								} else if (timeSorteado == 2) {
 									if (!time2.addJogador(jogador)) {
 										time1.addJogador(jogador);
 									}
 								}
							}
						}
					}
					break;
				case 4:
					if (!time4.addJogador(jogador)) {
						timeSorteado = randInt(1, 3);
						if (timeSorteado == 1) {
							if (!time1.addJogador(jogador)) {
								timeSorteado = randInt(2, 3);
								if (timeSorteado == 2) {
									if (!time2.addJogador(jogador)) {
										time3.addJogador(jogador);
									}
								} else if (timeSorteado == 3) {
									if (!time3.addJogador(jogador)) {
										time2.addJogador(jogador);
									}
								}
							}
						} else if (timeSorteado == 2) {
							if (!time2.addJogador(jogador)) {
								timeSorteado = randInt(1, 2);
								if (timeSorteado == 1) {
									if (!time1.addJogador(jogador)) {
										time3.addJogador(jogador);
									}
 								} else if (timeSorteado == 2) {
 									if (!time3.addJogador(jogador)) {
 										time1.addJogador(jogador);
 									}
 								}
							}
						} else if (timeSorteado == 3) {
							if (!time3.addJogador(jogador)) {
								timeSorteado = randInt(1, 2);
								if (timeSorteado == 1) {
									if (!time1.addJogador(jogador)) {
										time2.addJogador(jogador);
									}
 								} else if (timeSorteado == 2) {
 									if (!time2.addJogador(jogador)) {
 										time1.addJogador(jogador);
 									}
 								}
							}
						}
					}
					break;
			}
		}
		
		
		System.out.println(time1.getNomeTime() + "\n" + time1.toString());
		System.out.println("-------------------------------");
		System.out.println(time2.getNomeTime() + "\n" + time2.toString());
		System.out.println("-------------------------------");
		System.out.println(time3.getNomeTime() + "\n" + time3.toString());
		System.out.println("-------------------------------");
		System.out.println(time4.getNomeTime() + "\n" + time4.toString());
		System.out.println("-------------------------------");
	}
	
	/**
	 * Returns a psuedo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 *
	 * @param min Minimim value
	 * @param max Maximim value.  Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public static int randInt(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
}
