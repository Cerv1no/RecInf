import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio14 implements ejercicio{

    String Cadena;

    ejercicio14(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        FileReader f = null;
        String texto = null;
        try {
            f = new FileReader(Cadena);
            BufferedReader b = new BufferedReader(f);
            while((Cadena = b.readLine())!=null) {
                texto += Cadena;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Pattern pat = Pattern.compile("<img\\s+[^>]*src\\s*=\\s*\"([^\"]*)\"");
        Matcher mat = pat.matcher(texto);
        while (mat.find()){
            System.out.println(mat.group(1));
        }
        return mat.find();
    }
}