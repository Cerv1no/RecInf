import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio9 implements ejercicio{

    String Cadena;

    ejercicio9(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("[a-zA-Z]{5,10}");
        Matcher mat = pat.matcher(Cadena);
        return mat.matches();
    }
}