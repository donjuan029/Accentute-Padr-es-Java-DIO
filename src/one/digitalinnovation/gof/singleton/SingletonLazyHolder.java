package one.digitalinnovation.gof.singleton;

/**
 * Implementação do padrão Singleton utilizando o padrão Lazy Holder.
 *
 * A instância é criada apenas quando o método getInstancia() é chamado,
 * aproveitando o carregamento de classes da JVM para garantir thread-safety
 * sem a necessidade de sincronização explícita.
 *
 * Referência:
 * https://stackoverflow.com/a/24018148
 */
public final class SingletonLazyHolder {

    // Construtor privado impede criação externa da instância
    private SingletonLazyHolder() {
    }

    // Classe interna responsável por manter a instância do Singleton
    private static class InstanceHolder {
        private static final SingletonLazyHolder INSTANCIA = new SingletonLazyHolder();
    }

    // Método global de acesso à instância única
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.INSTANCIA;
    }
}