package fr.eni.quelmedecin.exception;

import java.util.ArrayList;
import java.util.List;

public class ApplicationException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Throwable> causes = new ArrayList<>();
	
	public void ajouterCause(Throwable cause) {
		causes.add(cause);
	}

	public List<Throwable> getCauses() {
		return causes;
	}

}
