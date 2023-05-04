

class Character{
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    
    // membuat constructor
    Character(String nama, int heal, String weapon, int attackP, int mana){ 
        this.nama = nama;
        this.heal = heal; 
        this.weapon = weapon;
        this.attackP = attackP;
        this.mana = mana;
        System.out.println(this.nama);
    }
    
    void attack(){
        this.mana -= 5; 
        System.out.println(this.nama + " menyerang si sotong");
        System.out.println("sotong terkena damage sebanyak " + this.attackP);
    }
    
    void damage(int attackP){
        System.out.println(this.nama + " terkena damage sebanyak " + attackP);
        this.heal -= attackP;
    }
    
    void print(){
        System.out.println("nama: " + this.nama);  
        System.out.println("heal: " + this.heal);
        System.out.println("weapon: " + this.weapon);
        System.out.println("attack power: " + this.attackP);
        System.out.println("mana : " + this.mana);
    }
}

 class Main{
    public static void main(String[] args) {
        Character character1 = new Character("ucup", 100, "pedang excalibur", 5, 100);
        character1.attack();
        character1.damage(10);
        character1.print();
    }
}
