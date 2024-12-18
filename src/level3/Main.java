package level3;

public class Main {
    public static void main(String[] args) {
        Boat boat = new Boat();

        Command startEngine = new StartEngine(boat);
        Command accelerate = new Accelerate(boat);
        Command brake = new Brake(boat);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.submit(startEngine);
        remoteControl.submit(accelerate);
        remoteControl.submit(brake);
    }
}
