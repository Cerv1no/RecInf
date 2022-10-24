import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio10 implements ejercicio{

    String Cadena;

    ejercicio10(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        Matcher mat = pat.matcher(Cadena);
        return mat.find();
    }
}