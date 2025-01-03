package org.example;

    public enum Weapon {
    SWORD(30,4),
    DAGGER(20,5),
    MAUL(50,2);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
        public int getDamage() {
            return this.damage;
        }

        public double getAttackSpeed() {
            return this.attackSpeed;
        }

}
