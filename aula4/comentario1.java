package aula4;

public class comentario1 {

    public static void main(String[] args) {
        
    }
    /*
     * este metodo foi elaborado as pressas
     * por isso eu abreviei o nome das variaveis
     * mas olha ele tem a finalidade somar ou multiplicar 
     * dois numeros.
     */
    public int somaMultiplica (int n, int x, String m){
        int r = 0; //r e igual ao resultado
        if (m=="M"){//M= multiplicacao
            r=n*x;

        }else{
            //se nao soma mesmo
            r= n+x;
        }
        return r;
    }


    
}
