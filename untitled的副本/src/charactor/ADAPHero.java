package charactor;

public class ADAPHero extends Hero implements AP,AD {
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public void attack(){
        System.out.println("既可以进行物理攻击，又可以进行魔法攻击");
    }

}
