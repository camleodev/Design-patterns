package Iterator;
import java.util.Iterator;

public class DinerMenu {

    public Iterator createIterator(){
        return new DinerMenuIterator();
    }
}
