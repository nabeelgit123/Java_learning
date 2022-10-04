package assessment;

import java.io.FileReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class InvalidValueException extends Exception // custom exception
{
	InvalidValueException(String msg) {
		System.out.println(msg);
	}

}

public class Program1 {
	/**
	 * this method reads the file at specific location stores/convert in string
	 */
	static String readfile(String loc) {
		try {
			FileReader fr = new FileReader(loc);
			int i;
			char c;
			String str = "";
			while ((i = fr.read()) != -1) {
				c = (char) i;
				str = str + String.valueOf(c);

			}
			fr.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	/**
	 * This method stores the data read in TreeMap and throws a custom exception if
	 * the value in the given file is empty , handles the exception and replace the
	 * empty value by "DEFAULT_VALUE" ,returns the updated TreeMap
	 * 
	 */
	public static TreeMap<String, String> defaultStore(String str) {
		String sar[] = str.split("\n");

		TreeMap<String, String> smap = new TreeMap<String, String>();

		for (int t = 0; t < sar.length; t++) // storing the data of file in TreeMap (takes unique values)
		{

			String[] st = sar[t].split("=");

			smap.put(st[0], st[1]);
		}

		for (Map.Entry<String, String> m : smap.entrySet()) {
			try {
				if (m.getValue().isBlank()) // checks if any value is empty
				{
					String km = m.getKey();
					String p = String.format("the value of %s key is empty ", km);
					System.out.println(p);
					throw new InvalidValueException("this is exp");// throws custom exception
				}
			} catch (InvalidValueException e)// handling exception
			{
				System.out.println(e);
				String key = m.getKey();
				String def = "DEFAULT_VALUE";
				smap.put(key, def);// replacing the empty value

			}

		}

		return smap;

	}

	/**
	 * This method prints the data in key value format
	 */
	public static void formatDisplay(TreeMap<String, String> smap) 
	{
			// for proper format
		System.out.println("KEY \t\t" + "VALUE");
		for (Map.Entry<String, String> m : smap.entrySet()) {
			// for proper format
			if (m.getKey().length() > 7) {
				System.out.println(m.getKey() + "\t" + m.getValue());
			}
			if (m.getKey().length() <= 7) {
				System.out.println(m.getKey() + "\t\t" + m.getValue());
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "C:\\Users\\Khalid\\Downloads\\sampleFile (1).txt";
		String ns = readfile(location);
		TreeMap<String, String> upmap = defaultStore(ns);
		formatDisplay(upmap);

	}

}
