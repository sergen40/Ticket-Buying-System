/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ticketbuyingsystem;

import javax.swing.JOptionPane;
 
public class EconomyTrain extends Train implements IInfo{

     

    @Override
    public double CalculatePrice() {
        return 10;
    }

    @Override
    public void info() {
        JOptionPane.showMessageDialog(null, "Economy train has economy seats");
    }
    
}
