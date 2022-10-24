import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio6 implements ejercicio{

    String Cadena;

    ejercicio6(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("2(?!6)");
        Matcher mat = pat.matcher(Cadena);
        return mat.find();
    }
}
