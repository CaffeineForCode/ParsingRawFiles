package fileread;



import java.io.BufferedReader;

import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
public class fileRead {

	public static void main(String[] args) throws IOException{
	
		ArrayList<HistoricalData> hisItem=new ArrayList<>();
		Path file = Paths.get("U:/Mrigank/BOTW_Data/Platts_0911_ftp_text_files/ug_20150911.ftp");
		BufferedReader reader = Files.newBufferedReader(file, Charset.defaultCharset());
		//StringBuilder content = new StringBuilder();
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] tokenize = line.split(" ");
			String tempItem = tokenize[0];

			if(tempItem.equals("N")){
				String code=tokenize[1];
				if (code.length() > 0 && code.charAt(code.length()-1)=='c') {
					code = code.substring(0, code.length()-1);
					String dateTemp=tokenize[2];
					dateTemp=dateTemp.substring(0, dateTemp.length()-4);
					double price = Double.parseDouble(tokenize[3]);
					HistoricalData tempObj = new HistoricalData(code, dateTemp, price);
					hisItem.add(tempObj);
				}
			
			}

		}
		for (HistoricalData each : hisItem)
		{
			System.out.println("====================");
			System.out.println(each);
			System.out.println();
		
		}

	}
}
