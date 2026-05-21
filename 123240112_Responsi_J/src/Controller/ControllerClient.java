/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CattyCare.DAOClient;
import Model.CattyCare.ModelComp;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class ControllerClient {
    private DAOClient daoClient = new DAOClient();
    
    public boolean tambahClient(ModelComp client) {
        return daoClient.tambahClient(client);
    }
    
    public List<ModelComp> getAllClient() {
        return daoClient.getAllClient();
    }
    
    public boolean updateClient(ModelComp client) {
        return daoClient.updateClient(client);
    }
    
    public boolean deleteClient(int id) {
        return daoClient.deleteClient(id);
    }
}
