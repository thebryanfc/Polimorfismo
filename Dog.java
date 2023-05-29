package prc;

public class Dog extends animal {
    public Dog(){}
    public Dog(String name, String color,int age,String type){

        super(name,color,age,type);}
        @Override
        public String talk(){return "El animal "+super.getName()+"dice woooow";}
        public String toString(){
        return "El animal"+super.getName()+
                " de color "+super.getColor()+
                " tiene "+super.getAge()+
                "y dice" +this.talk();
    }
}

