import java.util.ArrayList;
import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

     // Métodos da interface ReprodutorMusical sobreEscrito
     @Override
     public void tocar() {
          System.out.println("Tocando música");
     }

     @Override
     public void pausar() {
          System.out.println("Música pausada");
     }

     @Override
     public void selecionarMusica(String musica) {
          System.out.println("Selecionando a música: " + musica);
     }

     // Métodos da interface AparelhoTelefonico sobreEscrito
     @Override
     public void ligar(String numero) {
          System.out.println("Ligando para " + numero);
     }

     @Override
     public void atender() {
          System.out.println("Atendendo chamada");
     }

     @Override
     public void iniciarCorreioVoz() {
          System.out.println("Iniciando correio de voz");
     }

     // Métodos da interface NavegadorInternet sobreEscrito
     @Override
     public void exibirPagina(String url) {
          System.out.println("Exibindo página: " + url);
     }

     @Override
     public void adicionarNovaAba() {
          System.out.println("Adicionando nova aba");
     }

     @Override
     public void atualizarPagina() {
          System.out.println("Atualizando página");
     }

     // Métodos adicionais da classe iphone
     public void ligarDispositivo() {
          System.out.println("iPhone ligado");
     }

     public void desligarDispositivo() {
          System.out.println("iPhone desligado");
     }
}
