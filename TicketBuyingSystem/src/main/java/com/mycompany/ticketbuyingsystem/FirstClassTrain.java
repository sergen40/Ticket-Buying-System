/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ticketbuyingsystem;

import javax.swing.JOptionPane;
 
public class FirstClassTrain extends Train implements IInfo{

     
    @Override
    public double CalculatePrice() {
        return 20;
    }
    
    public void giveGift(){
        Gift gift = new Gift();
        gift.give();
    }

    @Override
    public void info() {
        JOptionPane.showMessageDialog(null, "First class train has first class seats");
    }
    
}
