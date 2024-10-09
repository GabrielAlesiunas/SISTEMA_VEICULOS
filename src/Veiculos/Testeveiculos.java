package Veiculos;

// Criando a classe TesteVeiculos para testar os objetos criados
class TesteVeiculos {
    public static void main(String[] args) {
    	
    	// Inserindo os dados de cada objeto para teste
        Automovel carro = new Automovel("Gol Quadrado", 1992, "Volkswagen", "Prata", 35000, 4, "Hidráulico", true);
        Motocicleta moto = new Motocicleta("XJ6", 2012, "Yamaha", "Branca", 5000, 600, 59.7);
        Caminhao caminhao = new Caminhao("Volvo FH", 2024, "Volvo", "Preto", 0, 3, 10905.0);
        Bicicleta bicicleta = new Bicicleta("Caloi", 2021, "Caloi", "Vermelha", 100, "Caloi", "Alumínio", 22, true);
        Skate skate = new Skate("Skate", 2023, "Skate Brand", "Preto", 0, "Brand", "Policarbonato");
        
        // Aqui está chamando os metodos de insert e está mexibindo no console os inserts
        System.out.println(carro.gerarInsert());
        System.out.println(moto.gerarInsert());
        System.out.println(caminhao.gerarInsert());
        System.out.println(bicicleta.gerarInsert());
        System.out.println(skate.gerarInsert());
    }
}
