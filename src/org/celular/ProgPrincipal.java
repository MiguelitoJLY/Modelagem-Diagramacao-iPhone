package org.celular;

import java.util.Scanner;

import org.aparelhoTelefonico.AparelhoTelefonico;
import org.navegadorInternet.NavegadorInternet;
import org.reprodutorMusical.ReprodutorMusical;

public class ProgPrincipal {
	
	public static void main(String[] args) {
		
		System.out.println("BEM-VINDO AO IPHONE!");
		
		IPhone setGet = new IPhone();
		Scanner input = new Scanner(System.in);
		int continuacao = 1;
		
		do {
			
			System.out.println("");
			
			System.out.println("Qual serviço você deseja utilizar? 'at' para Aparelho Telefonico, 'ni' para Navegar na Internet e 'rm' para Reprodutor Musical.");
			String escolha = input.next();
			System.out.println("");
			
//			--------------------------APARELHO TELEFÔNICO--------------------------
			if(escolha.equalsIgnoreCase("at")) {
				
				AparelhoTelefonico at = new IPhone();
				System.out.println("Você deseja ligar (l), atender (a) ou reproduzir correio de voz(cv)?");
				String servicoAT = input.next();
				
				if (servicoAT.equalsIgnoreCase("l")) {
					System.out.println("Digite o número que você deseja ligar: ");
					setGet.setNumero(input.next());
					at.ligar(setGet.getNumero());
				} else if(servicoAT.equalsIgnoreCase("a")) {
					at.atender();
				} else if(servicoAT.equalsIgnoreCase("cv")) {
					at.iniciarCorreioVoz();
				} else {
					System.out.println("Serviço não identificado.");
				}
				
				System.out.println("");
				
//				--------------------------NAVEGADOR DE INTERNET--------------------------
			} else if (escolha.equalsIgnoreCase("ni")) {
				
				NavegadorInternet ni = new IPhone();
				System.out.println("Você deseja exibir uma página (ep), adicionar uma nova aba (adc) ou atualizar a página (att)?");
				String servicoNI = input.next();
				
				if(servicoNI.equalsIgnoreCase("ep")) {
					System.out.println("Qual página você quer acessar?");
					setGet.setUrl(input.next());
					ni.exibirPagina(setGet.getUrl());
				} else if (servicoNI.equalsIgnoreCase("adc")) {
					ni.adicionarNovaAba();
				} else if (servicoNI.equalsIgnoreCase("att")) {
					ni.atualizarPagina();
				} else {
					System.out.println("Serviço não identificado.");
				}
				
				System.out.println("");
				
//				--------------------------REPRODUTOR MUSICAL--------------------------
			} else if (escolha.equalsIgnoreCase("rm")) {
				
				ReprodutorMusical rm = new IPhone();
				System.out.println("Você deseja tocar (t), pausar (p) ou escolher (e) uma música?");
				String servicoRM = input.next();
				
				if(servicoRM.equalsIgnoreCase("t")) {
					rm.tocar();
				} else if(servicoRM.equalsIgnoreCase("p")) {
					rm.pausar();
				} else if(servicoRM.equalsIgnoreCase("e")) {
					input.nextLine(); // Não é a explicação correta, mas usar o "input.nextLine()" aqui "prepara" o próximo "input.nextLine()" para ser usado com espaçamento
					
					System.out.println("Qual o nome da música que você gostaria de reproduzir?");
					String musica = input.nextLine();
					setGet.setMusica(musica);
					rm.selecionarMusica(setGet.getMusica());
				}
				
				System.out.println("");
				
//				--------------------------CASO CONTRÁRIO...--------------------------
			} else {
				System.out.println("Serviço não reconhecido...");
				System.out.println("Pane extremo no sistema!");
				System.out.println("O IPhone está apresentando superaquecimento!");
				System.out.println("Seu IPhone explodiu.");
				break;
			}
			
			System.out.println("Deseja escolher outro serviço? '1' para SIM e '0' para NÃO");
			continuacao = input.nextInt();
			
		} while(continuacao == 1);
		
		input.close();
		
	}

}
