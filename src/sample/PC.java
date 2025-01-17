package sample;

public class PC implements Electrical {
    private boolean powerOn;

    @Override
    public void power(){
        if(powerOn){
            powerOn=false;
            System.out.println("PCの電源が切れました");
        }
        if(!powerOn){
            System.out.println("システムを読み込んでいます");
            powerOn=true;
            System.out.println("電源が入りました");
        }
    }
    public boolean isPowerOn() {
        return powerOn;
    }
    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }


}
