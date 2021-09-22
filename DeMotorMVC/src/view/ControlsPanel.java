package view;

import controller.ClickEvent;
import controller.InitialData;
import java.awt.GridLayout;
import java.util.ArrayList; 
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.MotorModel;

public class ControlsPanel extends JPanel {
    
    private JTable                       tblResults;
    private JLabel                       labelRegistro;
    private JLabel                       labelMarca;
    private JLabel                       labelCantidadMotores;
    private JLabel                       labelPropietario;
    private JLabel                       labelAutonomiaHoras;
    private JTextField                   inputRegistro;
    private JTextField                   inputMarca;
    private JTextField                   inputCantidadMotores;
    private JTextField                   inputPropietario;
    private JTextField                   inputAutonomiaHoras;
    //insert
    private JButton                      btnInsertarBarco;
    //update
    private JButton                      btnUpdateBarco;
    //delete
    private JButton                      btnDeleteBarco;

    public ControlsPanel(ResultsPanel resultsPanel){
        this.tblResults = resultsPanel.getTblResults();
        initComponents();
    }
    
    private void initComponents(){
        setLayout(new GridLayout(4,1));
        InitialData initialData = new InitialData();
        
        this.setTblResults(initialData.getMotores());
        
        // Registro
        this.labelRegistro = new JLabel("Ingrese el código de registro: ");
        add(labelRegistro);
        this.inputRegistro = new JTextField();
        add(inputRegistro);
        // Marca
        this.labelMarca = new JLabel("Ingrese la marca: ");
        add(labelMarca);
        this.inputMarca = new JTextField();
        add(inputMarca);
        // Cantidad Motores
        this.labelCantidadMotores = new JLabel("Ingrese la cantidad de motores: ");
        add(labelCantidadMotores);
        this.inputCantidadMotores = new JTextField();
        add(inputCantidadMotores);
        // Propietario
        this.labelPropietario = new JLabel("Ingrese el propietario: ");
        add(labelPropietario);
        this.inputPropietario = new JTextField();
        add(inputPropietario);
        // Autonomia Horas
        this.labelAutonomiaHoras = new JLabel("Ingrese las horas de autonomia: ");
        add(labelAutonomiaHoras);
        this.inputAutonomiaHoras = new JTextField();
        add(inputAutonomiaHoras);
        
        ClickEvent clickEvent = new ClickEvent(this);
        //Insertbutton
        this.btnInsertarBarco = new JButton("Insertar Barco");
        add(this.btnInsertarBarco);
        this.btnInsertarBarco.addActionListener(clickEvent);
        
        //Updatebutton
        this.btnUpdateBarco = new JButton("Actualizar Barco");
        add(this.btnUpdateBarco);
        this.btnUpdateBarco.addActionListener(clickEvent);
        
        //Deletebutton
        this.btnDeleteBarco = new JButton("Eliminar Barco");
        add(this.btnDeleteBarco);
        this.btnDeleteBarco.addActionListener(clickEvent);
    }
        public void setTblResults(ArrayList<MotorModel> motores) {
        String[] headers = {"Registro", "Marca", "Cantidad de Motores", "Propietario", "Horas de Autonomía"};
        this.tblResults.removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers); 
        this.tblResults.setModel(tableModel); 
        for(int i=0; i<motores.size(); i++){
            tableModel.addRow(motores.get(i).toArray() );
        }
    }

    public JTable getTblResults() {
        return tblResults;
    }

    public void setTblResults(JTable tblResults) {
        this.tblResults = tblResults;
    }

    public JLabel getLabelRegistro() {
        return labelRegistro;
    }

    public void setLabelRegistro(JLabel labelRegistro) {
        this.labelRegistro = labelRegistro;
    }

    public JLabel getLabelMarca() {
        return labelMarca;
    }

    public void setLabelMarca(JLabel labelMarca) {
        this.labelMarca = labelMarca;
    }

    public JLabel getLabelCantidadMotores() {
        return labelCantidadMotores;
    }

    public void setLabelCantidadMotores(JLabel labelCantidadMotores) {
        this.labelCantidadMotores = labelCantidadMotores;
    }

    public JLabel getLabelPropietario() {
        return labelPropietario;
    }

    public void setLabelPropietario(JLabel labelPropietario) {
        this.labelPropietario = labelPropietario;
    }

    public JLabel getLabelAutonomiaHoras() {
        return labelAutonomiaHoras;
    }

    public void setLabelAutonomiaHoras(JLabel labelAutonomiaHoras) {
        this.labelAutonomiaHoras = labelAutonomiaHoras;
    }

    public JTextField getInputRegistro() {
        return inputRegistro;
    }

    public void setInputRegistro(JTextField inputRegistro) {
        this.inputRegistro = inputRegistro;
    }

    public JTextField getInputMarca() {
        return inputMarca;
    }

    public void setInputMarca(JTextField inputMarca) {
        this.inputMarca = inputMarca;
    }

    public JTextField getInputCantidadMotores() {
        return inputCantidadMotores;
    }

    public void setInputCantidadMotores(JTextField inputCantidadMotores) {
        this.inputCantidadMotores = inputCantidadMotores;
    }

    public JTextField getInputPropietario() {
        return inputPropietario;
    }

    public void setInputPropietario(JTextField inputPropietario) {
        this.inputPropietario = inputPropietario;
    }

    public JTextField getInputAutonomiaHoras() {
        return inputAutonomiaHoras;
    }

    public void setInputAutonomiaHoras(JTextField inputAutonomiaHoras) {
        this.inputAutonomiaHoras = inputAutonomiaHoras;
    }

    public JButton getBtnInsertarBarco() {
        return btnInsertarBarco;
    }

    public void setBtnInsertarBarco(JButton btnInsertarBarco) {
        this.btnInsertarBarco = btnInsertarBarco;
    }

    public JButton getBtnUpdateBarco() {
        return btnUpdateBarco;
    }

    public void setBtnUpdateBarco(JButton btnUpdateBarco) {
        this.btnUpdateBarco = btnUpdateBarco;
    }

    public JButton getBtnDeleteBarco() {
        return btnDeleteBarco;
    }

    public void setBtnDeleteBarco(JButton btnDeleteBarco) {
        this.btnDeleteBarco = btnDeleteBarco;
    }
    
}
