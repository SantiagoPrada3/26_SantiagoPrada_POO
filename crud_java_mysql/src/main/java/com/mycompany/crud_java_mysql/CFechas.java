/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crud_java_mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
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
public class CFechas {

    int Codigo;
    String nombreCelebracion;
    Date Fecha;
    String Tipo;
    String Responsable;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreCelebracion() {
        return nombreCelebracion;
    }

    public void setNombreCelebracion(String nombreCelebracion) {
        this.nombreCelebracion = nombreCelebracion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    
    public void InsertarFecha(JTextField paramNombreCelebracion, JTextField paramFecha, JTextField paramTipo, JTextField paramResponsable) {
        String nombreCelebracion = paramNombreCelebracion.getText();
        String fechaStr = paramFecha.getText();
        String tipo = paramTipo.getText();
        String responsable = paramResponsable.getText();

        // Convertir la cadena de fecha a un objeto java.sql.Date
        Date fecha = convertirStringADate(fechaStr);

        if (fecha != null) {
            CConexion objetoConexion = new CConexion();
            String consulta = "INSERT INTO fechas_civicas (nombre_celebracion, fecha, tipo, Responsable) VALUES (?, ?, ?, ?)";

            try (Connection conexion = objetoConexion.estableceConexion();
                 CallableStatement cs = conexion.prepareCall(consulta)) {

                cs.setString(1, nombreCelebracion);
                cs.setDate(2, fecha);
                cs.setString(3, tipo);
                cs.setString(4, responsable);
                cs.execute();

                JOptionPane.showMessageDialog(null, "Se insertó correctamente la fecha");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se insertó correctamente la fecha: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Utiliza dd-MM-YYYY.");
        }
    }
    // Método para convertir una cadena de fecha a un objeto java.sql.Date
    private Date convertirStringADate(String fechaStr) {
    try {
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");  // Ajustado al formato "dd-MM-YYYY"
        java.util.Date fechaUtil = formatoFecha.parse(fechaStr);
        return new Date(fechaUtil.getTime());
    } catch (ParseException ex) {
        Logger.getLogger(CFechas.class.getName()).log(Level.SEVERE, null, ex);
        return null; // Manejar el error según tus necesidades
    }
    }
    public void MostrarFechas(JTable paramTablaTotalFechas){
        
        CConexion objetoConexion = new CConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paramTablaTotalFechas.setRowSorter(OrdenarTabla);
        
        String sql="";
        
        modelo.addColumn("Id");
        modelo.addColumn("nombreCelebracion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Tipo");
        modelo.addColumn("Responsable");
        
        paramTablaTotalFechas.setModel(modelo);
        
        sql ="select * from fechas_civicas;";
        
        String[] datos = new String[5]; 
        Statement st;
        
        try {
            st= objetoConexion.estableceConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                
                modelo.addRow(datos);
                
            }
            paramTablaTotalFechas.setModel(modelo);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, erro: "+e.toString());
        }
        
        
        }
    
    public void SeleccionarFecha(JTable paramTablaFecha, JTextField paramId ,JTextField paramNombreCelebracion, JTextField paramFecha, JTextField paramTipo, JTextField paramResponsable){
        
        try {
            int fila = paramTablaFecha.getSelectedRow();
            
            if(fila >=0) {
                
                paramId.setText((paramTablaFecha.getValueAt(fila, 0).toString()));
                paramNombreCelebracion.setText((paramTablaFecha.getValueAt(fila, 1).toString()));
                paramFecha.setText((paramTablaFecha.getValueAt(fila, 2).toString()));
                paramTipo.setText((paramTablaFecha.getValueAt(fila, 3).toString()));
                paramResponsable.setText((paramTablaFecha.getValueAt(fila, 4).toString()));
            }
            
            else 
            {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            
                JOptionPane.showMessageDialog(null, "Error de seleccion, error" + e.toString());
            
        }
    }
    
    public void ModificarFecha(JTextField paramCodigo, JTextField paramNombreCelebracion, JTextField paramFecha, JTextField paramTipo, JTextField paramResponsable) {
        try {
            setCodigo(Integer.parseInt(paramCodigo.getText()));
            setNombreCelebracion(paramNombreCelebracion.getText());

            // Convertir la cadena de fecha a un objeto java.sql.Date
            Date fecha = convertirStringADate(paramFecha.getText());
            setFecha(fecha);

            setTipo(paramTipo.getText());
            setResponsable(paramResponsable.getText());

            CConexion objeConexion = new CConexion();

            String consulta = "UPDATE fechas_civicas SET nombre_celebracion = ?, fecha = ?, tipo = ?, Responsable = ? WHERE id = ?";

            try (CallableStatement cs = objeConexion.estableceConexion().prepareCall(consulta)) {
                cs.setString(1, getNombreCelebracion());
                cs.setDate(2, getFecha());
                cs.setString(3, getTipo());
                cs.setString(4, getResponsable());
                cs.setInt(5, getCodigo());

                cs.executeUpdate();

                JOptionPane.showMessageDialog(null, "Modificación exitosa");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se modificó, error: " + e.toString());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al convertir la fecha: " + e.toString());
        }
    }
    
    public void EliminarFecha(JTextField paramCodigo) {
    try {
        setCodigo(Integer.parseInt(paramCodigo.getText()));

        CConexion objeConexion = new CConexion();

        String consulta = "DELETE FROM fechas_civicas WHERE id = ?";

        try (CallableStatement cs = objeConexion.estableceConexion().prepareCall(consulta)) {
            cs.setInt(1, getCodigo());

            cs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Eliminación exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se eliminó, error: " + e.toString());
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener el código: " + ex.toString());
    }
}
}