package test;

import lombok.Getter;

@Getter
public class Main {

	public String message = "Hello"; 
	
	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(main.getMessage());

	}
	
	

}
