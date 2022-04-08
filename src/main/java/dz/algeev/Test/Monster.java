package dz.algeev.Test;


@ToString()
@Validate({Monster.class,ReturnMethods.class})
@Two(first = "babaduk",second = 2)
@Cache()
public class Monster extends FatherMonster{
    @Default(Monster.class)
    public int x,y;

    @Check
    public int monster(){
        return 1;
    }
    @Invoke
    public void test1(){
    }

}
