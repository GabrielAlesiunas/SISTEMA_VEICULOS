package Veiculos;

// Criando a classe Skate
public class Skate extends Veiculo {
	// Criando os atributos da classe skate
    private String marca;
    private String tipoRodas;
    
    // Construtor da classe skate
    public Skate(String modelo, int anoFabricacao, String montadora, String cor, double quilometragem,
        String marca, String tipoRodas) {
        super(modelo, anoFabricacao, montadora, cor, quilometragem);
        this.marca = marca;
        this.tipoRodas = tipoRodas;
    }

    //Criando o insert SQL dos dados do objeto Skate na tabela correspondente
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Skate (modelo, ano_fabricacao, montadora, cor, quilometragem, " +
                             "marca, tipo_rodas) VALUES ('%s', %d, '%s', '%s', %.2f, '%s', '%s');",
                             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             marca, tipoRodas);
    }
}
