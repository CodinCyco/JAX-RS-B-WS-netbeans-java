/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientcalculette;

import com.codincyco.CalculetteWS;
import com.codincyco.CalculetteWS_Service;

/**
 *
 * @author saifeddine
 */
public class ClientCalculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculetteWS_Service service = new CalculetteWS_Service();
        CalculetteWS port = service.getCalculetteWSPort();
        System.out.println(port.hello("saifeddine"));
        System.out.println(port.plus(5, 7));
    }
    
}
