package exempro;

import java.util.Scanner;

public class Temporizador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int hora = 1; hora > -1; hora--) {
			for (int minuto = 59; minuto > -1; minuto--) {
				for (int segundo = 59; segundo > -1; segundo--) {
					System.out.println(hora + " : " + minuto + " : " + segundo);
				}
			}
		}
		sc.close();
	}
}
