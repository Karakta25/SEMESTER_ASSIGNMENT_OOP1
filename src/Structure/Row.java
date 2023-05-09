package Structure;
import java.util.List;

public class Row <T> {

    private T data;

    private Row(T data) {
        this.data = data;
    }

    public Row(Integer data){
        this((T)data);
    }

    public Row(Double data){
        this((T)data);
    }

    public Row(String data){
        this((T)data);
    }

    public T getData() {
        return data;
    }
    public String getType(){
        return data.getClass().getSimpleName();
    }

}
