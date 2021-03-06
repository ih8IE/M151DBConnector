package io.r79.mp151_projekt;

import io.r79.mp151_projekt.dao.MySQLDAO;
import io.r79.mp151_projekt.dto.PerformanceDTO;
import io.r79.mp151_projekt.dto.VisitorDTO;
import io.r79.mp151_projekt.rmiInterface.FilmClubInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by rbuechle on 03.12.2014.
 */
public class SQLtoRMIConnector extends UnicastRemoteObject implements FilmClubInterface{
    private MySQLDAO dao = new MySQLDAO("url");

    protected SQLtoRMIConnector() throws RemoteException {
    }

    @Override
    public ArrayList<PerformanceDTO> getPerformances(Date start, Date end) {
        return null;
    }

    @Override
    public ArrayList<VisitorDTO> getVisitors(int id) {
        return null;
    }
}
