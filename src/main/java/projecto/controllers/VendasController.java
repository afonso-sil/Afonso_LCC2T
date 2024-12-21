package projecto.controllers;

import projecto.models.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Objects;

import static projecto.controllers.ClientesController.clienteList;


public class VendasController {
    public static ArrayList<Venda> vendaList;
    public VendasController() {
        vendaList = new ArrayList<>();

    }

    public void guardaVenda(String cliente, String produto,int quantidade, String totalPago, String nifVenda ){
        int id = vendaList.size() + 1;
        Venda venda = new Venda(id, cliente, produto, quantidade, totalPago, nifVenda );
        vendaList.add(venda);
    }

    public void buscarTodasVendas(DefaultTableModel model){
        if(vendaList.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Nenhum resultado encontrado", "Dialog", JOptionPane.ERROR_MESSAGE);
        }else{
            for(Venda venda: vendaList){

                Object[] row = {
                        venda.getId(),
                        venda.getCliente(),
                        venda.getProduto(),
                        venda.getQuantidade(),
                        venda.getTotalPago(),
                        venda.getNifVenda()
                };
                model.addRow(row);
            }
        }
    }

    public void deletaVenda(int id){
        for (Venda venda: vendaList){
            if(venda.getId()==id){
                vendaList.remove(venda);
                JOptionPane.showMessageDialog(new JFrame(), "Dados eliminado com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

    }

    public void pesquisaVenda(String n, DefaultTableModel model){
        for(Venda venda: vendaList){
            if(Objects.equals(venda.getNifVenda(), n)){
                Object[] row = {
                        venda.getId(),
                        venda.getCliente(),
                        venda.getProduto(),
                        venda.getQuantidade(),
                        venda.getTotalPago(),
                        venda.getNifVenda()
                };
                model.addRow(row);
            }else{
                System.out.println("erro");
            }
        }
    }
}
