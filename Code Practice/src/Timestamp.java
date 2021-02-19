import java.util.Date;
import java.text.SimpleDateFormat;

public class Timestamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String datestr = "2021-01-07 02:02:16.172";
		try {
			SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			Date parsedDate = dateformat.parse(datestr);
			java.sql.Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
			System.out.println(timestamp);
			System.out.println(timestamp.getClass());
		}
		catch(Exception e)
		{   
			System.out.println(e);
		}
	} 
		
}
