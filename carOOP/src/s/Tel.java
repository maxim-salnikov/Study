package s;

public class Tel implements ITel{

    @Override
    public final void call(){
        System.out.println("Гудки....");
    }

    public void stop(){

    }

    protected void pause(){
        System.out.println("Минутка тишины");
    }
}
