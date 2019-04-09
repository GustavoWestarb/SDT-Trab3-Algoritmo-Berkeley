package br.furb.berkeley;

import java.rmi.*;
import java.sql.Timestamp;

public interface BerkeleyInterface extends Remote{
	
	//método publico que recebe a requisição e a hora do Daemon de tempo e envia sua diferença de hora
	public long getRelogio(Timestamp hourServer) throws RemoteException;
}
