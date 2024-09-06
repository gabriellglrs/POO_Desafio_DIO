public class Main {
     public static void main(String[] args) {
          Iphone myIPhone = new Iphone();

          System.out.println("Demonstração do iPhone:");

          // Demonstração do Reprodutor Musical
          System.out.println("\nReprodutorMusicial:");
          myIPhone.selecionarMusica("Música 1");
          myIPhone.tocar();
          myIPhone.pausar();

          // Demonstração do Aparelho Telefônico
          System.out.println("\nAparelhoTelefonico:");
          myIPhone.ligar("123-456-789");
          myIPhone.atender();
          myIPhone.iniciarCorreioVoz();

          // Demonstração do Navegador na Internet
          System.out.println("\nNavegadorInternet:");
          myIPhone.exibirPagina("www.exemplo.com");
          myIPhone.adicionarNovaAba();
          myIPhone.atualizarPagina();

          // Demonstração de métodos adicionais
          System.out.println("\nMétodos adicionais:");
          myIPhone.ligarDispositivo();
          myIPhone.desligarDispositivo();
     }
}
