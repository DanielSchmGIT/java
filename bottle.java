package bottle.domain;

public class Bottle <T extends Drink>{

    private T content;

    public boolean isEmpty(){
        return content == null;
    }

    public void fill(T drink) {
        if (content != null)
            throw new IllegalStateException();

        content = drink;
    }

    public T empty(){
        if (content == null)
            throw new IllegalStateException();

        T drink = content;
        content = null;
        return drink;
    }
}
