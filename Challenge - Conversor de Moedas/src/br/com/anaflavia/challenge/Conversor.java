package br.com.anaflavia.challenge;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) throws Exception {
		Object[] options = { "Converter Moedas", "Converter Temperatura", "Sair" };

		int escolha = JOptionPane.showOptionDialog(null, "Oque quer fazer?", "Converter", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		if (escolha == 2) {
			JOptionPane.showMessageDialog(null, "Programa encerrado");
			System.exit(0);
		}

		if (escolha == 0) {
			DecimalFormat formatarDivisao = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			while (continuarPrograma) {
				String[] opcoes = { "De reais a Dólares", "De reais a Euros", "De reais a Libras", "De reais a Yene",
						"De reais a Won", "De Dólares a reais", "De Euros a reais", "De Libras a reais",
						"De Yene a reais", "De Won a reais" };
				String mudar = (String) JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Conversor de Moedas",
						JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

				String input = JOptionPane.showInputDialog(null, "Ponha o valor que quer converter: ");

				double valor = 0.00;

				try {
					valor = Double.parseDouble(input);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}

				if (mudar.equals("De reais a Dólares")) {
					double dolares = valor / 4.80;

					JOptionPane.showMessageDialog(null,
							valor + " Reais são: " + formatarDivisao.format(dolares) + " Dolares.");
				} else if (mudar.equals("De reais a Euros")) {
					double euros = valor / 5.32;

					JOptionPane.showMessageDialog(null,
							valor + " Reais são: " + formatarDivisao.format(euros) + " Euros.");

				} else if (mudar.equals("De reais a Libras")) {
					double libras = valor / 6.23;

					JOptionPane.showMessageDialog(null,
							valor + " Reais são: " + formatarDivisao.format(libras) + " Libras.");

				} else if (mudar.equals("De reais a Yene")) {
					double yen = valor / 0.034;

					JOptionPane.showMessageDialog(null, valor + " Reais são: " + formatarDivisao.format(yen) + " Yen.");

				} else if (mudar.equals("De reais a Won")) {
					double won = valor / 0.0037;

					JOptionPane.showMessageDialog(null, valor + " Reais são: " + formatarDivisao.format(won) + " Won.");

				} else if (mudar.equals("De Dólares a reais")) {
					double reais = valor * 4.80;

					JOptionPane.showMessageDialog(null,
							valor + " Dólares são: " + formatarDivisao.format(reais) + " Reais.");

				} else if (mudar.equals("De Euros a reais")) {
					double reais = valor * 5.32;

					JOptionPane.showMessageDialog(null,
							valor + " Euros são: " + formatarDivisao.format(reais) + " Reais.");

				} else if (mudar.equals("De Libras a reais")) {
					double reais = valor * 6.23;

					JOptionPane.showMessageDialog(null,
							valor + " Libras são: " + formatarDivisao.format(reais) + " Reais.");

				} else if (mudar.equals("De Yene a reais")) {
					double reais = valor * 0.034;

					JOptionPane.showMessageDialog(null,
							valor + " Yene são: " + formatarDivisao.format(reais) + " Reais.");

				} else if (mudar.equals("De Won a reais")) {
					double reais = valor * 0.0037;

					JOptionPane.showMessageDialog(null,
							valor + " Won são: " + formatarDivisao.format(reais) + " Reais.");

				}

				int confirma = JOptionPane.showConfirmDialog(null, "Deseja continuar usando o programa?", "Confirmar",
						JOptionPane.YES_NO_OPTION);
				if (confirma == JOptionPane.NO_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
			}
		}

		if (escolha == 1) {

			boolean seguirPrograma = true;
			while (seguirPrograma) {
				String[] opcoes = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
				int mudar = JOptionPane.showOptionDialog(null, "Escolha uma opcão: ", "Converter Temperatura",
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

				String colocarValor = JOptionPane.showInputDialog("Coloque a temperatura");
				double valor = 0.0;
				try {
					valor = Double.parseDouble(colocarValor);

				} catch (NumberFormatException e) {
					JOptionPane.showConfirmDialog(null, "Temperatura invalida");
					System.exit(0);
				}

				double resultado = 0;

				if (mudar == 0) {
					resultado = (valor * 9 / 5) + 32;
					JOptionPane.showMessageDialog(null,
							valor + " Graus Celsius são: " + resultado + " Graus Fahrenheit");
				} else if (mudar == 1) {
					resultado = (valor - 32) * 5 / 9;
					JOptionPane.showMessageDialog(null,
							valor + " Graus Fahrenheit são: " + resultado + " Graus Celsius");
				}
				int continuar = JOptionPane.showConfirmDialog(null, "Deseja seguir com o programa?", "",
						JOptionPane.YES_NO_OPTION);

				if (continuar == JOptionPane.NO_OPTION) {
					
					seguirPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
			}
		}

	}
}
