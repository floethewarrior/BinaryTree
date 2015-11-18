
public class SmallestTimeInterval {

	public static void main(String[] args)
	{
		String[] times = {"00:00", "01:00", "01:30", "02:45", "04:56", "10:23", "12:30", "04:50", "13:33", "19:50", "20:20", "23:59"};
		for(String time : times)
		{
			System.out.print(convertToMinutes(time)+", ");
		}
		System.out.println();
		
		System.out.println(getSmallestTimeInterval(times, 11, 0));
		
		
	}
	
	public static String getSmallestTimeInterval(String [] times, int indexOne, int indexTwo)
	{
		int minutesOne = convertToMinutes(times[indexOne]);
		int minutesTwo = convertToMinutes(times[indexTwo]);
		System.out.println("Checking times: " + minutesOne + " and " + minutesTwo);
		int diffOne = Math.abs(minutesTwo-minutesOne);
		System.out.println("diffOne: " + diffOne);
		int diffTwo = Math.abs(1440-minutesTwo-minutesOne);
		System.out.println("diffTwo: " + diffTwo);
		if (diffOne<diffTwo)
			return convertToHoursMinutes(diffOne);
		else
			return convertToHoursMinutes(diffTwo);
		
	}
	
	private static String convertToHoursMinutes(int m)
	{
		int hours = m/60;
		int minutes = m%60;
		if(hours < 10)
		{
			if(minutes < 10)
				return "0"+ hours + ":0" + minutes;
			else
				return "0" + hours + ":" + minutes;
		}
		return hours + ":" + minutes;
		
	}
	
	private static int convertToMinutes(String time)
	{
		String [] components = time.split(":");
		int hours = Integer.parseInt(components[0]);
		int minutes = Integer.parseInt(components[1]);
		return hours*60+minutes;
	}
	
}
