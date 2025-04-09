
interface player{
    void play();
    void pause();
    void stop();
}
class MusicPlayer implements player{
    @Override
    public void play(){
        System.out.println("-------------Music is Playing------------");
    }
    @Override
    public void pause(){
        System.out.println("--------------Music is Paused--------------");
    }
    @Override
    public void stop(){
        System.out.println("---------------Music is Stopped-------------");
    }
}



public class TestPlayer {
    public static void main(String[] args) {
        MusicPlayer m1 =new MusicPlayer();
        m1.play();
        m1.pause();
        m1.stop();
    }
    
}
