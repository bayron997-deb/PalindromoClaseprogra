public class palindromo {
    public static boolean esPalindromo(String palabra){
        //se crea un metodo que toma una palabra y la retorna
        //instruccion: toma auxiliarpalabra, crea un builder con la variable palabra, la da vuelta y la convierte en string
        //luego la compara y devuelve un boleean
        String auxiliarpalabra = new StringBuilder(palabra).reverse().toString();
        return auxiliarpalabra.equals(palabra);
    }
}
