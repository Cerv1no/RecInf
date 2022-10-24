import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio8 implements  ejercicio{

    String Cadena;

    ejercicio8(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("^www.*\\.es");
        Matcher mat = pat.matcher(Cadena);
        return mat.matches();
    }
}
