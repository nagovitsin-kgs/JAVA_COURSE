package Seminars.Seminar_05;

public class Ex_03 {
    public static void main(String[] args) {
        // римские полностью*
        Map<String, Integer> states = new HashMap<String, Integer>();
        states.put("I", 1);
        states.put("V", 5);
        states.put("X", 10);
        states.put("L", 50);
        String n = "I I VI XIX LXXIX X";
        String[] mass = n.split(" ");
        for (int i = 0; i < mass.length; i++) {
            if (states.get(mass[i]) == null) {
                String[] n2 = mass[i].split("");
                int b = states.get(n2[n2.length - 1]);
                for (int j = n2.length - 2; j >= 0; j--) {
                    if (states.get(n2[j]) >= states.get(n2[j + 1])) {
                        b += states.get(n2[j]);
                    } else {
                        b -= states.get(n2[j]);
                    }
                }
                System.out.println(b);
            } else {
                System.out.println(states.get(mass[i]));
            }

        }
    }
}
