
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentWebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentWebService {


    /**
     * 
     * @param id
     * @return
     *     returns services.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findStudentById", targetNamespace = "http://services/", className = "services.FindStudentById")
    @ResponseWrapper(localName = "findStudentByIdResponse", targetNamespace = "http://services/", className = "services.FindStudentByIdResponse")
    @Action(input = "http://services/StudentWebService/findStudentByIdRequest", output = "http://services/StudentWebService/findStudentByIdResponse")
    public Student findStudentById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
