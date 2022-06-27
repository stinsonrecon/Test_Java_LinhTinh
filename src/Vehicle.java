public class Vehicle {
    public interface STATUS {
        String MOVING_FORWARD = "MOVING_FORWARD";
        String TURN_LEFT = "TURN_LEFT";
        String TURN_RIGHT = "TURN_RIGHT";
        String MOVING_BACKWARD = "MOVING_BACKWARD";
        String STOP = "STOP";
    }

    private String name;
    private String color;
    private String status;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Vehicle setStatus(String command){
        switch (command){
            case "up":
                this.status = STATUS.MOVING_FORWARD;
                return this;
            case "left":
                this.status = STATUS.TURN_LEFT;
                return this;
            case "right":
                this.status = STATUS.TURN_RIGHT;
                return this;
            case "down":
                this.status = STATUS.MOVING_BACKWARD;
                return this;
            case "stop":
                this.status = STATUS.STOP;
                return this;
            default:
                return this;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
