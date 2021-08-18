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
import model_pkg.ReportClass;
import view_pkg.DialogDoctors;
import view_pkg.DialogPets;

/**
 *
 * @author LORENA FAJARDO
 */
public class controller implements ActionListener {

    private final DialogPets view;

    public final void events() {
        view.cb_owners.addActionListener(this);

    }

    public controller(DialogPets view) {
        this.view = view;
        getOwners();
        Item item = (Item) view.cb_owners.getSelectedItem();
        events();
        
    }

    public final void getOwners() {
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getOwners(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idOwner = list.get(i).getIdOwner();
                String owner = list.get(i).getOwner();
                view.cb_owners.addItem(new Item(idOwner, owner));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clientes",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

}


