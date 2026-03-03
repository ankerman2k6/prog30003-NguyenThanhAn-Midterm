import java.util.ArrayList;
import java.util.List;

public class StudentManager<T> {
    public List<T> data;

    public StudentManager() {
        this.data = new ArrayList<>();
    }

    public void add(T item){
        data.add(item);
    }

    public void getAll(){
        for (T item : data){
            System.out.println(item.toString());
        }
    }






}
