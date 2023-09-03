import java.io.*;

public class Textos {
    String leer(String nombreArchivo)
    {
        String texto = "";
        try {
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);
            

            String temp= "";
            
            while (temp!= null) {
                temp = buffer.readLine();
                if (temp== null) 
                    break;
                // System.out.println(temp);
                texto = texto + temp;
            }

            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(texto);
        return texto;

        
    }
}
