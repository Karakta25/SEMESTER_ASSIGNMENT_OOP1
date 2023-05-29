package Structure;

public class Data<T> {

    private T data;

    public Data(T data) {
        this.data = data;
    }

    public String getType() {
        return data.getClass().getSimpleName();
    }

    public String toString(){
        return data.toString();
    }
}
