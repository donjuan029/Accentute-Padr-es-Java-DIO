package one.digitalinnovation.gof.singleton;

/**
 * Implementação do padrão Singleton utilizando inicialização antecipada (Eager).
 * 
 * A instância é criada no momento em que a classe é carregada pela JVM.
 * Isso garante segurança em ambientes multithread, porém pode criar a
 * instância mesmo que ela nunca seja utilizada.
 */
public final class SingletonEager {

    // Instância única criada no carregamento da classe
    private static final SingletonEager INSTANCIA = new SingletonEager();

    // Construtor privado impede criação externa
    private SingletonEager() {
    }

    // Método de acesso global à instância única
    public static SingletonEager getInstancia() {
        return INSTANCIA;
    }
}