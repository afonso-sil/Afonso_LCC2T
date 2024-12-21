package projecto.controllers;

import projecto.models.Cliente;
import projecto.models.Usuario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;

public class UsuarioController {
    public static ArrayList<Usuario> usuarioList;

    public UsuarioController(){
        usuarioList = new ArrayList<>();

    }

    public void criarUsuario(String nome_completo, String email, String senha ){
        int id = usuarioList.size() + 1;
        Usuario usuario = new Usuario(id, nome_completo, email, senha );
        usuarioList.add(usuario);
        JOptionPane.showMessageDialog(new JFrame(), "Dados salvo com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
    }

    public void buscarTodasUsuarios(DefaultTableModel model){
        if(usuarioList.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Nenhum resultado encontrado", "Dialog", JOptionPane.ERROR_MESSAGE);
        }else{
            for(Usuario usuario: usuarioList){
                Object[] row = {
                        usuario.getId(),
                        usuario.getNome_completo(),
                        usuario.getEmail(),
                        usuario.getSenha()
                };
                model.addRow(row);
            }
        }
    }

    public void actualizarUsuario(int id, String nome_completo, String email, String senha){
        for(Usuario usuario: usuarioList){
            if(usuario.getId() == id){
                usuario.setNome_completo(nome_completo);
                usuario.setEmail(email);
                usuario.setSenha(senha);
                JOptionPane.showMessageDialog(new JFrame(), "Dados actualizados com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(new JFrame(), "Não foi possivel actualizar dados", "Dialog", JOptionPane.ERROR_MESSAGE);
    }

    public void deletaUsuario(int id){
        for (Usuario usuario: usuarioList){
            if(usuario.getId()==id){
                usuarioList.remove(usuario);
                JOptionPane.showMessageDialog(new JFrame(), "Dados eliminado com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

    }

    public void pesquisaUsuario(String n, DefaultTableModel model){
        for(Usuario usuario: usuarioList){
            if(Objects.equals(usuario.getNome_completo(), n)){
                Object[] row = {
                        usuario.getNome_completo(),
                        usuario.getEmail(),
                        usuario.getSenha()
                };
                model.addRow(row);
            }else{
                System.out.println("erro");
            }
        }
    }


}
