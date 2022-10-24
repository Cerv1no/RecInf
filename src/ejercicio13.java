import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio13 implements ejercicio{

    String Cadena;

    ejercicio13(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("v[1!i][a@]gr[a@]");
        Matcher mat = pat.matcher(Cadena);
        return mat.find();
    }
}