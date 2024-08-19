package view;

import controller.ControllerContar;

public class Principal {
	public static void main(String[] args) {
		
		ControllerContar controller = new ControllerContar();
		
		int result = controller.contar(100, 0);
		System.out.println(result);
		
	}
}
