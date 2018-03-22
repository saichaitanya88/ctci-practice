package OOP;

public class CallCenter {
    public CallCenter(){

    }
    Employee getCallHandler(Call call){
        return null;
    }
    void dispatchCall(Call call){

    }
    void getNextCall(Employee e){

    }
}

class Call{
    Rank rank = Rank.FRESHER;
    public void reply(String messages){ }
    public void disconnect(){ }
}

class Employee{
    CallCenter callCenter;
    Rank rank;
    Employee(Rank rank){
        this.rank = rank;
    }
    void ReceiveCall(Call call){ }
    void CallHandled(Call call){ }
    void CannotHandle(Call call){ }

}
class Fresher extends Employee{
    public Fresher(){
        super(Rank.FRESHER);
    }
}
class TechLead extends Employee{
    public TechLead(){
        super(Rank.TEAMLEAD);
    }
}
class ProductManager extends Employee{
    public ProductManager(){
        super(Rank.PRODUCTMANAGER);
    }
}
enum Rank{
    FRESHER, TEAMLEAD, PRODUCTMANAGER
}