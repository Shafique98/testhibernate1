package com.velociter.hibernate.payment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyWrite {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		String path = "D:/Project/testhibernate/properties/PaymentDetails.properties";
		FileOutputStream fos = new FileOutputStream(path);
		
		
		String[] ammount = {"1250","2662","1520","1250","1236","5201","8501","5621","2510","3651","2548","6320","3210","2554","2330","1254","4521","1236","1200","9800"};
		
		//String[] types= {"INR","VISA","127854"};
		
		
		for(int i=1;i<21;i++) {
			if(i<10) {
				prop.put("payment.0"+i+".id",""+i);
				prop.put("payment.0"+i+".ammount",ammount[i-1]);
				prop.put("payment.0"+i+".ccType","");
				prop.put("payment.0"+i+".currencyType","");
				prop.put("payment.0"+i+".chequeNumber","");
					
			}else {
			prop.put("payment."+i+".id",""+i);
			prop.put("payment."+i+".ammount",ammount[i-1]);		
			prop.put("payment."+i+".ccType","");
			prop.put("payment."+i+".currencyType","");
			prop.put("payment."+i+".chequeNumber","");
				
			}
			}
		prop.store(fos, path);
		prop.clear();
//		prop.put("payment.1.paymentid","1");
//		prop.put("payment.1.ccType","");
//		prop.put("payment.1.cash","");
//		prop.put("payment.1.cheque","123456");
//
//		prop.put("payment.2.ammount","1320");
//		prop.put("payment.2.paymentid","2");
//		prop.put("payment.2.ccType","");
//		prop.put("payment.2.cash","INR");
//		prop.put("payment.2.cheque","");
//
//		prop.put("payment.3.ammount","1020");
//		prop.put("payment.3.paymentid","3");
//		prop.put("payment.3.ccType","VISA");
//		prop.put("payment.3.cash","");
//		prop.put("payment.3.cheque","");
//
//		prop.put("payment.4.ammount","4562");
//		prop.put("payment.4.paymentid","4");
//		prop.put("payment.4.ccType","");
//		prop.put("payment.4.cash","");
//		prop.put("payment.4.cheque","456123");
//
//		prop.put("payment.5.ammount","9510");
//		prop.put("payment.5.paymentid","5");
//		prop.put("payment.5.ccType","");
//		prop.put("payment.5.cash","INR");
//		prop.put("payment.5.cheque","");
//
//		prop.put("payment.6.ammount","1265");
//		prop.put("payment.6.paymentid","6");
//		prop.put("payment.6.ccType","MasterCard");
//		prop.put("payment.6.cash","");
//		prop.put("payment.6.cheque","");
		
		
//		prop.put("payment.2.ammount","4512");
//		prop.put("payment.3.ammount","1200");
//		prop.put("payment.4.ammount","2700");
//		prop.put("payment.5.ammount","4500");
		

		
		System.out.println("File Created :");
	}

}
