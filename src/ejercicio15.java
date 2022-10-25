import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio15 implements ejercicio{

    String Cadena;

    ejercicio15(String cadena) {Cadena = cadena;}

    @Override
    public boolean execute() {
        //el regex siempre va a intentar matchear lo maximo posible
        //siendo la cadena eeeAiiZuuuuAoooZeeee
        //A.*Z te matchea AiiZuuuuAoooZ
        //A.*?Z te matchea AiiZ y AoooZ
        //Pattern pat = Pattern.compile("<[^>]*>([^<]*)</[^>]*>"); //Funciona correctamente
        //Pattern pat = Pattern.compile("<.*>(.*)<\\/.*>"); //Solo recoge la ultima, ya que <.*> no para hasta que llega a la ultima etiqueta <e>, además el rango cogerá
        // to do hasta el utimo cierre de etiqueta
        Pattern pat = Pattern.compile("<.*?>(.*?)<\\/.*?>"); //Funciona, .*? lo convierte en lazy haciendo que coja el menor numero de repeticiones posibles
        Matcher mat = pat.matcher(Cadena);
        while(mat.find()) {
            System.out.println(mat.group(1));
        }
        return true;
    }
}