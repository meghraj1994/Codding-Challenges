package functionalprogramming;


@FunctionalInterface
public interface BiFunction<R,T1,T2> {
    R apply(T1 t1, T2 t2 );
}
