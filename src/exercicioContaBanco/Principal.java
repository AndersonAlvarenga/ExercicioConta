package exercicioContaBanco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import usuario.Conta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta novaConta;
		ArrayList<Conta> Conta = new ArrayList<>();
		int menu = -1;
		while (menu != 0) {
			menu = Integer.parseInt(JOptionPane.showInputDialog(
					"MENU\n[1] Cadastrar Conta\n[2] Listar Contas Cadastradas\n[3] Efetuar Saque\n[4] Efetuar Deposito\n[0] Sair"));
			switch (menu) {
			case 1:
				String nome = JOptionPane.showInputDialog("Qual o nome do usuário");
				int numeroConta = 1000;
				double saldo = Double
						.parseDouble(JOptionPane.showInputDialog("Entre com o valor do primeiro deposito"));
				if (saldo == 0) {
					novaConta = new Conta(numeroConta++, nome);
				} else {
					novaConta = new Conta(numeroConta, nome, saldo);
				}
				JOptionPane.showMessageDialog(null, novaConta.toString());
				Conta.add(novaConta);
				break;
			case 2:
				String aux = "";
				for (int i = 0; i < Conta.size(); i++) {
					aux += Conta.get(i);
					aux += "\n\n";
				}
				JOptionPane.showMessageDialog(null, aux);
				break;
			case 3:
				boolean aux1 = false;
				while (aux1 == false) {
					numeroConta = Integer
							.parseInt(JOptionPane.showInputDialog("Qual o numero da conta\nTecle 0 para sair"));
					if (numeroConta == 0) {
						aux1 = true;
					} else {
						for (int i = 0; i < Conta.size(); i++) {
							if (Conta.get(i).getNumeroConta() == numeroConta) {
								aux1 = true;
								double saque = Double
										.parseDouble(JOptionPane.showInputDialog("Informe a quantia que será sacada"));
								Conta.get(i).saque(saque);
								JOptionPane.showMessageDialog(null, Conta.get(i).toString());
							}
						}
						if (aux1 == false) {
							JOptionPane.showMessageDialog(null, "Número de Conta incorreto\nVerifique!");
						}
					}
				}
				break;
			case 4:
				aux1 = false;
				while (aux1 == false) {
					numeroConta = Integer
							.parseInt(JOptionPane.showInputDialog("Qual o numero da conta\nTecle 0 para sair"));
					if (numeroConta == 0) {
						aux1 = true;
					} else {
						for (int i = 0; i < Conta.size(); i++) {
							if (Conta.get(i).getNumeroConta() == numeroConta) {
								aux1 = true;
								double deposito = Double.parseDouble(
										JOptionPane.showInputDialog("Informe a quantia que será depositada"));
								Conta.get(i).deposito(deposito);
								JOptionPane.showMessageDialog(null, Conta.get(i).toString());
							}
						}
						if (aux1 == false) {
							JOptionPane.showMessageDialog(null, "Número de Conta incorreto\nVerifique!");
						}
					}
				}
				break;

			default:
				break;
			}
		}
	}
}
