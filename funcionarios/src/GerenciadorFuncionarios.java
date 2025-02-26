import java.util.*;

public class GerenciadorFuncionarios {
  Scanner sc = new Scanner(System.in);
  HashMap<Integer, Funcionario> funcionarios = new HashMap<Integer, Funcionario>();

  public void criarFuncionario() {

    System.out.println("ID do funcionário: ");
    int chave = sc.nextInt();
    sc.nextLine();
    System.out.println("Nome do funcionário: ");
    String nome = sc.nextLine();
    System.out.println("Salário do funcionário: ");
    double salario = sc.nextDouble();
    funcionarios.put(chave, new Funcionario(nome, salario));

  }

   public void listarFuncionarios(){
    for (Integer key : funcionarios.keySet()) {
      Funcionario value = funcionarios.get(key);
      System.out.println(key + " = " + value);
  }
   }

  public void removerFuncionario(int chave){
    funcionarios.remove(chave);
  }

  public void Run() {

    try {

     
      while (true) {
        System.out.println("========");
        System.out.println("[1] Adicionar funcionário");
        System.out.println("[2] Exibir todos os funcionários ");
        System.out.println("[3] Excluir funcionário");
        System.out.println("[4] Parar execução");
        System.out.println("======== ");
        System.out.println(" ");
  
        int escolha = sc.nextInt();
        sc.nextLine();
  
        switch (escolha) {
          case 1 -> {criarFuncionario();
            System.out.println(" ");
            break;
          
          }


          case 2 -> {
            System.out.println(" ");
            listarFuncionarios();
            System.out.println(" ");
            break;
               }
          case 3 -> {
            System.out.println("Escolha um para remover: ");
            listarFuncionarios();
            int chave = sc.nextInt();
            removerFuncionario(chave);
            System.out.println("---------");
            System.out.println("Atualização: ");
            listarFuncionarios();
            System.out.println("---------");
            break;

          
          }
          case 4 -> {
              System.out.println("Tchau!");
              sc.close();
              return;
              }
          default -> System.out.println("Caiu no default!");
        }
      }

    }

    catch (Exception e) {
      System.err.println("Erro em: " + e.getMessage());
    }

  }
}
