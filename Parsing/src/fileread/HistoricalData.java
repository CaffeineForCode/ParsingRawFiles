package fileread;


public class HistoricalData {

	private String code;
	private String date;
	private double price;

	public HistoricalData(String code, String date2, double price)
	{
		this.code = code;
		this.date = date2;
		this.price = price;
	}

	public String toString()
	{

		return "code: " + code + "\n" + "date: " + date + "\n"
				+ "Price: " + price;
	}
}
