/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CattyCare;

import Model.Connector;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Lab Informatika
 */
public class DAOClient implements IDAOClient{

    @Override
    public boolean tambahClient(ModelComp client) {
        String sql = "INSERT INTO penitipan(nama_pemilik, nama_kucing, nomor_telepon, lama_penitipan)" + "VALUES(?, ?. ?. ?)";
        try (Connection conn = Connector.Connect(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, client.getNama_pemilik());
            ps.setString(2, client.getNama_kucing());
            ps.setString(3, client.getNomor_telpon());
            ps.setInt(4, client.getLama_penitipan());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error");
            return false;
        }
    }

    @Override
    public List<ModelComp> getAllClient() {
        List<ModelComp> list = new ArrayList<>();
        String sql = "SELECT * FROM penitipan";
        
        try (Connection conn = Connector.Connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                ModelComp client = new ModelComp();
                client.setId(rs.getInt("id"));
                client.setNama_pemilik(rs.getString("nama_pemilik"));
                client.setNama_kucing(rs.getString("nama_kucing"));
                client.setNomor_telpon(rs.getString("nomor_telepon"));
                client.setLama_penitipan(rs.getInt("lama_penitipan"));
                list.add(client);
            }
        } catch (SQLException e) {
            System.out.println("Error");
        }
        
        return list;
    }

    @Override
    public boolean updateClient(ModelComp client) {
       String sql = "UPDATE penitipan SET nama_pemilik=?, nama_kucing=?, nomot_telepon=?, lama_penitipan=? WHERE id=?";
        try (Connection conn = Connector.Connect(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, client.getNama_pemilik());
            ps.setString(2, client.getNama_kucing());
            ps.setString(3, client.getNomor_telpon());
            ps.setInt(4, client.getLama_penitipan());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error");
            return false;
        }
    }

    @Override
    public boolean deleteClient(int id) {
        String sql = "DELETE FROM penitipan WHERE id=?";
        try (Connection conn = Connector.Connect(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error");
            return false;
        }
    }
    
}
