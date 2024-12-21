package projecto.controllers;

import projecto.models.Cliente;
import projecto.models.Distribuidora;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Objects;

public class DistribuidorasController {
    public static ArrayList<Distribuidora> distribuidoraList;
    public DistribuidorasController() {
        distribuidoraList = new ArrayList<>();

    }

    public void criarDistribuidora(String nome, String nif,  String telefone, String tipo_produto ){
        int id = distribuidoraList.size() + 1;
        Distribuidora distribuidora = new Distribuidora(id, nome, nif, telefone, tipo_produto);
        distribuidoraList.add(distribuidora);
    }

    public void buscarTodasDistribuidoras(DefaultTableModel model){
        if(distribuidoraList.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Nenhum resultado encontrado", "Dialog", JOptionPane.ERROR_MESSAGE);
        }else{
            for(Distribuidora distribuidora: distribuidoraList){
                Object[] row = {
                        distribuidora.getNome(),
                        distribuidora.getNif(),
                        distribuidora.getTelefone(),
                        distribuidora.getTipo_produto()
                };
                model.addRow(row);
            }
        }
    }

    public void actualizarDistribuidora(int id, String nome, String nif,  String telefone, String tipo_produto){
        for(Distribuidora distribuidora: distribuidoraList){
            if(distribuidora.getId() == id){
                distribuidora.setNome(nome);
                distribuidora.setNif(nif);
                distribuidora.setTelefone(telefone);
                distribuidora.setTipo_produto(tipo_produto);

                JOptionPane.showMessageDialog(new JFrame(), "Dados actualizados com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(new JFrame(), "Não foi possivel actualizar dados", "Dialog", JOptionPane.ERROR_MESSAGE);
    }

    public void deletaDistribuidora(int id){
        for (Distribuidora distribuidora: distribuidoraList){
            if(distribuidora.getId()==id){
                distribuidoraList.remove(distribuidora);
                JOptionPane.showMessageDialog(new JFrame(), "Dados eliminado com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

    }

    public void pesquisaDistribuidora(String n, DefaultTableModel model){
        for(Distribuidora distribuidora: distribuidoraList){
            if(Objects.equals(distribuidora.getNome(), n)){
                Object[] row = {
                        distribuidora.getNome(),
                        distribuidora.getNif(),
                        distribuidora.getTelefone(),
                        distribuidora.getTipo_produto()
                };
                model.addRow(row);
            }else{
                System.out.println("erro");
            }
        }
    }
}
