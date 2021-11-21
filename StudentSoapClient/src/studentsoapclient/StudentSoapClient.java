/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsoapclient;
import services.Student;

/**
 *
 * @author AN515-43
 */
public class StudentSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student std = findStudentbyId(1);
      System.out.println(std.getName());
    }
    
    private static Student findStudentbyId(int id) {
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentById(id);
    }
}
