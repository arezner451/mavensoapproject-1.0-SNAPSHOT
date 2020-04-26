/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.arezner.mavensoapws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author ati
 */
@WebService(serviceName = "reziWebService_V1")
@Stateless()
public class reziWebService_V1 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addOperation")
    public int addOperation(@WebParam(name = "parameter1") int parameter1, @WebParam(name = "parameter2") int parameter2) {
        //TODO write your implementation code here:
        return parameter1 +parameter2;
    }
    
}
