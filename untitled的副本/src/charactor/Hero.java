package charactor;

import property.Item;
import property.Weapon;

import java.io.File;

//import property.Weapon;
public class Hero extends Object {
    public static final int t=1;//常量

    private int id;
    public static String name; //姓名
    static String copyright;
    protected float hp; //血量
    float armor; //护甲
    int moveSpeed;
    float maxHp;
    //public abstract void attack();
    public void attackHero(Hero h) throws EnemyHeroDeadException{
        if(h.hp==0){
            throw new EnemyHeroDeadException(h.name+"已经挂了，不需要释放技能");
        }
    }
    class EnemyHeroDeadException extends Exception{
        public EnemyHeroDeadException(){

        }
        public EnemyHeroDeadException(String msg){
            super(msg);
        }
    }


    public String toString(){
        return name;
    }
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
    class BattleScore{
        int kill;
        int die;
        int assit;
        public void legendary(){
            if(kill>=8)
                System.out.println(name+"超神");
            else
                System.out.print(name+"尚未超神");
        }
    }
    /*public Hero(){
        System.out.println("Hero的构造方法");
    }
    public Hero(String name){
        System.out.println("Hero的一个有参构造方法");
        this.name=name;
    }
    /*{
        maxHP=200;
    }
    private Hero(){

    }
    private static Hero h=new Hero();
    public static Hero getHero(){
        return h;
    }

     */

    public void die(){
        hp=0;
    }
    public static void battleWin(){
        System.out.println("battle win");
    }
    protected void equip(Weapon w){

    }
    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }
    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h=(Hero)o;
            return this.hp==h.hp;
        }
        return false;
    }
    static class EnemyCrystal{
        int hp=500;
        public void checkIfVictory(){
            if(hp==0) {
                Hero.battleWin();
                System.out.println(name+"win this game");
            }
        }
    }
    public static void main(String[] args){
        System.out.println("hello 1.8");
        /*File f1=new File("/Users/zeus/IdeaProjects/untitled/Hhhh");
        System.out.println(f1.getAbsoluteFile());
        File f=new File("/Users/zeus/IdeaProjects/untitled/Hhhh/LOL.exe");
        System.out.println(f.getAbsoluteFile());

        /*Hero g=new Hero();
        g.name="盖伦";
        g.hp=616;
        Hero t=new Hero();
        t.name="提莫";
        t.hp=0;
        try{
            g.attackHero(t);
        }catch(EnemyHeroDeadException e){
            System.out.println("异常原因"+e.getMessage());
            e.printStackTrace();
        }

        /*double f1=5.4f;
        double f2=5.5f;
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(9));
        System.out.printf("%.2f字符串测试%.2f %.2f\n",f1,f2,f1);
        System.out.format("%.2f字符串测试%.2f",f1,f2);
        /*String s="999";
        int i=Integer.parseInt(s);
        System.out.println(i);

        /*int i=5;
        String s=String.valueOf(i);
        System.out.println(s);
        Integer it=i;
        String t=it.toString();
        System.out.println(t);

        /*Integer it=new Integer(i);
        System.out.println(it instanceof Number);
        int i2=it.intValue();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        /*int damage=5;
        Hero h=new Hero(){
            int damage;
            public void attack(){
                damage=10;
                System.out.printf("新的进攻手段，造成%d点伤害",this.damage);
            }
            public void AnonymousHero(int damage){
                this.damage = damage;
            }
        };
        Hero t=new AnonymousHero(damage);
        /*class SomeHero extends Hero{
            public void attack(){
                System.out.print(name+"新的进攻手段");
            }
        }
        SomeHero h=new SomeHero();
        h.name="地卜师";
        h.attack();

        /*ADHero q=new ADHero();
        q.attack();
        System.out.println(q);
        Hero h=new Hero(){
            public void attack(){
                System.out.println("新的攻击手段");
            }
        };
        h.attack();
        System.out.println(h);

       /* Hero.EnemyCrystal c=new Hero.EnemyCrystal();
        c.checkIfVictory();
        /*Hero g=new Hero();
        g.name="盖伦";
        BattleScore s=g.new BattleScore();
        s.kill=9;
        s.legendary();
        /*final int a;
        a=1;
        final Hero h;
        h=new Hero();
        h.hp=5;


        Hero h1= new Hero();
        h1.hp = 300;
        Hero h2= new Hero();
        h2.hp = 400;
        Hero h3= new Hero();
        h3.hp = 300;

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));

        /*Hero h;
        for(int i=0;i<10000;i++){
            h=new Hero();
        }

        /*Hero h=new Hero();
        h.name="盖伦";
        System.out.println(h.toString());
        System.out.println(h);
        /*ADHero ad=new ADHero();
        APHero ap=new APHero();
        Hero h1=ad;
        Hero h2=ap;
        System.out.println(h1 instanceof ADHero);
        System.out.println(h2 instanceof APHero);
        System.out.println(h1 instanceof Hero);
        /*Hero g1=Hero.getHero();
        Hero g2=Hero.getHero();
        Hero g3=Hero.getHero();
        System.out.println(g1==g2);
        System.out.println(g2==g3);
        /*Hero garen=new Hero();
        garen.name="盖伦";
        Hero.copyright="版权由Riot Games公司所有";
        garen.copyright = "Blizzard Entertainment Enterprise";
        System.out.println(garen.name);
        System.out.println(garen.copyright);
        garen.die();
        Hero teemo=new Hero();
        teemo.name="提莫";
        System.out.println(teemo.name);
        System.out.println(teemo.copyright);
        Hero.battleWin();*/
    }

}
