package controller;

import access.DeMotorDAO;
import java.util.ArrayList;
import modelo.MotorModel;

public class InitialData {
    private ArrayList<MotorModel>     motores = null;

    public ArrayList<MotorModel> getMotores() {
        return motores;
    }

    public void setMotores(ArrayList<MotorModel> motores) {
        this.motores = motores;
    }
    
    
    public InitialData(){
        DeMotorDAO deMotorDAO = new DeMotorDAO ();
        this.motores = deMotorDAO.getDeMotor();
    }
}
