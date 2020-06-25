import java.util.*;
import java.math.*;
import java.lang.Math;
/*public class Hero {

    String name; // 姓名

    float hp; // 血量

    float armor; // 护甲

    int moveSpeed; // 移动速度

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    // 攻击一个英雄，并让他掉damage点血
    public void attack(Hero hero, int damage) {
        hero.hp = hero.hp - damage;
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("提莫", 383);
        Hero garen = new Hero("盖伦", 616);
        garen.attack(teemo, 100);
        System.out.println(teemo.hp);
    }

}
/*class Hero{
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero(){
        System.out.print("实例化时必然调用构造方法");
    }
    public Hero(String name){
        this.name=name;
        System.out.println("一个参数的构造方法");
    }
    public Hero(String name,float hp){
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp=hp;
    }
    public void show() {
        System.out.println("打印this的虚拟地址" + this);
    }
}
public class Main{
    public static void main(String[] args){
        Hero h=new Hero("666",383);

    }
}
/*class Item{
    String name;
    int price;
}
class Weapon1{
    String name;
    int price;
    int damage;
}
class Weapon extends Item{
    int damage;
    public void attack(){
        System.out.println(name+"不知打中了谁")
    }
    public void attack(Item...heros){
        for(int i=0;i<heros.length;i++){
            System.out.println(name+"攻击了"+heros[i].name);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] c=new int[5][8];
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                c[i][j]=(int)(Math.random()*100);
            }
        }
        //Arrays.sort(c); 二维只能先复制到一维
        for(int i=0;i<5;i++){
            for(int e[]:c){
                System.out.println(Arrays.toString(e));
            }
        }
        int b[] = new int[5];
        Arrays.fill(b,6);
        System.out.println(Arrays.toString(b));
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int m=0,n=0,max=0;
        System.out.println(a);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,62));
    }
}
        /*Scanner s=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=3;i++){
            sum+=Math.pow(i,2);
        }
        System.out.print(sum);
        int[][] a=new int[3][3];
        int m=0,n=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=s.nextInt();
                if(i==j){
                    m+=a[i][j];
                }else if(i+j==2){
                    n+=a[i][j];
                }
            }
        }
        System.out.print(m+" "+n);
        s.close();
    }
}
*/