//MO QUANDO usa Final não precisa de criar um SET

public class Musica {
private String  titulo;
private String artista;
private double duracao;

Musica(String titulo, String artista, double duracao){
  this.titulo = titulo;
  this.artista = artista;
  this.duracao = duracao;
}

public String getTitulo(){
  return titulo;
}

public void setTitulo(String titulo){
  this.titulo = titulo;
}

public String getArtista(){
  return artista;
}
public void setArtista(String artista){
  this.artista = artista;
}

public Double getDuracao(){
  return duracao;
}

public void setDuracao(double duracao){
  this.duracao = duracao;
}

    @Override
    public String toString() {
        return  "🎵" + "Título: " + titulo + " Artista: " + artista + " Duração: " + duracao;
    }


}
