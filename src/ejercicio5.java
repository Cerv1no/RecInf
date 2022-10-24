import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio5 implements ejercicio{

    String Cadena;

    ejercicio5(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        //Pattern pat = Pattern.compile(("a*|l*")); //"^[la]*"
        Pattern pat = Pattern.compile(("a+|l+"));
        Matcher mat = pat.matcher(Cadena);
        return mat.matches();
    }
}
