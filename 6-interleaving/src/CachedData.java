public class CachedData {
    private boolean flag=false;

    public boolean isReady(){
        return flag;
    }
    public void toggleFlag(){
        flag=!flag;
    }
}
