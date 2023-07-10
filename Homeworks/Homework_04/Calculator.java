package Homework_04;


import java.util.*;


class Calculator {
    
    private static File log;
    private static FileWriter fileWriter;
    private static Deque<Character> operationStack = new ArrayDeque<>();
    private static Deque<String> resultStack = new ArrayDeque<>();
    private static String lastResult;


    public static void main(String[] args) throws IOException {
        try {
            log = new File("C:\\Users\\user\\Desktop\\JAVA_COURSE\\Homeworks\\Homework_04\\log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log, true);
            Scanner scanner = new Scanner(System.in);
            boolean calc = true;
            while (calc){
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Введите операцию (+ - * /) или < для отмены операции\nили ! для завершения работы приложения: ");
                char op = scanner.next().charAt(0);
                if (op == '!'){
                    System.out.println("Завершение работы приложения.");
                    return;
                }
                int b = 0;
                if (op != '<'){
                    System.out.print("Введите второе число: ");
                    b = scanner.nextInt();
                }

                int res;
                switch (op) {
                    case '+':
                        res = add(a, b);
                        lastResult = "Результат операции: " + res;
                        resultStack.push(lastResult);
                        operationStack.push('+');
                        logStep(lastResult);
                        System.out.println(a + " + " + b + " = " + res);
                        break;
                    case '-':
                        res = minus(a, b);
                        lastResult = "Результат операции: " + res;
                        resultStack.push(lastResult);
                        operationStack.push('-');
                        logStep(lastResult);
                        System.out.println(a + " - " + b + " = " + res);
                        break;
                    case '*':
                        res = multi(a, b);
                        lastResult = "Результат операции: " + res;
                        resultStack.push(lastResult);
                        operationStack.push('*');
                        logStep(lastResult);
                        System.out.println(a + " * " + b + " = " + res);
                        break;
                    case '/':
                        res = divide(a, b);
                        lastResult = "Результат операции: " + res;
                        resultStack.push(lastResult);
                        operationStack.push('/');
                        logStep(lastResult);
                        System.out.println(a + " / " + b + " = " + res);
                        break;
                    case '<':
                        System.out.println("Предыдущая операция: " + resultStack.peekFirst());
                        operationStack.removeFirst();
                        resultStack.removeFirst();
                        break;
                    default:
                        logStep("Некорректная операция!");
                        System.out.println("Некорректная операция!");
                        break;
                }
            }
        }
        finally {
            fileWriter.close();
        }
    }

    private static int divide(int a, int b) {
        if (b != 0) return a / b;
        return -1;
    }

    private static int multi(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    public static void logStep(String note) throws IOException {
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
    }

}