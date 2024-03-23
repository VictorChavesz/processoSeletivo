public class Numero4 {
    public static void inverterString(String palavra, int indice){
        if(indice < palavra.length()){
            inverterString(palavra, indice+1);
            System.out.print(palavra.charAt(indice));
        }
    }    
    public static void main(String[] args) {
        inverterString("carro", 0);
    }    
}
