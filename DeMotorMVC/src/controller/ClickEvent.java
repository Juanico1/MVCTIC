package controller;

import access.DeMotorDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.MotorModel;
import view.ControlsPanel;

public class ClickEvent implements ActionListener {
    
    private ControlsPanel controlsPanel;

    public ClickEvent(ControlsPanel controlsPanel) {
        this.controlsPanel = controlsPanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //Insertbutton
        if(actionEvent.getSource() == this.controlsPanel.getBtnInsertarBarco()) {
            DeMotorDAO deMotorDAO = new DeMotorDAO();
            String registro  = (String)this.controlsPanel.getInputRegistro().getText();
            String marca  = (String)this.controlsPanel.getInputMarca().getText();
            Integer cantidadMotores  = new Integer(this.controlsPanel.getInputCantidadMotores().getText());
            String propietario  = (String)this.controlsPanel.getInputPropietario().getText();
            Integer autonomiaHoras  = new Integer(this.controlsPanel.getInputAutonomiaHoras().getText());
            MotorModel motor = new MotorModel(registro,marca,cantidadMotores,propietario,autonomiaHoras); 
            deMotorDAO.insertDeMotor(motor);
            this.controlsPanel.setTblResults(deMotorDAO.getDeMotor());
        }
        //Updatebutton
        else if(actionEvent.getSource() == this.controlsPanel.getBtnUpdateBarco()) {
            DeMotorDAO deMotorDAO = new DeMotorDAO();
            String registro  = (String)this.controlsPanel.getInputRegistro().getText();
            String marca  = (String)this.controlsPanel.getInputMarca().getText();
            Integer cantidadMotores  = new Integer(this.controlsPanel.getInputCantidadMotores().getText());
            String propietario  = (String)this.controlsPanel.getInputPropietario().getText();
            Integer autonomiaHoras  = new Integer(this.controlsPanel.getInputAutonomiaHoras().getText());
            MotorModel motor = new MotorModel(registro,marca,cantidadMotores,propietario,autonomiaHoras); 
            deMotorDAO.updateDeMotor(motor);
            this.controlsPanel.setTblResults(deMotorDAO.getDeMotor());
    }   //Deletebutton
        else if(actionEvent.getSource() == this.controlsPanel.getBtnDeleteBarco()) {
            DeMotorDAO deMotorDAO = new DeMotorDAO();
            String registro  = (String)this.controlsPanel.getInputRegistro().getText();
            MotorModel motor = new MotorModel(registro,null,0,null,0); 
            deMotorDAO.deleteDeMotor(motor);
            this.controlsPanel.setTblResults(deMotorDAO.getDeMotor());
    } 
    }
    
}
