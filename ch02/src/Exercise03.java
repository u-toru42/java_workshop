public class Exercise03 {
    public static void main(String[] args) {
        int speed = 75;
        int maxSpeed = 60;
        int speedForFine = 70;

        // 入れ子のif文
        if (speed >= maxSpeed) {
            System.out.println("You are over the speed limit");
        } else if (speed < maxSpeed) {
            System.out.println("You are eligible for a fine!");
        } else if (speed > speedForFine){
            System.out.println("You are eligible for a fine!");
        }
    }
}
