package Veiculos;

// Classe motocicleta
class Motocicleta extends Veiculo {
	// Atributos da classe motocicleta
    private int cilindrada;
    private double torque;
    
    // Construtor da classe motocicleta
    public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, double quilometragem,
        int cilindrada, double torque) {
        super(modelo, anoFabricacao, montadora, cor, quilometragem);
        this.cilindrada = cilindrada;
        this.torque = torque;
    }

    
    //Criando o insert SQL dos dados do objeto motocicleta na tabela correspondente
    @Override
    public String gerarInsert() {
        return String.format("INSERT INTO Motocicleta (modelo, ano_fabricacao, montadora, cor, quilometragem, " +
                             "cilindrada, torque) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                             getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             cilindrada, torque);
    }
}
