import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio9 implements ejercicio{

    String Cadena;

    ejercicio9(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("^(3[01]?|[0-2]?[0-9])/(1[0-2]?|[0-9])/[0-9]{1,2}$");
        Matcher mat = pat.matcher(Cadena);
        return mat.find();
    }
}