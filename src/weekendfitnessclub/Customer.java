/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendfitnessclub;

/**
 *
 * @author Darshan
 */
public class Customer {

    private int cId;
    private String cusName;

    public Customer(int cId, String cusName) {
        this.cId = cId;
        this.cusName = cusName;
    }

    public int getcId() {
        return cId;
    }

    public String getCusName() {
        return cusName;
    }
}
