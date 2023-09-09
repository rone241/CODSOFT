package com.example.CurrencyConventor;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public class App 
{
	static void pLines() {
		for(int i=0;i<50;i++) {
			System.out.print("\u001b[32m~");
		}System.out.println();
	}
    public static void main( String[] args ) throws IOException
    {
    	Scanner scan=new Scanner(System.in);
    	pLines();
    	System.out.printf("%30s %n","Currency Convertor");
    	pLines();
        System.out.printf("%n %s","\u001b[33mCURRENCY TO CONVERT FROM (eg.,INR):\u001b[32m");
        String cur1=scan.nextLine().toUpperCase();
        System.out.printf("%n %s","\u001b[33mCURRENCY TO BE CONVERTED TO (eg.,USD):\u001b[32m");
        String cur2=scan.nextLine().toUpperCase();
        pLines();
        System.out.printf("%n %s","ENTER \u001b[33m"+cur1+"\u001b[32m CURRECNY :\u001b[33m");
        BigDecimal cur3=scan.nextBigDecimal();
        
        String url_str = "https://api.exchangerate.host/latest?base="+cur1.toUpperCase();
         OkHttpClient client=new OkHttpClient();
         
         Request req=new Request.Builder().url(url_str).get()
                 .build();
         Response rep=client.newCall(req).execute();
         String strrespose=rep.body().string();
         
         JSONObject jobj=new JSONObject(strrespose);
         JSONObject rateobj=jobj.getJSONObject("rates");
         BigDecimal rate=rateobj.getBigDecimal(cur2.toUpperCase());
         BigDecimal res=rate.multiply(cur3);
         System.out.printf("%n %s %n","\u001b[33m"+cur2+"\u001b[32m CURRENCY :\u001b[33m"+res);
         pLines();
         System.out.println("\n\u001b[33m >> "+cur3+" "+cur1+"\u001b[32m is equals to \u001b[33m"+res+" "+cur2+" <<\n");
         pLines();
    }
}
