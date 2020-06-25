package property;

public abstract class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }
    public abstract boolean disposable();


    /*private Item(){

    }
    private static Item t;
    public static Item getItem(){
        if(t==null) t=new Item();
        return t;
    }

     */
    public static void main(String[] args){


        /*Item i=new Item();
        i.effect();
        LifePotion lp=new LifePotion();
        lp.effect();

        /*Item g1=Item.getItem();
        Item g2=Item.getItem();
        Item g3=Item.getItem();
        System.out.println(g1==g2);
        System.out.println(g2==g3);

         */
    }
}
