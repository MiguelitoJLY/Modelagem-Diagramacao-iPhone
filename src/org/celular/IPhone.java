package org.celular;

import org.aparelhoTelefonico.AparelhoTelefonico;
import org.navegadorInternet.NavegadorInternet;
import org.reprodutorMusical.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

//	------------------------------REPRODUTOR MUSICAL------------------------------
	private String musica;
	
	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música...");
	}

	@Override
	public void selecionarMusica(String musica) {
		this.musica = musica;
		System.out.println("Escolhendo a musica " + musica);
	}
	

//	------------------------------NAVEGADOR DE INTERNET------------------------------
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void exibirPagina(String url) {
		this.url = url;
		System.out.println("Acessando a página " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina...");
	}
	

//	------------------------------APARELHO TELEFONICO------------------------------
	private String numero;
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public void ligar(String numero) {
		this.numero = numero;
		System.out.println("Ligando para o número " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Reproduzindo correio de voz...");
	}

}
