/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ticketbuyingsystem;

import javax.swing.JOptionPane;
 
public class StandardTrain extends Train implements IInfo{
 
    @Override
    public double CalculatePrice() {
        return 15;
    }

    @Override
    public void info() {
        JOptionPane.showMessageDialog(null, "Standard train has standard seats");
    }
    
}
