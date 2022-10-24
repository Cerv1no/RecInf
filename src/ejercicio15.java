import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio15 implements ejercicio{

    String Cadena;

    ejercicio15(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        Pattern pat = Pattern.compile("<.*?>(.*?)<\\/.*?>");
        //Matcher mat = pat.matcher(Cadena);
        String[] items = pat.split(Cadena);
        for(String s : items) {
            System.out.println(s);
        }
        return true;
    }
}