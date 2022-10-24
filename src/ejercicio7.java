import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio7 implements ejercicio{

    String Cadena;

    ejercicio7(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("[a-zA-Z]{5,10}");
        Matcher mat = pat.matcher(Cadena);
        return mat.matches();
    }
}
