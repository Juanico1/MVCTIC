package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.MotorModel;
import utils.ConnectionDB;


public class DeMotorDAO {
    public Connection conn;
    //Insert
    public void insertDeMotor(MotorModel motor){
        if (conn == null)
            conn = ConnectionDB.getConnection();
        
        String sql = " INSERT INTO de_motor(registro,marca,cantidad_motores,propietario,autonomia_horas)"+
                     "VALUES (?,?,?,?,?)";
        PreparedStatement statement = null;
        try{
            statement = conn.prepareStatement(sql);
            statement.setString(1,motor.getRegistro());
            statement.setString(2,motor.getMarca());
            statement.setInt(3,motor.getCantidadMotores());
            statement.setString(4,motor.getPropietario());
            statement.setInt(5,motor.getAutonomiaHoras()); 
            
            int rowsInserted = statement . executeUpdate();
            if ( rowsInserted > 0) {
        System.out.println (" Insercíon exitosa !");
        }
       }catch(Exception e){
           System.out.println (" Insercíon no exitosa !"+e);
       } 
}
    //update
    public void updateDeMotor(MotorModel motor){
        try{
        if(conn == null)
           conn = ConnectionDB.getConnection();
            
        String sql = "UPDATE de_motor SET cantidad_motores =?, autonomia_horas=? WHERE registro=?;";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1,motor.getCantidadMotores());
        statement.setInt(2,motor.getAutonomiaHoras());
        statement.setString(3,motor.getRegistro());
            
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0)
            System.out.println("El registro fue actualizado exitosamente !");
        } catch(SQLException ex){
            System.out.println("Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    }
     //delete
    public void deleteDeMotor(MotorModel motor) {
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM de_motor WHERE registro=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,motor.getRegistro());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("El registro fue borrado exitosamente !");
            }
        } catch (SQLException ex) {
            System.out.println("Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
    
    //select
    public ArrayList<MotorModel> getDeMotor() {
        ArrayList<MotorModel> motores = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT registro,marca,cantidad_motores,propietario,autonomia_horas FROM de_motor;";
            java.sql.Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while (result.next()) {
                MotorModel motor = new MotorModel(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getInt(5));
                motores.add(motor);
            }
        } 
        catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return motores;
    
}
}

