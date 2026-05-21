/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.CattyCare;

import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public interface IDAOClient {
    boolean tambahClient(ModelComp client);
    List <ModelComp> getAllClient();
    boolean updateClient(ModelComp client);
    boolean deleteClient(int id);
}
