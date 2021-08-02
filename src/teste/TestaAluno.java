/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author brayan.waltrick
 */
public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        aluno.setNome(nome);

        System.out.println("Nome: " + aluno.getNome());
        
        
        String sobrenome = JOptionPane.showInputDialog("Digite o nome do aluno");
        aluno.setSobrenome(sobrenome);
        System.out.println("Sobrenome: " + aluno.getSobrenome());

//        aluno.sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno");
//        aluno.idade = JOptionPane.showInputDialog("Digite a idade");
//        aluno.idade = JOptionPane.showInputDialog("Digite a idade");
//
////      String salario = JOptionPane.showInputDialog("Digite o salario");
////      aluno.salario = Float.parseFloat(salario);
//        aluno.salario = Float.parseFloat(JOptionPane.
//                                           showInputDialog("Digite o salario"));
//
//        aluno.cpf = Long.parseLong(JOptionPane.
//                                           showInputDialog("Digite o cpf"));
//        
//        JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome
//                + " " + aluno.sobrenome + "/nidade: " + aluno.idade
//                + "/nSalário: " + aluno.salario);
//
//    }
//
//}
    }
}
