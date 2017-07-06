package exe1.P2E1;

import org.junit.Before;
import org.junit.Test;

public class VendasTest {
	
	BancoDeDadosProdutos BD;
	
	@Before
	public void setUp() {
		String harryPotterDescription = "Harry Potter é um garoto cujos pais, feiticeiros, foram assassinados por um poderosíssimo bruxo quando ele ainda era um bebê. "
				+ "\nEle foi levado, então, para a casa dos tios que nada tinham a ver com o sobrenatural. Pelo contrário. Até os 10 anos, "
				+ "\nHarry foi uma espécie de gata borralheira: maltratado pelos tios, herdava roupas velhas do primo gorducho, tinha óculos "
				+ "\nremendados e era tratado como um estorvo. No dia de seu aniversário de 11 anos, entretanto, ele parece deslizar por um buraco sem fundo, "
				+ "\ncomo o de Alice no país das maravilhas, que o conduz a um mundo mágico. Descobre sua verdadeira história e seu destino: ser um aprendiz de "
				+ "\nfeiticeiro até o dia em que terá que enfrentar a pior força do mal, o homem que assassinou seus pais. O menino de olhos verde, magricela e desengonçado, "
				+ "\ntão habituado à rejeição, descobre, também, que é um herói no universo dos magos. Potter fica sabendo que é a única pessoa a ter sobrevivido a um ataque "
				+ "\ndo tal bruxo do mal e essa é a causa da marca em forma de raio que ele carrega na testa. Ele não é um garoto qualquer, ele sequer é um feiticeiro qualquer; "
				+ "\nele é Harry Potter, símbolo de poder, resistência e um líder natural entre os sobrenaturais. A fábula, recheada de fantasmas, paredes que falam, caldeirões, "
				+ "\nsapos, unicórnios, dragões e gigantes, não é, entretanto, apenas um passatempo.";
		BD = BancoDeDadosProdutos.getInstance();
		BD.adicionaMercadoria("Alice no pais das maravilhas", 23.50, "Alice eh uma menina que se perde e...", "book");
		BD.adicionaMercadoria("Harry Potter", 8.90, harryPotterDescription, "book");
		BD.adicionaMercadoria("Jogos Vorazes", 17.40, "Katniss eh uma dolescente...", "book");
		BD.adicionaMercadoria("Game Of Thrones", 26.70, "O livro conta a historia de ...", "book");
		BD.adicionaMercadoria("As Vantagens de Ser Invisivel", 7.60, "O livro fala...", "book");
		BD.adicionaMercadoria("Dom Casmurro", 5.10, "O livro fala...", "book");
		BD.adicionaMercadoria("Os Miseraveis", 8.32, "O livro fala...", "book");
		BD.adicionaMercadoria("Escrava Isaura", 6.99, "O livro fala...", "book");
	}
	
	@Test
	public void test() {
		
	}
	
}
