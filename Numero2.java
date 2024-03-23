import java.util.Scanner;

public class Numero2 {
    public static boolean econtrarFibonacci(int num, int nesimoNumero){
        boolean pertence = false;
        int resultado = 0;
        int a = 0;
        int b = 1;
        
        for(int i = 0; i < nesimoNumero ; i++){
            System.out.print(resultado + " ");
            
            resultado = a + b;
            b = a;
            a = resultado;

            if(num == resultado){
                pertence = true;

            }
        }
        return pertence;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe ate que posicao voce quer que a sequencia va ");
        int nesimoNumero = input.nextInt();

        System.out.println("Informe o numero que voce quer verificar se tem dentro da sequencia");
        int num = input.nextInt();

        boolean pertence = econtrarFibonacci(num, nesimoNumero);

        System.out.println();

        if(pertence == true){
            System.out.println("O numero " + num + " pertence a sequencia de Fibonacci e esta na posicao");
        }else{
            System.out.println("O numero " + num + " não pertence a sequencia de Fibonacci");
        }

        input.close();
    }
}
