public class FibonacciClass {

    static long fib(int num){ //Iteração

        int F = 0;
        int ant = 0;

        for(int i = 1; i <= num; i++){
            if (i == 1) {

                F = 1;
                ant = 0;
                
            }else{
                F += ant;
                ant = F - ant;
            }
        }

        return F;
         
    }

    static long fibRec(Long num){ //Recursão

        if (num < 2) {
            return num;
            
        }else{
            return fibRec(num -1) + fibRec(num - 2); 
        }
    }

    static long fibTer(Long num){ //recursão com operador ternário 

        return (num < 2) ? num : fibTer(num -1) + fibTer(num -2);

    }



    private static int[] vet = new int[50];
    private static int contador;
    
    static long fibVet(int num){

        contador = 1;

        return vetRec(num);
    }

    static long vetRec(int num){

        if(num < 0){

            return vet[0];

        }else{
            if (contador < 3){

                vet[num] = contador -1;
                contador++;

            }else{
                vet[num] = vet[num + 1] + vet[num + 2];
            }
        }
        return vetRec(num - 1);
    }

    public static void main(String[] args) {

        // System.out.println("Calculando de maneira Iterativa"); //chamada da classe para calcular de maneira Iterativa
        // for(int i = 0; i < 30; i++ ){
        //     System.out.println("(" + i + ")" + FibonacciClass.fib(i) + "\t");
        // }

        // System.out.println("Calculando de maneira Recursiva"); //chamada da classe para calcular de maneira Recursiva
        // for(int i = 0; i < 30; i++ ){
        //     System.out.println("(" + i + ")" + FibonacciClass.fibRec((long) i) + "\t");
        // }

        // System.out.println("Calculando de maneira recursiva 02 com operador ternário"); //chamada da classe para calcular de maneira Iterativa com Operador Ternário 
        // for(int i = 0; i < 30; i++ ){
        //     System.out.println("(" + i + ")" + FibonacciClass.fibTer((long) i) + "\t");
        // }

        // System.out.println("Calculando de maneira recursiva 03 com vetor"); //chamada da classe para calcular de maneira Recursiva com Vetor
        // for(int i = 0; i < 30; i++ ){
        //     System.out.println("(" + i + ")" + FibonacciClass.fibVet(i) + "\t");
        // }
        // System.out.println("Esse é o elemento na posição 7: " + vet[7]);
    }
}
