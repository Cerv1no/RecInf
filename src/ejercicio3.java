import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio3 implements ejercicio{

    String Cadena;

    ejercicio3(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("^\\D");
        Matcher mat = pat.matcher(Cadena);
        return mat.find();
    }
}
