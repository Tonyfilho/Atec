package aulaLuisOriginal;

/*
Bibliotecas
*/

import java.util.*;
import static java.lang.System.*;

/*
classe Auxiliar
*/

class Produto {
//Atributos
String Nome;
int Quantidade;
float Custo;

//Constructores
public Produto() {}
public Produto(String n, int q, float c){
this.Nome = n;
this.Quantidade = q;
this.Custo = c;
}//end constructor
//Metodos set
public void setNome(String x)     { this.Nome = x;}
public void setQuantidade(int x)  { this.Quantidade = x;}
public void setCusto(float x)     { this.Custo = x;}

//Metodos get
public String getNome()    { return this.Nome;}
public int getQuantidade() { return this.Quantidade;}
public float getCusto()    { return this.Custo;}

}//end da class

/*
Classe Publica
*/

public class Arca {
//Dados Globais
static Object[][] DATA =  {
	{"Leite",10, 0.8f },
	{"Manteiga",1, 1.5f },
	{"Cerveja",6, 0.85f },
};
static Produto [] p = new Produto[100];

//Metodos
//CarregarArca
public static Produto[]  CarregarArca(Object[][] o) {
Produto[] y = new Produto[100];
int ct = 0;
for (Object[]x : o) {
	y[ct] = new Produto((String) x[0],//Nome
	                    (Integer)x[1],//Quantidade,
	                    (Float)x[2]);//Float
	ct++;
}

//Total de produtos carregados
out.printf("\n\tExistencias : %d\n",o.length);
return y;
}//end

public static void ListarProdutos(Produto[] x) {
int ct=0;

//Cabeçalho
out.printf("\n\t%5s %15s %8s %8s","Pos","Nome","Quant","Custo");
//Corpo
for (Produto y : x){

if (y != null)
out.printf("\n\t%5d %15s %8d %8.2f",
ct,
y.getNome(),//Nome do produto
y.getQuantidade(),//Quantidade do produto
y.getCusto());//Custo unitario do produto"
ct++;
}
out.printf("%s","\n\n\n");
}//end

//main
public static void main(String[] args) {
p =   CarregarArca(DATA);
ListarProdutos(p);
	/*
  //reservar em memoria espaço para um produto sem dados
  leite = new Produto();
  //afectar esses dados
  leite.setNome("Leite");
  leite.setQuantidade(10);
  leite.setCusto(0.80f);
  //Devolver os dado do produto leite
  out.printf("\n\tArtigo : %s\n",leite.getNome());
  out.printf("\n\tExistenias : %d\n",leite.getQuantidade());
  out.printf("\n\tCusto unitario :%2.2f\n",leite.getCusto());

  */
}//end main
}//end public class
