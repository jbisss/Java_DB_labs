package example31;

public class Cell<T1, T2> {
    private T1 t;
    private T2 r;

    public void setValue(T1 t, T2 r){
        this.r = r;
        this.t = t;
    }

    public T1 getT() {
        return t;
    }

    public T2 getR() {
        return r;
    }
    @Override
    public String toString(){
        return "First type: " + this.t + " second type: " + this.r;
    }
}
