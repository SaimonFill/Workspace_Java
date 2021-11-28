import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		/*
		 * Instanciando um calendário e botando a data "d" dentro dele
		 */
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		/*
		 * Incrementando uma data
		 */
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime(); // Pega a variavel "d" que foi para o "set"
		
		System.out.println(d);
		
		/*
		 * Pegar uma unidade de tempo "saber quantos minutos tem na data"
		 */
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
		
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Month: " + month);
	}

}
