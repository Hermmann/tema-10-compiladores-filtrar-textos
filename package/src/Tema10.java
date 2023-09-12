

public class Tema10 {
    public static void main(String[] args) {
        // String texto = "Podemos agrupar una parte de nuestra expresión regular con
        // paréntesis"
        // "Además de poder agrupar, podemos crear una referencia posterior de la
        // expresión, es decir, una referencia que se hace más tarde almacena la parte
        // de string que coincide con el grupo";
        Textos t = new Textos();
        String texto = t.leer("package/texto.txt");

        String pattern = "n(?=[bp])";
        // Usar una expresión regular para buscar 'nb' o 'np' y reemplazar con 'm'
        String resultado = texto.replaceAll(pattern, "m");
        System.out.println();
        System.out.println("Texto corregido.");
        
        System.out.println(resultado);
    }
}
