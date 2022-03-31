/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ticketbuyingsystem;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

 
public class SystemClass {

  
    DefaultTableModel tableModel;
    DefaultTableModel trainTableModel;

    ArrayList<TrainInfo> trainList = new ArrayList<TrainInfo>();
    TrainInfo train1 = new TrainInfo("Ankara", "Istanbul", "10.01.2021", "10:00");
    TrainInfo train2 = new TrainInfo("Istanbul", "Ankara", "10.01.2021", "12:00");
    TrainInfo train3 = new TrainInfo("Ankara", "Bursa", "10.01.2021", "14:00");
    TrainInfo train4 = new TrainInfo("Izmir", "Istanbul", "11.01.2021", "12:00");
    TrainInfo train5 = new TrainInfo("Izmir", "Bursa", "11.01.2021", "14:00");
    TrainInfo train6 = new TrainInfo("Ankara", "Antalya", "11.01.2021", "16:00");
    TrainInfo train7 = new TrainInfo("Ankara", "Izmir", "12.01.2021", "10:00");
    TrainInfo train8 = new TrainInfo("Ankara", "Bursa", "12.01.2021", "14:00");
    TrainInfo train9 = new TrainInfo("Istanbul", "Antalya", "12.01.2021", "16:00");
    TrainInfo train10 = new TrainInfo("Istanbul", "Izmir", "13.01.2021", "10:00");
    TrainInfo train11 = new TrainInfo("Bursa", "Istanbul", "13.01.2021", "12:00");
    TrainInfo train12 = new TrainInfo("Bursa", "Antalya", "13.01.2021", "16:00");
    TrainInfo train13 = new TrainInfo("Izmir", "Ankara", "14.01.2021", "10:00");
    TrainInfo train14 = new TrainInfo("Izmir", "Antalya", "14.01.2021", "12:00");
    TrainInfo train15 = new TrainInfo("Antalya", "Izmir", "14.01.2021", "14:00");
    TrainInfo train16 = new TrainInfo("Antalya", "Bursa", "11.01.2021", "12:00");
    TrainInfo train17 = new TrainInfo("Antalya", "Ankara", "12.01.2021", "14:00");
    TrainInfo train18 = new TrainInfo("Antalya", "Istanbul", "13.01.2021", "16:00");
    TrainInfo train19 = new TrainInfo("Ankara", "Istanbul", "12.01.2021", "12:00");
    TrainInfo train20 = new TrainInfo("Istanbul", "Ankara", "13.01.2021", "14:00");

    public DefaultTableModel Add(String ticketNo, String name, String surname,
            String from, String to, String classResult, String ticketTypeResult, String ageTypeResult,
            String date, String time, String comment, String email, String sms, String price) {
        Object[] obj = {ticketNo, name, surname, from, to, classResult, ticketTypeResult, ageTypeResult,
            date, time, comment, email, sms, price};

        tableModel.addRow(obj);
        return tableModel;
    }

    public void Delete(int activeRow) {
        tableModel.removeRow(activeRow);
    }
    
    public DefaultTableModel Search(TrainInfo searchTrain){
        ArrayList<TrainInfo> newTrainList = new ArrayList<>();

        trainTableModel.setRowCount(0);
        for (TrainInfo item : trainList) {
            if (item.getFrom() == searchTrain.getFrom()
                    && item.getTo() == searchTrain.getTo()
                    && item.getDate() == searchTrain.getDate()
                    && item.getTime() == searchTrain.getTime()) {
                newTrainList.add(item);
                trainList = newTrainList;
            }
        }

        if (newTrainList.size() > 0) {
            String fromResult = newTrainList.get(0).getFrom();
            String toResult = newTrainList.get(0).getTo();
            String dateResult = newTrainList.get(0).getDate();
            String timeResult = newTrainList.get(0).getTime();

            Object[] data = {fromResult, toResult, dateResult, timeResult};
            trainTableModel.addRow(data);
          
          return trainTableModel;
        } else {
            trainTableModel.setRowCount(0);
        return trainTableModel;
            
        }
    }
    
    public ArrayList<TrainInfo> getTrainList(){
        trainList = new ArrayList<>();
        trainList.add(train1);
        trainList.add(train2);
        trainList.add(train3);
        trainList.add(train4);
        trainList.add(train5);
        trainList.add(train6);
        trainList.add(train7);
        trainList.add(train8);
        trainList.add(train9);
        trainList.add(train10);
        trainList.add(train11);
        trainList.add(train12);
        trainList.add(train13);
        trainList.add(train14);
        trainList.add(train15);
        trainList.add(train16);
        trainList.add(train17);
        trainList.add(train18);
        trainList.add(train19);
        trainList.add(train20);
        
        return trainList;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public DefaultTableModel getTrainTableModel() {
        return trainTableModel;
    }

    public void setTrainTableModel(DefaultTableModel trainTableModel) {
        this.trainTableModel = trainTableModel;
    }

}
