import java.util.HashMap;
import java.util.Scanner;

public class Traductor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una opción:");
        System.out.println("1. Traducir texto de Castellano a Morse");
        System.out.println("2. Traducir texto de Morse a Castellano");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            castellanoAMorse(scanner);
        } else if (opcion == 2) {
            morseACastellano(scanner);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    public static void castellanoAMorse(Scanner scanner) {
        HashMap<Character, String> mapaCastellanoAMorse = crearMapaCastellanoAMorse();

        System.out.println("Ingresa el texto en castellano:");
        String input = scanner.nextLine().toUpperCase();

        StringBuilder textoEnMorse = new StringBuilder();

        for (char caracter : input.toCharArray()) {
            String morse = mapaCastellanoAMorse.get(caracter);
            if (morse != null) {
                textoEnMorse.append(morse).append(" ");
            } else {
                System.out.println("Valor " + caracter + " no admitible");
            }
        }

        System.out.println("Texto traducido a Morse:");
        System.out.println(textoEnMorse.toString().trim());
    }

    public static void morseACastellano(Scanner scanner) {
        HashMap<String, Character> mapaMorseACastellano = crearMapaMorseACastellano();

        System.out.println("Ingresa el texto en Morse (separado por espacios):");
        String input = scanner.nextLine();

        StringBuilder textoEnCastellano = new StringBuilder();

        String[] palabrasMorse = input.split(" ");
        for (String morse : palabrasMorse) {
            Character caracter = mapaMorseACastellano.get(morse);
            if (caracter != null) {
                textoEnCastellano.append(caracter);
            } else {
                System.out.println("Valor " + morse + " no admitible");
            }
        }

        System.out.println("Texto traducido a Castellano:");
        System.out.println(textoEnCastellano.toString());
    }

    public static HashMap<Character, String> crearMapaCastellanoAMorse() {
        HashMap<Character, String> mapa = new HashMap<>();
        mapa.put('A', ".-");
        mapa.put('B', "-...");
        mapa.put('C', "-.-.");
        mapa.put('D', "-..");
        mapa.put('E', ".");
        mapa.put('F', "..-.");
        mapa.put('G', "--.");
        mapa.put('H', "....");
        mapa.put('I', "..");
        mapa.put('J', ".---");
        mapa.put('K', "-.-");
        mapa.put('L', ".-..");
        mapa.put('M', "--");
        mapa.put('N', "-.");
        mapa.put('O', "---");
        mapa.put('P', ".--.");
        mapa.put('Q', "--.-");
        mapa.put('R', ".-.");
        mapa.put('S', "...");
        mapa.put('T', "-");
        mapa.put('U', "..-");
        mapa.put('V', "...-");
        mapa.put('W', ".--");
        mapa.put('X', "-..-");
        mapa.put('Y', "-.--");
        mapa.put('Z', "--..");
        mapa.put('0', "-----");
        mapa.put('1', ".----");
        mapa.put('2', "..---");
        mapa.put('3', "...--");
        mapa.put('4', "....-");
        mapa.put('5', ".....");
        mapa.put('6', "-....");
        mapa.put('7', "--...");
        mapa.put('8', "---..");
        mapa.put('9', "----.");
        mapa.put(' ', "/");
        return mapa;
    }

    public static HashMap<String, Character> crearMapaMorseACastellano() {
        HashMap<String, Character> mapa = new HashMap<>();
        mapa.put(".-", 'A');
        mapa.put("-...", 'B');
        mapa.put("-.-.", 'C');
        mapa.put("-..", 'D');
        mapa.put(".", 'E');
        mapa.put("..-.", 'F');
        mapa.put("--.", 'G');
        mapa.put("....", 'H');
        mapa.put("..", 'I');
        mapa.put(".---", 'J');
        mapa.put("-.-", 'K');
        mapa.put(".-..", 'L');
        mapa.put("--", 'M');
        mapa.put("-.", 'N');
        mapa.put("---", 'O');
        mapa.put(".--.", 'P');
        mapa.put("--.-", 'Q');
        mapa.put(".-.", 'R');
        mapa.put("...", 'S');
        mapa.put("-", 'T');
        mapa.put("..-", 'U');
        mapa.put("...-", 'V');
        mapa.put(".--", 'W');
        mapa.put("-..-", 'X');
        mapa.put("-.--", 'Y');
        mapa.put("--..", 'Z');
        mapa.put("-----", '0');
        mapa.put(".----", '1');
        mapa.put("..---", '2');
        mapa.put("...--", '3');
        mapa.put("....-", '4');
        mapa.put(".....", '5');
        mapa.put("-....", '6');
        mapa.put("--...", '7');
        mapa.put("---..", '8');
        mapa.put("----.", '9');
        mapa.put("/", ' ');
        return mapa;
    }


}
