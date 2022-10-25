import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class ejercicio20 implements ejercicio{

    String Cadena;

    ejercicio20(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        String texto = null;
        FileWriter fichero = null;

        try {
            texto = new String(Files.readAllBytes(Paths.get(Cadena)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            fichero = new FileWriter("src/resultado.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {

            fichero.write(texto.replaceAll("  "," "));
            fichero.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}