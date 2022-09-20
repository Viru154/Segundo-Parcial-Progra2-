
package modelo;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Estudiante extends Persona{
    private int id;
    private String carnet, genero, email;
    
    Conexion cn;

    public Estudiante(){}
    public Estudiante(int id,String carnet, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento,String genero, String email ) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.carnet = carnet;
        this.id = id;
    }
public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String nit) {
        this.carnet = nit;
    }
  public DefaultTableModel leer(){
  DefaultTableModel tabla = new DefaultTableModel();
  try{
   cn = new Conexion();
   cn.abrir_conexion();
    String query;
    query = "Select id_Estudiante as id,carnet,nombres,apellidos,direccion,telefono, genero, email, fecha_nacimiento from Estudiante;";
     ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
      
      String encabezado[] = {"id","carnet","Nombres","Apellidos","Direccion","Telefono","Nacimiento"};
      tabla.setColumnIdentifiers(encabezado);
      
      String datos[]=new String[7];
      
   while(consulta.next()){
      datos[0] = consulta.getString("id");
      datos[1] = consulta.getString("carnet");
      datos[2] = consulta.getString("nombres");
      datos[3] = consulta.getString("apellidos");
      datos[4] = consulta.getString("direccion");
      datos[5] = consulta.getString("telefono");
      datos[6] = consulta.getString("genero");
      datos[7] = consulta.getString("email");
      datos[8] = consulta.getString("fecha_nacimiento");
      tabla.addRow(datos);
      }
   cn.cerrar_conexion();
    
      
  }catch(SQLException ex){
      cn.cerrar_conexion();
      System.out.println("Error: " + ex.getMessage() );
  
  }
  return tabla;
  }
    @Override
   public void agregar(){
     try{
         PreparedStatement parametro;
         cn = new Conexion();
         cn.abrir_conexion();
         String query;
            query = "insert into Estudiante(carnet,nombres,apellidos,direccion,telefono,genero, email,fecha_nacimiento) "+
                 "values(?,?,?,?,?,?);";
         parametro  = (PreparedStatement) cn.conexionBD.prepareStatement(query);
         parametro.setString(1, getCarnet());
         parametro.setString(2, getNombres());
         parametro.setString(3, getApellidos());
         parametro.setString(4, getDireccion());
         parametro.setString(5, getTelefono());
         parametro.setString(6, getGenero());
         parametro.setString(7, getEmail());
         parametro.setString(8, getFecha_nacimiento());
         
         int executar= parametro.executeUpdate();
         cn.cerrar_conexion();
        JOptionPane.showMessageDialog(null,Integer.toString(executar) + " Registro Ingresado",
             "Mensaje",JOptionPane.INFORMATION_MESSAGE);
     }catch(HeadlessException | SQLException ex){
         System.out.println("Error"+ex.getMessage());
     }
   }
   
   @Override
   public void actualizar(){
         try{
         PreparedStatement parametro;
         cn = new Conexion();
         cn.abrir_conexion();
         String query;
        query = "update clientes set nit = ?,nombres= ?,apellidos= ?,direccion= ?,telefono= ?,fecha_nacimiento= ? "+
                 "where id_cliente = ?";
         parametro  = (PreparedStatement) cn.conexionBD.prepareStatement(query);
         parametro.setString(1, getCarnet());
         parametro.setString(2, getNombres());
         parametro.setString(3, getApellidos());
         parametro.setString(4, getDireccion());
         parametro.setString(5, getTelefono());
         parametro.setString(6, getGenero ());
         parametro.setString(7, getEmail());
         parametro.setString(8, getFecha_nacimiento());
         parametro.setInt(9, getId());
         
         int executar= parametro.executeUpdate();
         cn.cerrar_conexion();
        JOptionPane.showMessageDialog(null,Integer.toString(executar) + " Registro Actualizado",
             "Mensaje",JOptionPane.INFORMATION_MESSAGE);
     }catch(HeadlessException | SQLException ex){
         System.out.println("Error"+ex.getMessage());
     }
   
   }
   @Override
   public void eliminar(){
   
    try{
         PreparedStatement parametro;
         cn = new Conexion();
         cn.abrir_conexion();
         String query;
        query = "delete from clientes where id_cliente = ?";
                 
         parametro  = (PreparedStatement) cn.conexionBD.prepareStatement(query);
         parametro.setInt(1, getId());
         
         int executar= parametro.executeUpdate();
         cn.cerrar_conexion();
        JOptionPane.showMessageDialog(null,Integer.toString(executar) + " Registro Eliminado",
             "Mensaje",JOptionPane.INFORMATION_MESSAGE);
     }catch(HeadlessException | SQLException ex){
         System.out.println("Error"+ex.getMessage());
     }
   
   }

    private String getGenero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
