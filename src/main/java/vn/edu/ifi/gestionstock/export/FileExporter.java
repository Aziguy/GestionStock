package vn.edu.ifi.gestionstock.export;

import javax.servlet.http.HttpServletResponse;

public interface FileExporter {
	
	boolean exportDataToExcel(HttpServletResponse response, String fileName, String encodage);
	
	boolean importDataFromExcel();

}
