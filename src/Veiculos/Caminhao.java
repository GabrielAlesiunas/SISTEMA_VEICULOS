package Veiculos;

// Classe caminhão
public class Caminhao extends Veiculo {
	// Atributos da classe caminhão
    private int quantidadeEixos;
    private double pesoBruto;
    
    // Construtor da classe caminhão
    public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, double quilometragem,
        int quantidadeEixos, double pesoBruto) {
        super(modelo, anoFabricacao, montadora, cor, quilometragem);
        this.quantidadeEixos = quantidadeEixos;
        this.pesoBruto = pesoBruto;
    }
    
    //Criando o insert SQL dos dados do objeto caminhão na tabela correspondente
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Caminhao (modelo, ano_fabricacao, montadora, cor, quilometragem, " +
                             "quantidade_eixos, peso_bruto) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             quantidadeEixos, pesoBruto);
    }
}
