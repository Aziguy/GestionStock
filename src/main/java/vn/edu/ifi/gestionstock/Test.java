/**
 * 
 */
package vn.edu.ifi.gestionstock;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import vn.edu.ifi.gestionstock.dao.impl.FlickrDaoImpl;

/**
 * @author KENGNI Hippolyte
 *
 */

public class Test {

	public static void main(String[] args) {
		FlickrDaoImpl flickr = new FlickrDaoImpl();
		//flickr.auth();
		
		try {
			InputStream stream = new FileInputStream(new File("E:\\Formations J2EE\\WorkSpaceSTS\\GestionStock\\datas\\Tokyo.jpg"));
			String url = flickr.savePhoto(stream, "myImage");
			System.out.println(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
