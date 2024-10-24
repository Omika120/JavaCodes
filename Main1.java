package com.apj;

//Super class witn 2 methods
class HillStations {

    public void location(){
        System.out.println("to get the location of this hillstation ");
    }

    public void famousFor(){
        System.out.println("to get the speciality of a location ");
    }
    
}

//subclass 1: Manali
class Manali extends HillStations{

    //@override
    public void location(){
        System.out.println("Manali is a popular tourist destination in Himachal Pradesh,India. ");
    }

    public void famousFor(){
        System.out.println("Manali if famous for its natural beauty, adventure sports, and many attractions. ");
    }

}

//subclass 2: Massoorie
class Massoorie extends HillStations{

    //@override
    public void location(){
        System.out.println("Mussoorie is a popular hill station in the Garhwal hills of Uttarakhand, India. ");
    }

    public void famousFor(){
        System.out.println("Mussoorie if famous for its scenic beauty, adventure activities, and educational institutions");
    }

}

//subclass 3: Gulmarg
class Gulmarg extends HillStations{

    //@override
    public void location(){
        System.out.println("Gulmarg, a hill station in Jammu and Kashmir. ");
    }

    public void famousFor(){
        System.out.println("Gulmarg if famous for its scenic beauty, skiing, and other attractions. ");
    }

}

//Main class to show override and runtime execution
public class Main1{
    public static void main(String[] args) {
        
        //super class referance to base class objects.
        HillStations hills1= new Manali(); 
        HillStations hill2= new Massoorie();
        HillStations hill3= new Gulmarg();

        //Caliing baseclass methods at runtime.
        hills1.location();
        hill2.famousFor();

        hill2.location();
        hill2.famousFor();

        hill3.location();
        hill3.famousFor();

    }
}
