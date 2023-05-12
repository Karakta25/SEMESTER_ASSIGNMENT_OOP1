package Structure;
import java.util.List;

public class Row <T> {

    private T data;

    public Row(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }
    public String getType(){
        return data.getClass().getSimpleName();
    }

}
