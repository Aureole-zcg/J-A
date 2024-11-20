package zhangchenguang_experiment1;
public class zhangchenguang
{
    public static void main(String[] args)
    {
        Auto bustest=new Bus();//bustest为子类对象
        bustest.start();
        Bus BusTest=(Bus)bustest;//向下转型
        BusTest.getOn();
        System.out.println(BusTest.passenger);

        // Bus bus=new Bus();
        // System.out.println("Bus distance:"+bus.distance());
        // System.out.println("Bus cost:"+bus.cost());
        // Train train=new Train();
        // System.out.println("Train distance:"+train.distance());
        // System.out.println("Train cost for adult:"+train.content("成人"));
        // System.out.println("Train cost for child:"+train.content("儿童"));
        // Plane plane=new Plane();
        // System.out.println("Plane distance:"+plane.distance());
        // System.out.println("Plane cost for economy class:"+plane.content("经济舱"));
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
class Bus extends Auto
{
   int passenger=27;//乘客数
   void getOn(){
   System.out.println("乘客上车");}
   void getOff(){
   System.out.println("乘客下车");}
}
// interface A
// {
//     final double HOUR=10;
//     double distance();
// }
// interface B
// {
//     double cost();
//     double content(String type);//用来判断字符
// }
// class Bus implements A,B
// {
//     static final int SPEED=60;

//     @Override//子类重写父类方法
//     public double distance() {
//         double route=SPEED*HOUR;
//         return route;
//     }

//     @Override
//     public double cost() {
//         double COSTOFPERKILOMETER=2.5;//每公里花费2.5
//         return COSTOFPERKILOMETER*distance();//返回公交总花费
//     }
//     @Override
//     public double content(String type){
//         return 0;
//     }
// }
// class Train implements A,B
// {
//     static final int SPEED=130;

//     @Override
//     public double distance() {
//         double route=SPEED*HOUR;
//         return route;
//     }

//     @Override
//     public double content(String type){
//         if(type.equals("儿童"))
//             return 72.6;
//         else if(type.equals("成人"))
//             return 145.2;
//         return 0;
//     }
//     @Override
//     public double cost() {
//         return 0;
//     }
// }
// class Plane implements A,B
// {
//     static final int SPEED=315;
//     @Override
//     public double distance() {
//         double route=SPEED*HOUR;
//         return route;
//     }
//     @Override
//     public double content(String type){
//         if(type.equals("经济舱"))
//             return 1123.5;
//         else if(type.equals("商务舱"))
//             return 2315.5;
//         return 0;
//     }
//     @Override
//     public double cost() {
//         return 0;
//     }
// }
