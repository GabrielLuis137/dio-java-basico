package Edu.Gabriel.tiposevariaveis;

public class tiposdeOperadores6 {
    public static void main(String[] args) {
        
        String nomeUm= "Gabriel";
        String nomeDois = new String ("Gabriel");
        //com o new string quer dizer que e outro objeto.
        
        
        System.out.println(nomeUm.equals(nomeDois));
        
        
        
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        if(numero1<numero2){
            System.out.println("a nossa condicao e verdadeira");
        }


        System.out.println("numeroUm e igual a numeroDoius? "+ simNao);
        
        simNao = numero1 !=numero2;

        System.out.println("numeroUm e diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm e maior que numeroDois? "+ simNao);
    }
    
}
