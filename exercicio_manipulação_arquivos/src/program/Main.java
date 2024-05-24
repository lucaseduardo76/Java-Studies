package program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.entities.Products;

public class Main {

	public static void main(String[] args) {
		
		String path = "c:\\Temp\\source.csv";
				
		List<Products> productList = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String product = br.readLine();
						
			while(product != null) {
				String[] infoProd = splitText(product);		
				productList.add(new Products(infoProd[0], Double.parseDouble(infoProd[1]), Integer.parseInt(infoProd[2])));
				product = br.readLine();
			}
						
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\Temp\\outSourced.csv", true))) {
				for(Products p : productList) {
					bw.write(p.toString());
					bw.newLine();
				}
			}
			
			
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}	
	
	
	public static String[] splitText(String text) {
		return text.split(",\\s*");
	}

}
