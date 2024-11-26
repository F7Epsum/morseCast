import java.util.HashMap;
import java.util.Scanner;

public class morseCastellano {
    public static void main(String[] args) {
        // Mapa de Morse a texto
        HashMap<String, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put(".-", "A");
        morseCodeMap.put("-...", "B");
        morseCodeMap.put("-.-.", "C");
        morseCodeMap.put("-..", "D");
        morseCodeMap.put(".", "E");
        morseCodeMap.put("..-.", "F");
        morseCodeMap.put("--.", "G");
        morseCodeMap.put("....", "H");
        morseCodeMap.put("..", "I");
        morseCodeMap.put(".---", "J");
        morseCodeMap.put("-.-", "K");
        morseCodeMap.put(".-..", "L");
        morseCodeMap.put("--", "M");
        morseCodeMap.put("-.", "N");
        morseCodeMap.put("---", "O");
        morseCodeMap.put(".--.", "P");
        morseCodeMap.put("--.-", "Q");
        morseCodeMap.put(".-.", "R");
        morseCodeMap.put("...", "S");
        morseCodeMap.put("-", "T");
        morseCodeMap.put("..-", "U");
        morseCodeMap.put("...-", "V");
        morseCodeMap.put(".--", "W");
        morseCodeMap.put("-..-", "X");
        morseCodeMap.put("-.--", "Y");
        morseCodeMap.put("--..", "Z");
        morseCodeMap.put("-----", "0");
        morseCodeMap.put(".----", "1");
        morseCodeMap.put("..---", "2");
        morseCodeMap.put("...--", "3");
        morseCodeMap.put("....-", "4");
        morseCodeMap.put(".....", "5");
        morseCodeMap.put("-....", "6");
        morseCodeMap.put("--...", "7");
        morseCodeMap.put("---..", "8");
        morseCodeMap.put("----.", "9");
        morseCodeMap.put("/", " "); // Separador de palabras

        //Introducir texto morse
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto en Morse (usa espacios para separar caracteres y '/' para separar palabras):");
        String morseInput = scanner.nextLine();

        //Separar por espacio
        String[] morseSymbols = morseInput.split(" ");

        // Construir la traducción
        StringBuilder translatedText = new StringBuilder();
        for (String symbol : morseSymbols) {
            String translatedChar = morseCodeMap.get(symbol);
            if (translatedChar != null) {
                translatedText.append(translatedChar);
            } else {
                translatedText.append("?"); // Para caracteres no reconocidos
            }
        }

        //Mostrar la traducción
        System.out.println("Texto traducido: " + translatedText.toString());

        scanner.close();
    }
}