package projecto.controllers;

import projecto.models.Cliente;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class ClientesController {
    public static ArrayList<Cliente> clienteList;


    public ClientesController() {
        clienteList = new ArrayList<>();

    }

    public void criarCliente(String nome, String telefone, String endereco, String categoria ){
        int id = clienteList.size() + 1;
        Cliente cliente = new Cliente(id, nome, telefone, endereco, categoria );
        clienteList.add(cliente);
    }

    public void buscarTodosClientes(DefaultTableModel model){
        if(clienteList.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Nenhum resultado encontrado", "Dialog", JOptionPane.ERROR_MESSAGE);
        }else{
            for(Cliente cliente: clienteList){
                Object[] row = {
                        cliente.getNome(),
                        cliente.getCategoria(),
                        cliente.getTelefone(),
                        cliente.getEndereco()
                };
                model.addRow(row);
            }
        }
    }

    public void actualizarCliente(int id, String nome, String telefone, String endereco, String categoria){
        for(Cliente cliente: clienteList){
            if(cliente.getId() == id){
                cliente.setNome(nome);
                cliente.setTelefone(telefone);
                cliente.setEndereco(endereco);
                cliente.setCategoria(categoria);
                JOptionPane.showMessageDialog(new JFrame(), "Dados actualizados com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(new JFrame(), "Não foi possivel actualizar dados", "Dialog", JOptionPane.ERROR_MESSAGE);
    }

    public void deletaCliente(int id){
        for (Cliente cliente: clienteList){
            if(cliente.getId()==id){
                clienteList.remove(cliente);
                JOptionPane.showMessageDialog(new JFrame(), "Dados eliminado com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

    }

    public void pesquisaCliente(String n, DefaultTableModel model){
        for(Cliente cliente: clienteList){
            if(Objects.equals(cliente.getNome(), n)){
                Object[] row = {
                        cliente.getNome(),
                        cliente.getCategoria(),
                        cliente.getTelefone(),
                        cliente.getEndereco()

                };
                model.addRow(row);
            }else{
                System.out.println("erro");
            }
        }
    }
}
