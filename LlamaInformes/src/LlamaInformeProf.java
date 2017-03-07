
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.*; 
import java.util.Scanner;

import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.export.JRPdfExporter;


public class LlamaInformeProf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1- imprimir informaci�n de profesores");
		System.out.println("2- imprimir informe asignaturas");
		

		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		
	//Abro conexion con la BD con el driver
		
		try {
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		    System.out.println("Registro exitoso");

		} catch (Exception e) {
		    System.out.println(e.toString());
		}
		
		Connection con = null;
		try {
		    con = DriverManager.getConnection("jdbc:mysql://localhost/centros","root","");


		    
	//Empieza el trabajo con los informes
		
		contador = teclado.nextInt();
		String ruta = "";
		JRExporter exporter = new JRPdfExporter();
		
	 if (contador ==1){
		 ruta = "inf/Profesores.jasper";
		 File sourceFile = new File(ruta); 
		 JasperReport reporte = (JasperReport) JRLoader.loadObject(sourceFile);
		 
		 JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, con);
		 
		 exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint); 
		 exporter.setParameter(JRExporterParameter.OUTPUT_FILE,new java.io.File("Profesores.pdf"));
		 exporter.exportReport();
		 
		 try {
			 File reportepdf = new File("Profesores.pdf");
			 Desktop.getDesktop().open(reportepdf);
		}catch (IOException ex) {
		     ex.printStackTrace();
		} 
	
	 }
	
		
		
		if (contador ==2){
			 ruta = "inf/Asignaturas.jasper";
			 File sourceFile = new File(ruta); 
			 JasperReport reporte = (JasperReport) JRLoader.loadObject(sourceFile);
			 
			 JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, con);
			 
			 exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint); 
			 exporter.setParameter(JRExporterParameter.OUTPUT_FILE,new java.io.File("Asignaturas.pdf"));
			 exporter.exportReport();
			 
			 try {
				 File reportepdf = new File("Asignaturas.pdf");
				 Desktop.getDesktop().open(reportepdf);
			}catch (IOException ex) {
			     ex.printStackTrace();
			} 
		
		 }
		} catch (SQLException ex) {
		    // Mantener el control sobre el tipo de error
		    System.out.println("SQLException: " + ex.getMessage());
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
	}

}
