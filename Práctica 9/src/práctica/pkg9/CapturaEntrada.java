package práctica.pkg9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author galindo
 */
public class CapturaEntrada {

    private static final DateFormat formato = new SimpleDateFormat("dd.MM.yyyy");

    public static Date capturaDate(String msg) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + "(dd.MM.yyy): ");
        return CapturaEntrada.formato.parse(sc.nextLine());
    }

    public static String capturaString(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextLine();
    }

    public static char capturaChar(String msg) {
        return CapturaEntrada.capturaString(msg).charAt(0);
    }

    public static int capturaInt(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextInt();
    }

    public static float capturaFloat(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg + ": ");
        return sc.nextFloat();
    }

}
