package prc;

public class Rooster extends animal {
    public Rooster(){
        super();
    }
    public Rooster(String name, String color,int age,String type){

        super(name,color,age,type);}
        @Override
        public String talk(){return"El animal "+super.getName()+"dice kikiki";}
    public String toString(){
        return "El animal"+super.getName()+
                " de color "+super.getColor()+
                " tiene "+super.getAge()+
                "y dice" +this.talk();
    }
}

