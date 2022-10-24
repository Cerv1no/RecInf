import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio12 implements ejercicio{

    String Cadena;

    ejercicio12(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("^P( \\d{2}-\\d{5}$|-\\d{2}-\\d{4}$|# \\d{2} \\d{4}$|#\\d{2}-\\d{4}$| \\d{6}$)");
        Matcher mat = pat.matcher(Cadena);
        return mat.find();
    }
}