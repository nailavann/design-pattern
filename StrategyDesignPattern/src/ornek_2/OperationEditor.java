package ornek_2;

public class OperationEditor {
    private final Operation operation;

    public OperationEditor(Operation operation) {
        this.operation = operation;
    }

    public void calculateResult(double a, double b){
        System.out.println("Sonuc: " + operation.islemYap(a,b));
    }
}
