package Edu.Gabriel.tiposevariaveis;

public class tiposdeOperadores7 {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;


        if(condicao1 && (7>4)){
            System.out.println("as duas condicoes sao verdadeiras");
        }

        if(condicao1 && condicao2){
            System.out.println("as tres condicoes sao verdadeiras");            
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das  condicoes e verdadeiras");
        }
        
        System.out.println("Fim");
    }
    
}
