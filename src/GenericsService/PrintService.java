package GenericsService;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> values = new ArrayList<>();
	
	public void add(T value) {
		this.values.add(value);
	}

	public T first() {		
		if (this.values.isEmpty()) {
			throw new IllegalStateException("Invalid Operation");
		}
		return this.values.get(0);
	}
	
	public void print() {
		System.out.print("[" + this.values.get(0));
		for(int i = 1; i < this.values.size(); i++) {
			System.out.print("," + this.values.get(i));
		}
		System.out.print("]");
	}
}
