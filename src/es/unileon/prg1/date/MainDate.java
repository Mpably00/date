import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(8, 4, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today.getMonthName());
		System.out.println(tomorrow.getMonthName());
		System.out.println(today.getSeasonName());
		System.out.println(tomorrow.getSeasonName());
		System.out.println(today.getcorrectDayName());
		System.out.println(tomorrow.getcorrectDayName());
		System.out.println(today.printMonthLefts());
		System.out.println(tomorrow.printMonthLefts());
		System.out.println(today.countDate());
		System.out.println(today.countMonths());
		System.out.println(tomorrow.countMonths());
		System.out.println(today.countDay());
		//System.out.println(today.attempsNeededWhile());
		System.out.println(today.weekDay());
}
}
