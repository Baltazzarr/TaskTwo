import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouper {

    public Map<String, List<NamedObject>> groupByName(List<NamedObject> namedObjects) {
        return namedObjects.stream().collect(Collectors.groupingBy(NamedObject::getName));
    }

}
