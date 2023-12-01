/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    private int identificador;
    private String nombres;
    private String DNI;
    private String edad;
    private String direccion;
    private String celular;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }


    
    public void InsertarPersona(JTextField paramNombres, JTextField paramDNI, JTextField paramEdad, JTextField paramDireccion, JTextField paramCelular) {
        String nombres = paramNombres.getText();
        String dni = paramDNI.getText();
        String edad = paramEdad.getText();
        String direccion = paramDireccion.getText();
        String celular = paramCelular.getText();

        Conexion objetoConexion = new Conexion();
        String consulta = "INSERT INTO persona (nombres, DNI, edad, direccion, celular) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = objetoConexion.estableceConexion();
             PreparedStatement ps = conexion.prepareStatement(consulta)) {

            ps.setString(1, nombres);
            ps.setString(2, dni);
            ps.setString(3, edad);
            ps.setString(4, direccion);
            ps.setString(5, celular);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente la persona");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se insertó correctamente la persona: " + e.toString());
        }
    }

    public void MostrarPersonas(JTable paramTablaPersonas) {
        Conexion objetoConexion = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();

        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaPersonas.setRowSorter(OrdenarTabla);

        String sql = "SELECT * FROM persona";
        String[] datos = new String[6]; // Modificar el tamaño si es necesario
        Statement st;

        modelo.addColumn("Identificador");
        modelo.addColumn("Nombres");
        modelo.addColumn("DNI");
        modelo.addColumn("Edad");
        modelo.addColumn("Dirección");
        modelo.addColumn("Celular");

        paramTablaPersonas.setModel(modelo);

        try {
            st = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);

                modelo.addRow(datos);
            }

            paramTablaPersonas.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
        }
    }
    public void SeleccionarPersona(JTable paramTablaPersona, JTextField paramId, JTextField paramNombres, JTextField paramDNI, JTextField paramEdad, JTextField paramDireccion, JTextField paramCelular) {
    try {
        int fila = paramTablaPersona.getSelectedRow();
        
        if (fila >= 0) {
            paramId.setText((paramTablaPersona.getValueAt(fila, 0).toString()));
            paramNombres.setText((paramTablaPersona.getValueAt(fila, 1).toString()));
            paramDNI.setText((paramTablaPersona.getValueAt(fila, 2).toString()));
            paramEdad.setText((paramTablaPersona.getValueAt(fila, 3).toString()));
            paramDireccion.setText((paramTablaPersona.getValueAt(fila, 4).toString()));
            paramCelular.setText((paramTablaPersona.getValueAt(fila, 5).toString()));
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al seleccionar, error" + e.toString());
    }
}

    
    public void ModificarPersona(JTextField paramIdentificador, JTextField paramNombres, JTextField paramDNI, JTextField paramEdad, JTextField paramDireccion, JTextField paramCelular) {
    try {
        int identificador = Integer.parseInt(paramIdentificador.getText());
        String nombres = paramNombres.getText();
        String dni = paramDNI.getText();
        String edad = paramEdad.getText();
        String direccion = paramDireccion.getText();
        String celular = paramCelular.getText();

        Conexion objeConexion = new Conexion();

        String consulta = "UPDATE persona SET nombres = ?, DNI = ?, edad = ?, direccion = ?, celular = ? WHERE identificador = ?";

        try (PreparedStatement ps = objeConexion.estableceConexion().prepareStatement(consulta)) {
            ps.setString(1, nombres);
            ps.setString(2, dni);
            ps.setString(3, edad);
            ps.setString(4, direccion);
            ps.setString(5, celular);
            ps.setInt(6, identificador);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modificación exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se modificó, error: " + e.toString());
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener el identificador: " + ex.toString());
    }
}

public void EliminarPersona(JTextField paramIdentificador) {
    try {
        int identificador = Integer.parseInt(paramIdentificador.getText());

        Conexion objeConexion = new Conexion();

        String consulta = "DELETE FROM persona WHERE identificador = ?";

        try (PreparedStatement ps = objeConexion.estableceConexion().prepareStatement(consulta)) {
            ps.setInt(1, identificador);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Eliminación exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se eliminó, error: " + e.toString());
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener el identificador: " + ex.toString());
    }
}
}