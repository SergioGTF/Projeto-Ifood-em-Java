/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.telaprincipal;

import com.mycompany.dao.UsuarioDAO;

/**
 *
 * @author sergi
 */
public class TelaPrincipal {

    public static void main(String[] args) {
        new InterfaceTelaPrincipal().setVisible(true);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        System.out.println("Listando usuários do banco de dados:");
        usuarioDAO.listarUsuarios();
    }
}
