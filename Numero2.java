import java.util.Scanner;

public class Numero2 {
    public static void econtrarFibonacci(int num, int nesimoNumero){
        boolean pertence = false;
        int resultado = 0;
        int a = 0;
        int b = 1;
        int posicao = 0;
        
        for(int i = 0; i < nesimoNumero ; i++){
            System.out.print(resultado + " ");
            
            resultado = a + b;
            b = a;
            a = resultado;

            if(num == resultado){
                pertence = true;
                posicao = i + 2;
            }
        }

        System.out.println();

        if(pertence == true){
            System.out.println("O numero " + num + " pertence a sequencia de Fibonacci e esta na posicao " + posicao);
        }else{
            System.out.println("O numero " + num + " não pertence a sequencia de Fibonacci");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe ate que posicao voce quer que a sequencia va ");
        int nesimoNumero = input.nextInt();

        System.out.println("Informe o numero que voce quer verificar se tem dentro da sequencia");
        int num = input.nextInt();

        econtrarFibonacci(num, nesimoNumero);

        input.close();
    }
}
