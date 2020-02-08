public class HomeException2 extends HomeException{
    public static double checkEx(double s) throws CheckException{
        if(s == 10)
            throw new CheckException("Давай не будем делить на 10");
        return s;
    }

}
