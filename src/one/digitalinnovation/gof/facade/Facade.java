package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    private final CepApi cepApi;

    public Facade() {
        this.cepApi = CepApi.getInstancia();
    }

    public void migrarCliente(String nome, String cep) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do cliente não pode ser vazio.");
        }

        if (cep == null || cep.isBlank()) {
            throw new IllegalArgumentException("CEP inválido.");
        }

        // Recupera dados do CEP
        String cidade = cepApi.recuperarCidade(cep);
        String estado = cepApi.recuperarEstado(cep);

        // Registra cliente no CRM
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}