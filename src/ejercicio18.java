import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class ejercicio18 implements ejercicio{

    String Cadena;

    ejercicio18(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        String texto = null;
        FileWriter fichero = null;
        try {
            fichero = new FileWriter("src/resultado.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            texto = new String(Files.readAllBytes(Paths.get(Cadena)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            texto = texto.replaceAll("[:,.;?¿¡!\"’<>]", "");
            texto = texto.replaceAll("Á","A");
            texto = texto.replaceAll("É","E");
            texto = texto.replaceAll("Í","I");
            texto = texto.replaceAll("Ó","O");
            texto = texto.replaceAll("Ú","U");
            texto = texto.replaceAll("á","a");
            texto = texto.replaceAll("é","e");
            texto = texto.replaceAll("í","i");
            texto = texto.replaceAll("ó","o");
            texto = texto.replaceAll("ú","u");
            fichero.write(texto.replaceAll("[ \\d]\\d[ \\d]", " "));
            fichero.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}