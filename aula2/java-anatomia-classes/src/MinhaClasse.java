public class MinhaClasse {
    
    public static void main( String [] args) {

       // System.out.print ( "Ola Mundo, estou no java" );   
        
        
        String primeiroNome = "Gabriel";
        
        String segundoNome = "Luiz";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        //int anoFabricacao = 2022;

        //boolean verdadeira = false;

        //anoFabricacao = 2018;

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
