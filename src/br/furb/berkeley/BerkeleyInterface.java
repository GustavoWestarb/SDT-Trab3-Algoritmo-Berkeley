package br.furb.berkeley;

import java.rmi.*;
import java.sql.Timestamp;

public interface BerkeleyInterface extends Remote{
	
	//m�todo publico que recebe a requisi��o e a hora do Daemon de tempo e envia sua diferen�a de hora
	public long getRelogio(Timestamp hourServer) throws RemoteException;
}
