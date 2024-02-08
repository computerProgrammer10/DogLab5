public abstract class Animal {
    private int age;
    public Animal(int age){
        this.age = age;
    }

    public void setAge(int age){this.age=age;}
    public int getAge(){return age;}

    abstract void eat();
// this gives an error because this is NOT an abstract class, we have to set it as one

}
