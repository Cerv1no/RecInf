import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio11 implements ejercicio{

    String Cadena;

    ejercicio11(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("^(\\+34 )([89][1-8] [0-9]{7})");
        Matcher mat = pat.matcher(Cadena);
        return mat.find();
    }
}