import java.util.*;

class BloodData {
    private String bloodtype;
    private String rhFactor;

    public BloodData() {
        bloodtype = "O";
        rhFactor = "+";
    }

    public void setBloodData(String bt, String rh) {
        this.bloodtype = bt;
        this.rhFactor = rh;
    }

    public String getBloodType() {
        return bloodtype;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BloodData bd = new BloodData();
        boolean run = true;
        while (run) {
            System.out.print("Enter a bloodtype: ");
            String input = sc.nextLine();

            System.out.print("Enter the Rhesus factor (+ or -): ");
            String input2 = sc.nextLine();

            if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B")
                    || input.equalsIgnoreCase("AB") || input.equalsIgnoreCase("O")) {
                if (input2.equals("+") || input2.equals("-")) {
                    bd.setBloodData(input, input2);
                    bd.display();
                    run = false;
                }
            } else {
                bd.display();
            }
        }
    }
}
