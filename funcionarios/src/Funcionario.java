public class Funcionario {
  private String nome;
  private double salario;

Funcionario(String nome, double salario){
  this.nome = nome;
  this.salario = salario;

}

public void setNome(String nome){
  this.nome = nome;

}

public String getNome(String nome){
  return nome;
}


public void setSalario(double salario){
  this.salario = salario;
}

public double getSalario(double salario){
  return salario;
}

@Override
 public String toString(){

  return "Nome: " + this.nome + "--" +  "Salário: R$" + this.salario;
 }

}
