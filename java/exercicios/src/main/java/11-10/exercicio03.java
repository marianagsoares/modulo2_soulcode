public class exercicio03 {
    public static void main(String[] args){
        int v1[] = new int[]{8, 9, 5, 6, 10, 2, 1, 0, 25, 22};
        int v2[] = new int[]{8, 2, 9, 6, 10, 2, 1, 25, 0, 22};
        int armazenaValoresIguais[] = new int[v1.length];
        int soma = 0;


        for (int i=0; i<v1.length; i++){
            if(v1[i] == v2[i]){
                armazenaValoresIguais[soma] = v1[i];
                soma = soma + 1;
            }
        }
        System.out.printf("v1 e v2 apresentam os mesmos valores nas mesmas posições %d vezes", soma);

        for(int i=0; i<soma; i++){
            System.out.printf("\nOs valores são %d", armazenaValoresIguais[i]);
        }
    }
}
