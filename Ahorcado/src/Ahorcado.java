import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) throws Exception {

        Scanner telcado = new Scanner(System.in);

        //Declaracion y Asignacion.
        String palabra_secreta = "fanny";
        int intentos_Max = 5;
        int N_intentos = 0;
        boolean palabra_Adivinada = false;

        System.out.println("-------JUEGO DE AHORCADO-------");
        //Arreglo.
        char Letra_Adivinada [] = new char[palabra_secreta.length()];

        for(int i = 0; i<Letra_Adivinada.length; i++){
            Letra_Adivinada[i] = '_';
        }

        //miestras 
        while (!palabra_Adivinada &&  N_intentos < intentos_Max){
            System.out.println("Palabra a adivinar "+String.valueOf(Letra_Adivinada) + " (" +palabra_secreta.length() + " letras)");          
            System.out.print("Introduce por favor una letra: ");
            char letra = Character.toLowerCase(telcado.next().charAt(0));
            boolean letra_Correcta = false;
            
            for(int i=0; i<palabra_secreta.length(); i++){
                if (palabra_secreta.charAt(i) == letra) {
                    Letra_Adivinada[i] = letra;
                    letra_Correcta = true;
                    
                }
            }

            //Si la letra no es correcta!!! 
            if (!letra_Correcta) {
                N_intentos++;
                System.out.println("Letra incorrecta te quedan: " +(intentos_Max - N_intentos) + " intentos");
            }

            //si la letra es correcta!!!
            if(String.valueOf(Letra_Adivinada).equals(palabra_secreta)){
                palabra_Adivinada = true;
                System.out.println("Felicidades es la palabra secreta: " + palabra_secreta);
            }
        } 
        //Si la palabra no es adivinada
        if (!palabra_Adivinada){
            System.out.println("Perdon te quedastes sin intentos :( ");
        }
        telcado.close();
    }
}
