package dz.algeev.weapon;

abstract class Weapon {
    protected int ammo;
    public Weapon(int ammo){
        if(ammo<0){
            throw new RuntimeException();
        }
        this.ammo = ammo;
    }

    abstract void shoot(int shoot);

    public int ammo(){
        return ammo;
    }

    public boolean getAmmo(){
        if(ammo==0){
            return false;
        }
        ammo--;
        return true;
    }

    protected void load (int ammo){
        if(ammo<0){
            throw new RuntimeException();
        }
        this.ammo += ammo;
    }
}
