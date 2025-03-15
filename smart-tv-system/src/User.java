public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        //TURN ON THE SMART TV
        smartTv.turnOn();
        System.out.println("Smart TV is on: " + smartTv.isOn);

        //CHANGE THE VOLUME
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();
        System.out.println("Now the volume is: " + smartTv.volume);

        //CHANGE THE CHANNEL
        smartTv.decreaseChannel();
        smartTv.decreaseChannel();  
        smartTv.decreaseChannel();
        smartTv.increaseChannel();
        System.out.println("Now the channel is: " + smartTv.channel);

        //SET AN ESPECIFIC VOLUME
        smartTv.setVolume(40);
        System.out.println("Current Volume: " + smartTv.volume);


        //SET AN ESPECIFIC CHANNEL
        smartTv.setChannel(10);
        System.out.println("Current Channel: " + smartTv.channel);

        //TURN OFF THE SMART TV
        smartTv.turnOff();
        System.out.println("Smart TV is on: " + smartTv.isOn);
    }
}