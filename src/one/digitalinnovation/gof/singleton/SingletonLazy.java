package one.digitalinnovation.gof.singleton;

/**
 * Implementação do padrão Singleton com inicialização preguiçosa (Lazy).
 * 
 * A instância só é criada quando o método getInstancia() é chamado
 * pela primeira vez.
 */
public final class SingletonLazy {

    private static SingletonLazy instancia;

    // Construtor privado impede criação externa
    private SingletonLazy() {
    }

    // Método de acesso global à instância
    public static SingletonLazy getInstancia() {

        if (instancia == null) {
            instancia = new SingletonLazy();
        }

        return instancia;
    }
}