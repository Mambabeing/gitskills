package charactor;
import property.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class ADHero extends Hero implements AD {

    int moveSpeed=400;


    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public void useItem(Item i){
        System.out.println("adhero use item");
        super.useItem(i);
    }
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public void attack(){
        physicAttack();
    }


    public ADHero(){
        System.out.println("ADHero的构造方法");
    }
    public ADHero(String name){
        //super(name);
        System.out.print("ADHero的构造方法");
    }
    public static void battleWin(){
        System.out.println("ad hero battle win");

    }
    public static void main(String[] args){
        System.out.println("hello world");
        /*SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(s);
        Date d=new Date();
        String t=s.format(d);
        System.out.println(t);

        /*Date s=new Date();
        System.out.println(s.toString());
        System.out.println(s.getTime());
        Date t=new Date(5000);
        System.out.println(t);
        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是:"+zero);

        /*String s1="the light";
        String s2=new String(s1);
        System.out.println(s1==s2);
        /*System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");
        /*ADHero h=new ADHero();
        LifePotion lp=new LifePotion();

        /*new ADHero("德莱文");
        ADHero h= new ADHero();

        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());*/
    }

}
