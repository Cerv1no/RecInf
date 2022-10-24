import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio1 implements ejercicio {
    String Cadena;

    ejercicio1(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("^abc");
        Matcher mat = pat.matcher(Cadena);
        return mat.find();
    }
}
