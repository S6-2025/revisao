import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
  Scanner sc = new Scanner(System.in);

  ArrayList<Musica> musicas = new ArrayList<>();

  public void adicionarMusica() {

    System.out.println("======\n Adicione uma música!");

    System.out.println("Título: ");
    String titulo = sc.nextLine();

    System.out.println("Artista: ");
    String artista = sc.nextLine();
    System.out.println("Duração: ");
    double duracao = sc.nextDouble();
    sc.nextLine();
    Musica musica = new Musica(titulo, artista, duracao);
    musicas.add(musica);

  }

  public void listarMusicas() {
    int i = 0;
    for (Musica songs : musicas) {
      
      System.out.println( i + ". " + songs);
      i+=1;
    }
  }

 public void removerMusica(int ordemMusica ){
  System.out.println("Escolha uma música para remover: ");
  listarMusicas();

  ordemMusica = sc.nextInt(); 

  musicas.remove(ordemMusica);

 }

 public void duracaoTotal(){
  double duracaoTotal = 0;
  for(Musica songs : musicas){
      duracaoTotal+= songs.getDuracao();
     
  }
 }



  public void Run() {

    try {

      while (true) {
        System.out.println(" === Playlist ===");
        System.out.println("[1] Adicionar Música");
        System.out.println("[2] Listar Músicas");
        System.out.println("[3] Deletar Música");
        System.out.println("[4] Duração total da Playlist!");
        System.out.println("[5] Sair! \n");

        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {

          case 1 -> {
            adicionarMusica();
            break;
          }

          case 2 -> {
            listarMusicas();
            break;

          }

          case 3 -> {
            removerMusica(escolha);
            System.out.println("\n Lista atualizada: ");
            listarMusicas();
            System.out.println(" ====");
            break;
          }
          case 4 -> {
            System.out.println("Working on it");
          }

          case 5 -> {
            System.out.println("byeee!1");
            sc.close();
            
            return;

          }
          default -> {
            System.out.println("Escolha uma oção válida!");
            break;
          }
        }

      }

    } catch (Error e) {
      System.err.println("Erro em: " + e.getMessage());
    }
  }

}
