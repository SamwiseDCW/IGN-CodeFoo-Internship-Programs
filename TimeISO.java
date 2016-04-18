import java.text.DateFormat;
   import java.text.SimpleDateFormat;
import java.text.ParseException;
   import java.util.Date;

 class DFEd {

public static void main(String[] args) {

Date now = new Date();

   String dateString = now.toString();
System.out.println("1. "+ dateString);

   SimpleDateFormat format = new SimpleDateFormat ("YYYY-MM-DD");

   try {
   Date parsed = format.parse(dateString);
System.out.println(" 2. " + parsed.toString());
}
   catch(ParseException pe) {
  System.out.println("ERROR: Cannot parse \"" + dateString + "\"");

System.out.println(" 3. " + format.format(now));
}
}
}