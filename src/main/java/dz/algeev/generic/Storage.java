package dz.algeev.generic;

public final class Storage<Q> {
    private static Storage instance;
    Q ob;

    private Storage(Q ob){
        this.ob = ob;
    }

    public static Storage getInstanceNull(Storage ob){
        if(instance == null){
            instance = new Storage(ob);
        }
        return instance;
    }
    public static Storage getInstanceNoNull(Storage ob){
        if(instance != null){
            instance = new Storage(ob);
        }
        return instance;
    }
    public Q check(Q ob){
        if(instance == null){
            if(ob == null){
                throw new IllegalArgumentException("error");
            }
            instance = new Storage(ob);
        }
        return (Q) instance;
    }
    public Q getObject(Q ob2){
        if(ob == null)
        {
            return ob2;
        }
        Q obj = ob;
        return obj;
    }
}
