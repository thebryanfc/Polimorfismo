package prc;

public class Cat extends animal {

    public Cat(){

    }
    public Cat(String name, String color,int age,String type) {

        super(name, color, age, type);
    }
        @Override

        public String talk(){ return "El animal "+super.getName()+"dice miauu";}

        public String toString(){
            return "El animal"+super.getName()+
                    " de color "+super.getColor()+
                    " tiene "+super.getAge()+
                    "y dice" +this.talk();
        }

    }

