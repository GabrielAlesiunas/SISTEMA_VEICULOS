package Veiculos; 

//Classe bicicleta
class Bicicleta extends Veiculo {
	//Atributos da clase bicicleta
    private String marca;
    private String material;
    private int quantidadeMarchas;
    private boolean amortecedor;
    
    //Construtor da classe bicicleta
    public Bicicleta(String modelo, int anoFabricacao, String montadora, String cor, double quilometragem,
        String marca, String material, int quantidadeMarchas, boolean amortecedor) {
        super(modelo, anoFabricacao, montadora, cor, quilometragem);
        this.marca = marca;
        this.material = material;
        this.quantidadeMarchas = quantidadeMarchas;
        this.amortecedor = amortecedor;
    }
 
    //Criando o insert SQL dos dados do objeto motocicleta na tabela correspondente
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Bicicleta (modelo, ano_fabricacao, montadora, cor, quilometragem, " +
                             "marca, material, quantidade_marchas, amortecedor) VALUES ('%s', %d, '%s', '%s', %.2f, '%s', '%s', %d, %b);",
                             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             marca, material, quantidadeMarchas, amortecedor);
    }
}
