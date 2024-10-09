package Veiculos;

// Criando uma classe veiculo
public abstract class Veiculo {
	
	// Criando os atributos da classe veiculo
    private String 		modelo;
    private int 		anoFabricacao;
    private String 		montadora;
    private String 		cor;
    private double 		quilometragem;
    
    // Criando o construtor da classe veiculo
    public Veiculo(String modelo, int anoFabricacao, String montadora, String cor, double quilometragem) {
    	
    	//Chamando os métodos setter para validar e atribuir os valores
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setMontadora(montadora);
        setCor(cor);
        setQuilometragem(quilometragem);
    }
    
    // Getters e Setters
    public String getModelo() {
        return modelo;
    }
    
    // Função para validar o modelo do veiculo para não deixar vazio
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo é obrigatório.");
        }
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    
    // Função para validar o ano de fabricação do veiculo para nao deixar o ano menor que 1950 ou maior que 2025
    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao <= 1950 || anoFabricacao > 2025) {
            throw new IllegalArgumentException("Ano de fabricação inválido.");
        }
        this.anoFabricacao = anoFabricacao;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    // Método abstrato que as subclasses usa para gerar o comando SQL INSERT
    public abstract String gerarInsert();
}