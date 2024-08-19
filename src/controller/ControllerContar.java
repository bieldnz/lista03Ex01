package controller;

public class ControllerContar {
	
	public ControllerContar() {
		super();
	}
	
	public int contar(int number, int n) {
		if(Integer.toString(number).length() > n) {
			int result = contar(number, n+1); //A função em relação ao termo anterior deve ser escrita dessa forma
			return result;
		}else { //Ter percorrido o número todo
			return n;
		}
	}
	
}
