package dz.algeev.weapon;

public class Gun extends Weapon{
    int bullet = -1, magazine = 5, shoot,reload;
    final int maxAmmo = 7;
    public Gun(int bullet){
        super(0);
        if((bullet > maxAmmo) || (bullet < 0)){
            throw new IllegalArgumentException("указанно не правильное кол-во патронов");
        }
        this.bullet = bullet;
    }

    public int getMaxAmmo(){
        return maxAmmo;
    }

    public int getReload(int reload){
        if(reload < 0){
           throw new IllegalArgumentException("error");
        }
        if(reload > maxAmmo){
            reload -= maxAmmo;
            return reload;
        }
        bullet += reload;
        if((bullet > maxAmmo) || (bullet < 0)){
            throw new IllegalArgumentException("указанно не правильное кол-во патронов");
        }
        return reload;
    }
    public int getReload(){
        return bullet;
    }
    public void unReload(){
        System.out.println(bullet);
        bullet = 0;
    }
    public boolean getUnReload(){
        if(bullet==0){
            return true;
        }
        return false;
    }
    public void shoot(int shoot){
        if(bullet >= 0){
            magazine = bullet;
        }
        for(int i = shoot;i > 0;i--){
            if(magazine > 0){
                System.out.println("Бах!");
            }
            if(magazine <= 0){
                System.out.println("Клац!");
            }
            magazine--;
        }
    }
}
