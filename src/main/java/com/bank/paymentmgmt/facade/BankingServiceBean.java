/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.paymentmgmt.facade;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author 33685
 */
@Stateless
@WebService(
endpointInterface = "com.bank.paymentmgmt.facade.BankingServiceEndpointInterface",
portName = "BankingPort", 
serviceName = "BankingService"
)
public class BankingServiceBean {
    //@Override
    public Boolean createPayment(String ccNumber, Double amount) {
        //throw new UnsupportedOperationException("Not supported yet.");
        if(ccNumber.length()== 10 ){   
            System.out.println("Montant payé : "+amount +" €");
            return true;
        } else {
	     return false;
	}
    }
}
