package dz.algeev.other;

public abstract class FileProcessor {

    public final void process(String fileName){
        open();
        write();
        change();
    }
    protected abstract void open();
    protected abstract void write();
    protected abstract void change();

}
