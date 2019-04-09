package br.furb.berkeley;

import java.rmi.*;
import java.rmi.registry.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BerkeleyInterface sdrmi = new BerkeleyServerInterfaceImpl();
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("BerkeleyServerInterfaceImpl", sdrmi);
			System.out.println("Servidor de tempo " + sdrmi + " registrado e pronto para aceitar solicitações.");
		} catch (Exception ex) {
			System.out.println("Houve um erro: " + ex.getMessage());
		}
	}

}
