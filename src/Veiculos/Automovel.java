package Veiculos;

//Classe automovel
public class Automovel extends Veiculo {
	//Atributos da classe automovel
    private int 	quantidadeMaximaPassageiros;
    private String 	tipoFreio;
    private boolean airbag;

    //Construtor da classe automovel
    public Automovel(String modelo, int anoFabricacao, String montadora, String cor, double quilometragem,
    	int quantidadeMaximaPassageiros, String tipoFreio, boolean airbag) {
        super(modelo, anoFabricacao, montadora, cor, quilometragem);
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
        this.tipoFreio = tipoFreio;
        this.airbag = airbag;
    }

    //Criando o insert SQL dos dados do objeto automovel na tabela correspondente
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Automovel (modelo, ano_fabricacao, montadora, cor, quilometragem, " +
                             "quantidade_maxima_passageiros, tipo_freio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
                             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             quantidadeMaximaPassageiros, tipoFreio, airbag);
    }
}
