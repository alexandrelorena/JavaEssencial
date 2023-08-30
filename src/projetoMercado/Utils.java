package projetoMercado;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Utils {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

	//Recebe date e retorna data em portugues
	public static String dateParaString(Date data) {
		return Utils.sdf.format(data);

	}

	//Recebe double e retorna valor em R$
	public static String doubleParaString(Double valor) {
		return Utils.nf.format(valor);
	}

	//Recebe valor (string) e retorna double
	public static Double stringParaDouble(String valor) {
		try {
			return (Double) Utils.nf.parse(valor);
		} catch (ParseException e) {
			return null;
		}
	}

	//Pausar o programa e mostrar a mensagem
	public static void pausar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		} catch (InterruptedException e) {
			System.out.println("Erro ao pausar por " + segundos + " segundos.");
		}
	}
}
