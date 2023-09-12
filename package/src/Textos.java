import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 

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
        System.out.println("Texto original.");
        System.out.println(texto);
        return texto;

        
    }
}
