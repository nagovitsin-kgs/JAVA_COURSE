package Seminars.Seminar_05;

public class Ex_02 {
    public static void main(String[] args) {
        Map<String, Integer> states = new HashMap<String, Integer>();
        states.put("I", 1);
        states.put("V", 5);
        states.put("X", 10);
        String n = "I I VI X";
        String[] mass = n.split(" ");
        for (int i = 0; i < mass.length; i++) {
            if (states.get(mass[i]) == null) {
                String[] n2 = mass[i].split("");
                int b = 0;
                for (int j = 0; j < n2.length; j++) {
                    if (states.get(n2[0]) > states.get(n2[1])) {
                        b += states.get(n2[j]);
                    } else {

                    }
                }
                System.out.println(b);
            } else {
                System.out.println(states.get(mass[i]));
            }

        }
    }
}
