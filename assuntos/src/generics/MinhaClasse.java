package generics;

public class MinhaClasse<T> {
    private T obj;

    public MinhaClasse(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
