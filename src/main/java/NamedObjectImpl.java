public class NamedObjectImpl implements NamedObject{

    String name;

    Integer id;

    public NamedObjectImpl(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id.toString();
    }

}
