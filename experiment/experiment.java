package experiment1;
public class experiment
{
    public static void main(String[] args)
    {
        // Auto bustest=new Bus();//bustest为子类对象
        // bustest.start();//调用Auto方法
        // Bus BusTest=(Bus)bustest;//向下转型
        // BusTest.getOn();//输出子类方法
        // System.out.println(BusTest.passenger);//输出子类成员变量
        Bus bus=new Bus();//定义Bus类的对象
        System.out.println("Bus distance:"+bus.distance());
        System.out.println("Bus cost:"+bus.cost());
        Train train=new Train();
        System.out.println("Train distance:"+train.distance());
        System.out.println("Train cost for adult:"+train.projectcost("成人"));//比较字符串
        System.out.println("Train cost for child:"+train.projectcost("儿童"));
        Plane plane=new Plane();
        System.out.println("Plane speed:"+Plane.SPEED);
        System.out.println("Plane distance:"+plane.distance());
        System.out.println("Plane cost for economy class:"+plane.projectcost("经济舱"));
    }
}
class Auto
{
    public double speed;
    public void start()//表示启动
    {
        System.out.println("启动");
    }
    public void speedUp()//表示加速
    {
        System.out.println("加速");
    }
    public void stop()//表示停止
    {
        System.out.println("停止");
    }
}
// class Bus extends Auto{
//    int passenger=27;//乘客数
//    void getOn(){
//    System.out.println("乘客上车");}
//    void getOff(){
//    System.out.println("乘客下车");}
// }
interface A
{
    final double HOUR=10;
    double distance();
}
interface B
{
    double cost();
    double projectcost(String type);//用来判断字符
}

class Bus implements A,B//继承接口A,B
{
    public static final int SPEED=60;
    @Override//子类重写父类方法
    public double distance() {
        double route=SPEED*HOUR;
        return route;
    }
    @Override//子类重写父类方法
    public double cost() {
        double COSTOFPERKILOMETER=2.5;//每公里花费2.5
        return COSTOFPERKILOMETER*distance();//返回公交总花费
    }
    @Override//子类重写父类方法
    public double projectcost(String type){
        return 0;
    }
}

class Train implements A,B
{
    public static final int SPEED=130;
    @Override//子类重写父类方法
    public double distance() {
        double route=SPEED*HOUR;
        return route;
    }
    @Override//子类重写父类方法
    public double projectcost(String type){
        if(type.equals("儿童"))
            return 72.6;
        else if(type.equals("成人"))
            return 145.2;
        return 0;
    }
    @Override//子类重写父类方法
    public double cost() {
        return 0;
    }
}

class Plane implements A,B
{
    public static final int SPEED=315;
    @Override//子类重写父类方法
    public double distance() {
        double route=SPEED*HOUR;
        return route;
    }
    @Override//子类重写父类方法
    public double projectcost(String type){
        if(type.equals("经济舱"))//将字符串与指定字符比较
            return 1123.5;
        else if(type.equals("商务舱"))
            return 2315.5;
        return 0;
    }
    @Override//子类重写父类方法
    public double cost() {
        return 0;
    }
}
