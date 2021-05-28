package tn.esprit;

import org.apache.log4j.Logger;

public class Calcul {
	
	private static final Logger logger = Logger.getLogger(Calcul.class);

	public int calculerSom (int a, int b) {
		int res = 0;
		try {
			logger.info("In calculerSom(" + a + ", " + b + ")");
			res = a + b;
			logger.info("Out calculerSom() : " + res);
		} catch (Exception e) {logger.error("Erreur : " + e);}
		return res;
	}

}
