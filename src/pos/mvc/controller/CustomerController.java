/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import pos.mvc.db.DBConnection;
import pos.mvc.model.CustomerModel;

/**
 *
 * @author UDARA DHANUSHKA
 */
public class CustomerController {
    
    public String saveCustomer(CustomerModel customer)throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        
        String query = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)";
                
        PreparedStatement preparedstatement = connection.prepareStatement(query);
    }
    
}
