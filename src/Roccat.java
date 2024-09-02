public final class Roccat extends Mouse {

    public Roccat(String name, int id, Properties properties, PortEnum port) {
        super(name, id, properties, port);
    }

    @Override
    public String input(String buttonName) {
        return super.input(buttonName) + " by jitter-clicking";
    }

}
