package br.furb.berkeley;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Timestamp;

public class BerkeleyCliente {

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry("localhost");
			BerkeleyInterface c = (BerkeleyInterface) registry
					.lookup("BerkeleyServerInterfaceImpl");
			System.out.println("O objeto servidor " + c + " foi encontrado com sucesso.\n");
			
			Timestamp myTimestamp = new Timestamp(System.currentTimeMillis());

			System.out.println("A diferença de horas é: " + c.getRelogio(myTimestamp));
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}