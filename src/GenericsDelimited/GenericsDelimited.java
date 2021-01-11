package GenericsDelimited;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import GenericDelimitedService.CalculationService;
import GenericDelimitedService.products;

public class GenericsDelimited {

	public static void main(String[] args) throws IOException {
		String path = "/home/pedro/Documentos/numbers.txt";

		List<products> list = new ArrayList<>(); 
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new products(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			products x = CalculationService.max(list);
			System.out.println("max: ");
			System.out.println(x);
			
		} catch(IOException e) {
			throw new IOException(e.getMessage());
		}
	}

}
