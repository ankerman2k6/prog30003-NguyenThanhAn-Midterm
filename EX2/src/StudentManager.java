import java.util.ArrayList;
import java.util.List;

public class StudentManager<T> {
    public List<T> data;

    public StudentManager(List<T> data) {
        data = new ArrayList<>();
        this.data = data;
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
