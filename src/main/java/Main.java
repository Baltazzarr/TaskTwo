import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<NamedObject> namedObjects = Arrays.asList(new NamedObjectImpl(1,"black"),
                new NamedObjectImpl(2,"yellow"), new NamedObjectImpl(3,"yellow"),
                new NamedObjectImpl(4,"white"), new NamedObjectImpl(5,"green"),
                new NamedObjectImpl(6,"black"), new NamedObjectImpl(7,"green"),
                new NamedObjectImpl(8,"black"));
        Map<String, List<NamedObject>> map = new Grouper().groupByName(namedObjects);
        System.out.println(map.toString());
    }

}
