package Application;

/*
Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as se-
guintes informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada.
*/

public class Program {
    public static void main(String[] args){

        Fatura ft1 = new Fatura(123, "Mouse", 200, 5.50);

        ft1.exibirFatura();
    }
}
