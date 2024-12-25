package prob1.abhay.UDFunctions;

@FunctionalInterface
public interface ObjectCreator {
    Object create(int id, String name);
}
