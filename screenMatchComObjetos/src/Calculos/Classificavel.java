package Calculos;

/*
Aqui é uma interface. É algo que é comum para várias classes.
No caso, nossa classe FILME já extende da classe TÍTULO, não podendo
ser uma subclasse de mais uma superclasse, então criamos a interface.
 */

public interface Classificavel {
    //Repare que não tem chaves aqui. Quem for utilizar essa interface precisa ter um método de getClassificacao.
    // Diferente de uma superclasse, quando vamos utilizá-la em alguma classe, não vamos usar o "extends", usaremos o "implements"
    // Funciona como um contrato, se essa interface for implementada em alguma classe, ela vai estar garantindo que aquela classe implemente os métodos apresentados na interface.
    int getClassificacao();


}
