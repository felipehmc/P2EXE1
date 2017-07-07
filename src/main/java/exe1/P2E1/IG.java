package exe1.P2E1;

import java.util.Scanner;

public class IG {
	
	User user;
	Scanner console = new Scanner(System.in);

	IG(User u){
		user = u;
	}
	
	private void checkOrderStatus(Order order){
		user.checkOrderStatus(order);
	}
	
	private void buyAProduct(Product p) {
		user.buyAProduct(p);
	}
	
	private void rateAProduct(String produto, double nota) {
		user.rateAProduct(produto, nota);
	}
	
	private void searchForAProduct(String nome) {
		user.searchAProduct(nome);
	}
	
	public void executeInterface() {
		System.out.println("O usuario deseja pesquisar por algum produto?{S/N}");
		String resp = console.nextLine();
		if(resp.equals("S")) {
			System.out.println("Qual produto voce deseja procurar?");
			resp = console.nextLine();
			searchForAProduct(resp);
		}
		
		System.out.println("O usuario deseja avaliar algum produto? {S/N}");
		resp = console.nextLine();
		if(resp.equals("S")) {
			System.out.println("Digite o nome do produto o qual voce quer avaliar");
			String resp1 = console.nextLine();
			System.out.println("Qual a nota deseja dar para o produto? (0-10)");
			String resp2 = console.nextLine();
			double nota = Double.parseDouble(resp2);
			rateAProduct(resp1, nota);
		}
		
		System.out.println("Deseja comprar algum produto? {S/N}");
		resp = console.nextLine();
		if(resp.equals("S")) {
			System.out.println("Digite o nome do produto o qual voce quer comprar");
			String resp1 = console.nextLine();
		}
		
	}
	
	public static void main(String[] args) {
		
		BancoDeDadosProdutos BD = BancoDeDadosProdutos.getInstance();
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
		String aliceDescription = "Quando decidiu seguir um coelho que estava muito atrasado, Alice caiu em um enorme buraco. Só mais tarde descobriu que aquele "
				+ "\nera o caminho para o País das Maravilhas, um lugar povoado por criaturas que misturam características humanas e fantásticas, como o Gato, "
				+ "\no Chapeleiro e a Rainha de Copas - e lhe apresentam enigmas.";
		String jogosVorazesDescription = "Este livro é o primeiro de uma bem-sucedida trilogia, comercializada para mais de 20 países, A história se passa em uma "
				+ "\nnação chamada Panem, fundada após o fim da América do Norte. Formada por 12 distritos, é comandada com mão de ferro pela Capital, sede do governo. "
				+ "\nUma das formas com que demonstra seu poder sobre o resto do carente país é com os 'Jogos Vorazes', uma competição anual transmitida ao vivo pela televisão, "
				+ "\nem que um garoto e uma garota de 12 a 18 anos de cada distrito são selecionados e obrigados a lutar até a morte.\r\n" + 
				"\r\n" + 
				"Para evitar que sua irmã seja a mais nova vítima do programa, Katniss se oferece para participar em seu lugar. Vinda do empobrecido Distrito 12, ela sabe como "
				+ "\nsobreviver em um ambiente hostil. Caso vença, terá fama e fortuna. Se perder, morre. Mas para ganhar a competição, será preciso muito mais do que habilidade. "
				+ "\nAté onde Katniss estará disposta a ir para ser vitoriosa nos 'Jogos Vorazes'? ";
		String gameOfThronesDescription = "Em A guerra dos tronos, o primeiro livro da aclamada série As crônicas de gelo e fogo, George R. R. Martin - considerado o\r\n" + 
				"Tolkien americano - cria uma verdadeira obra de arte, trazendo o melhor que o gênero pode oferecer. Uma história de lordes e damas, soldados e mercenários, "
				+ "\nassassinos e bastardos, que se juntam em um tempo de presságios malignos. Cada um esforçando-se para ganhar este conflito mortal: a guerra dos tronos. "
				+ "\nMistério, intriga, romance e aventura encherão as páginas deste livro, agora também um blockbuster da HBO! ";
		String VSIDescription = "Cartas mais íntimas que um diário, estranhamente únicas, hilárias e devastadoras - são apenas através delas que Charlie compartilha todo "
				+ "\no seu mundinho com o leitor. Enveredando pelo universo dos primeiros encontros, dramas familiares, novos amigos, sexo, drogas e daquela música perfeita "
				+ "\nque nos faz sentir infinito, o roteirista Stephen Chbosky lança luz sobre o amadurecimento no ambiente da escola, um local por vezes opressor e sinônimo "
				+ "\nde ameaça. Uma leitura que deixa visível os problemas e crises próprios da juventude.";
		String domCasmurroDescription = "Bentinho e Capitu são criados juntos e se apaixonam na adolescência. Mas a mãe dele, por força de uma promessa, decide enviá-lo "
				+ "\nao seminário para que se torne padre. Lá o garoto conhece Escobar, de quem fica amigo íntimo. Algum tempo depois, tanto um como outro deixam a vida "
				+ "\neclesiástica e se casam. Escobar com Sancha, e Bentinho com Capitu. Os dois casais vivem tranquilamente até a morte de Escobar, quando Bentinho começa "
				+ "\na desconfiar da fidelidade de sua esposa e percebe a assombrosa semelhança do filho Ezequiel com o ex-companheiro de seminário.";
		String osMiseraveisDescription = "Esta obra é uma poderosa denúncia a todos os tipos de injustiça humana. Narra a emocionante história de Jean Valjean — o homem "
				+ "\nque, por ter roubado um pão, é condenado a dezenove anos de prisão. Os miseráveis é um livro inquietantemente religioso e político. ";
		String escravaIsauraDescription = "Romance que procura retratar a sociedade brasileira do século XIX tendo como pano de fundo a escravidão. O autor cria um romance "
				+ "\nnacional em que o amor é instrumento de denúncia da hipocrisia de seu tempo. 'A Escrava Isaura' é uma obra que está na mente de praticamente todos os "
				+ "\nbrasileiro: a lendária história de amor entre Isaura, a escrava branca, e Álvaro, a perversidade de Leôncio e as reviravoltas típicas do romantismo "
				+ "\nfizeram da obra um marco na cultura brasileira ";
		BD.adicionaMercadoria("Alice no pais das maravilhas", 23.50, aliceDescription, "book");
		BD.adicionaMercadoria("Harry Potter", 8.90, harryPotterDescription, "book");
		BD.adicionaMercadoria("Jogos Vorazes", 17.40, jogosVorazesDescription, "book");
		BD.adicionaMercadoria("Game Of Thrones", 26.70, gameOfThronesDescription, "book");
		BD.adicionaMercadoria("As Vantagens de Ser Invisivel", 7.60, VSIDescription, "book");
		BD.adicionaMercadoria("Dom Casmurro", 5.10, domCasmurroDescription, "book");
		BD.adicionaMercadoria("Os Miseraveis", 8.32, osMiseraveisDescription, "book");
		BD.adicionaMercadoria("Escrava Isaura", 6.99, escravaIsauraDescription, "book");
		User u = new User();
		System.out.println();
		IG ig = new IG(u);
		ig.executeInterface();
	}

}
