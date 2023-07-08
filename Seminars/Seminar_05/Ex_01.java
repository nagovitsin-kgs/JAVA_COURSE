package Seminars.Seminar_05;

public class Ex_01 {

    public static void main(String[] args) {

        Map<String, Integer> states = new HashMap<String, Integer>();
        states.put("I", 1);
        states.put("V", 5);
        states.put("X", 10);
        String n = "I I V X";
        String[] mass = n.split(" ");
        for (int i = 0; i < mass.length; i++) {
            System.out.println(states.get(mass[i]));
        }
    }
}
