package br.furb.berkeley;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Timestamp;
import java.util.Date;

public class BerkeleyServerInterfaceImpl extends UnicastRemoteObject implements BerkeleyInterface {

	public BerkeleyServerInterfaceImpl() throws RemoteException {

	}

	@Override
	public long getRelogio(Timestamp hourServer) throws RemoteException {

		Date dateServer = new Date(hourServer.getTime());
		System.out.println("Hora recebida do servidor foi: " + dateServer.toString());
		
		Date myDate = new Date(2019, 04, 9, 18, 15);
		System.out.println("Data do cliente eh: " + myDate.toString());
			
		long diffMinutes = Math.abs(dateServer.getTime() - myDate.getTime());
		System.out.println("Diferenca entre a data do servidor e do cliente: " + diffMinutes);
		
		return diffMinutes;
	}

	
}
