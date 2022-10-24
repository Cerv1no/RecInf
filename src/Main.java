public class Main {
    public static void main(String[] args) {

        ejercicio exercise = null;
        int chosen = 9;
        String cadena = "15/12/0";
        String fichero14 = "src/uca.txt";

        switch (chosen) {
            case 1 -> exercise = new ejercicio1(cadena);
            case 2 -> exercise = new ejercicio2(cadena);
            case 3 -> exercise = new ejercicio3(cadena);
            case 4 -> exercise = new ejercicio4(cadena);
            case 5 -> exercise = new ejercicio5(cadena);
            case 6 -> exercise = new ejercicio6(cadena);
            case 7 -> exercise = new ejercicio7(cadena);
            case 8 -> exercise = new ejercicio8(cadena);
            case 9 -> exercise = new ejercicio9(cadena);
            case 10 -> exercise = new ejercicio10(cadena);
            case 11 -> exercise = new ejercicio11(cadena);
            case 12 -> exercise = new ejercicio12(cadena);
            case 13 -> exercise = new ejercicio13(cadena);
            case 14 -> exercise = new ejercicio14(fichero14);
            case 15 -> exercise = new ejercicio15(cadena);
            case 16 -> exercise = new ejercicio16("src/EjercicioExpresiones.txt");
            case 17 -> exercise = new ejercicio17("src/EjercicioExpresiones.txt");
            case 18 -> exercise = new ejercicio18("src/EjercicioExpresiones.txt");
            case 19 -> exercise = new ejercicio19("src/EjercicioExpresiones.txt");
            case 20 -> exercise = new ejercicio20("src/EjercicioExpresiones.txt");
            default -> {
            }
        }
        if (exercise.execute()) {
            System.out.println("SI");
        }
        else {
            System.out.println("NO");
        }
    }
}