/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.arezner.mavensoapws;

import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author ati
 */
@WebService(serviceName = "ReziWebService_V1")
@Stateless()
public class ReziWebService_V1 {

    private static final Logger LOG = Logger.getLogger(ReziWebService_V1.class.getName());
    
    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param parameter1
     * @param parameter2
     * @return 
     */
    @WebMethod(operationName = "addOperation")
    public int addOperation(@WebParam(name = "parameter1") int parameter1, @WebParam(name = "parameter2") int parameter2) {
        //TODO write your implementation code here:
        return parameter1 +parameter2;
    }    
    
}
