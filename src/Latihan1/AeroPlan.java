/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("Aeroplan Flying");
    }
    public static void main(String[] args) {
        AeroPlan ae = new AeroPlan();
        ae.walk();
        ae.fuel();
        ae.function();
    }
    private static final Logger LOG = Logger.getLogger(AeroPlan.class.getName());
    }
