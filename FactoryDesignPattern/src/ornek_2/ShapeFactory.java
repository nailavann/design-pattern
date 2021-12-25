package ornek_2;

public class ShapeFactory {
    IShape shape;

    public IShape getShape(int type){
        switch (type){
            case 1:
                shape = new Rectangle();
                break;
            case 2:
                shape = new Circle();
                break;
            case 3:
                shape = new Square();
                break;
            default:
                System.out.println("Yanlış");
                break;
        }
        return shape;
    }
}
