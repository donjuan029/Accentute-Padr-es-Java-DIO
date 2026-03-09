package subsistema1.crm;

/**
 * Serviço responsável por simular a gravação de clientes em um sistema CRM.
 */
public final class CrmService {

    // Construtor privado para impedir instanciação
    private CrmService() {
    }

    /**
     * Grava os dados do cliente no sistema CRM.
     *
     * @param nome   Nome do cliente
     * @param cep    CEP do cliente
     * @param cidade Cidade do cliente
     * @param estado Estado do cliente
     */
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {

        System.out.println("=== Cliente salvo no sistema de CRM ===");
        System.out.println("Nome   : " + nome);
        System.out.println("CEP    : " + cep);
        System.out.println("Cidade : " + cidade);
        System.out.println("Estado : " + estado);
        System.out.println("---------------------------------------");
    }
}