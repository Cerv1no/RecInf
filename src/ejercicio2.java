import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio2 implements ejercicio{
    String Cadena;

    ejercicio2(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("^abc|^ABC");
        Matcher mat = pat.matcher(Cadena);
        return mat.find();
    }

}
