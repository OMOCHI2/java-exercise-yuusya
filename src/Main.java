public class Main {
  public static void main(String[] args) throws Exception {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    Hero h = new Hero("ミナト");
    h.sword = s;
    System.out.println(h.name + "の現在の武器は" + h.sword.name);

    Hero h2 = new Hero("アサガ");
    Matango m = new Matango('A');

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    w.heal(h);
    w.heal(h2);

    SuperHero sh = new SuperHero();
    sh.attack();
    sh.fly();
    sh.attack();

    Dancer d = new Dancer();
    d.dance();
    d.attack(m);
  }
}
