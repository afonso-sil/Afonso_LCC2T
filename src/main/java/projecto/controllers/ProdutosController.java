package projecto.controllers;

import projecto.models.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Objects;

public class ProdutosController {

    public static ArrayList<Produto> produtoList;

    public ProdutosController() {
        produtoList = new ArrayList<>();

    }

    public void criarProduto(String nome_produto , String categoria, double preco ){
        int id = produtoList.size() + 1;
        Produto produto = new Produto(id, nome_produto, categoria, preco);
        produtoList.add(produto);
    }

    public void buscarTodosProdutos(DefaultTableModel model){
        if(produtoList.isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Nenhum resultado encontrado", "Dialog", JOptionPane.ERROR_MESSAGE);
        }else{
            for(Produto produto: produtoList){
                Object[] row = {
                        produto.getNome_produto(),
                        produto.getCategoria(),
                        produto.getPreco()
                };
                model.addRow(row);
            }
        }
    }

    public void actualizarProduto(int id, String nome_produto, String categoria, double preco){
        for(Produto produto: produtoList){
            if(produto.getId() == id){
                produto.setNome_produto(nome_produto);
                produto.setCategoria(categoria);
                produto.setPreco(preco);

                JOptionPane.showMessageDialog(new JFrame(), "Dados actualizados com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(new JFrame(), "Não foi possivel actualizar dados", "Dialog", JOptionPane.ERROR_MESSAGE);
    }

    public void deletaProduto(int id){
        for (Produto produto: produtoList){
            if(produto.getId()==id){
                produtoList.remove(produto);
                JOptionPane.showMessageDialog(new JFrame(), "Dados eliminado com sucesso", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

    }

    public void pesquisaProduto(String n, DefaultTableModel model){
        for(Produto produto: produtoList){
            if(Objects.equals(produto.getNome_produto(), n)){
                Object[] row = {
                        produto.getNome_produto(),
                        produto.getCategoria(),
                        produto.getPreco()
                };
                model.addRow(row);
            }else{
                System.out.println("erro");
            }
        }
    }
}
