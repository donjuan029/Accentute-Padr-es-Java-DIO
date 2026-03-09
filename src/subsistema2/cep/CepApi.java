package subsistema2.cep;

/**
 * Simulação de uma API externa de consulta de CEP.
 * Implementada utilizando o padrão Singleton.
 */
public final class CepApi {

    // Instância única do Singleton
    private static final CepApi INSTANCIA = new CepApi();

    // Construtor privado impede instanciação externa
    private CepApi() {
    }

    /**
     * Retorna a instância única da API de CEP.
     *
     * @return instância de CepApi
     */
    public static CepApi getInstancia() {
        return INSTANCIA;
    }

    /**
     * Simula a recuperação da cidade a partir do CEP.
     *
     * @param cep CEP consultado
     * @return cidade correspondente
     */
    public String recuperarCidade(String cep) {
        validarCep(cep);
        return "Araraquara";
    }

    /**
     * Simula a recuperação do estado a partir do CEP.
     *
     * @param cep CEP consultado
     * @return estado correspondente
     */
    public String recuperarEstado(String cep) {
        validarCep(cep);
        return "SP";
    }

    /**
     * Valida o CEP informado.
     */
    private void validarCep(String cep) {
        if (cep == null || cep.isBlank()) {
            throw new IllegalArgumentException("CEP inválido.");
        }
    }
}