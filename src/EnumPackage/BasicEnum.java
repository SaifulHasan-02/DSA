package EnumPackage;

public class BasicEnum {

    //The Enum in Java is a data type which contains a fixed set of constants.
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
    }
    //enun is public,static and final
    //static :- external object is not required for invoke
    //final :- no need to change
    //enum doest not support inheritance
    //enum support interface
    /*
        Enum improves type safety
        Enum can be easily used in switch
        Enum can be traversed
        Enum can have fields, constructors and methods
        Enum may implement many interfaces but cannot extend any class
        because it internally extends Enum class
     */

    public static void main(String[] args) {
        Week week = Week.Monday;
        System.out.println(week);


        for(Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());

    }
}
