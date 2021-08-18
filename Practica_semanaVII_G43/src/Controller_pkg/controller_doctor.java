/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_pkg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import model_pkg.DataDB;
import model_pkg.DataModelDB;
import view_pkg.DialogDoctors;

/**
 *
 * @author LORENA FAJARDO
 */
public class controller_doctor implements ActionListener {
   
    private final DialogDoctors view;

    public final void events() {
        view.cb_hospital.addActionListener(this);

    }

    public controller_doctor(DialogDoctors view) {
        this.view = view;
        getHospital();
        Item item = (Item) view.cb_hospital.getSelectedItem();
        events();
        
    }

    public final void getHospital() {
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getHospital(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idhospital = list.get(i).getIdhospital();
                String hospital = list.get(i).getHospital();
                view.cb_hospital.addItem(new Item(idhospital, hospital));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro registros de hospitales ",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        }

}


    

