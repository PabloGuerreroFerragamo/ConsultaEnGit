/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import articulos.articulos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ssaid
 */
public class metodos {
    
    Vector vPrincipal = new Vector();
    //Guardar los datos en el vector
    public void guardar(articulos unArticulos) {
        vPrincipal.addElement(unArticulos);
        
    }
    
    //Guardar en un archivo txt
    public void guardarArchivo(articulos articulo){
        try {
            FileWriter fw = new FileWriter("c:\\consulta.txt",true) ;
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(articulo.getId());
            pw.print(","+articulo.getNombre());
            pw.print(","+articulo.getMax());
            pw.print(","+articulo.getMin());
            pw.print(","+articulo.getStock());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //Mostrar los datos en el jtable
    public DefaultTableModel listaArticulos(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("ID del artículo");
         cabeceras.addElement("Nombre del artículo");
         cabeceras.addElement("Cantidad máxima");
         cabeceras.addElement("Cantidad mínima");
         cabeceras.addElement("Stock");
         //Vector que contenga todos los atributos de nuestra tabla (ID, nombre,etc.)
         //Creamos un modelo de tabla para agregar el vector en la ubicación 0
         DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
         
         try {
            FileReader fr = new FileReader("c:\\consulta.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,",");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         return mdlTabla;
    }
    
    
   
        
    }

