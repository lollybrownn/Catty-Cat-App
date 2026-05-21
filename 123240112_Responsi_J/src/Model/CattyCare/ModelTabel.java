 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CattyCare;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab Informatika
 */
public class ModelTabel extends DefaultTableModel{
    public ModelTabel(Object[] columns, int rowCount){
        super(columns, rowCount);
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
}
