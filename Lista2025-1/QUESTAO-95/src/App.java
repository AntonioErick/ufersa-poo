import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        String[] testes = {"(()()()())","(((())))","(()((())()))","((((((())","())","(()()(()"};

        for(String teste : testes){
            System.out.println(teste + "->" + (estaBalanceada(teste) ? "Esta balanceada." : "Nao esta balanceada"));
        }
    }

    public static boolean estaBalanceada(String e){
        Stack<Character> pilha = new Stack<>();

        for(char c : e.toCharArray()){
            if(c == '('){
                pilha.push(c);
            }
            else if(c == ')'){
                if(pilha.isEmpty()){
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}
