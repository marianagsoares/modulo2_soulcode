package poo;

import java.time.LocalDate;

public class clienteTeste {
    public static void main(String[] args){

        Cliente cliente1 = new Cliente (1, "Felipe", "Jose", LocalDate.of(1993, 5, 25),
                1.85, 95.0);

        //--------------USO DO GET ---------------------------//

        System.out.println(cliente1.getNome());
        //System.out.println(cliente1.sobrenome);
        // VAI DAR ERRADO PORQUE MEU ATRIBUTO ESTA PRIVADO NA CLASSE
        //PRECISO USAR O GET PARA ACESSA-LO
        System.out.println(cliente1.getSobrenome());

        //---------------USO DO SETTER------------------//

        cliente1.setPeso(15);


    }

}
