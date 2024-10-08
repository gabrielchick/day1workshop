    package calc;

    import java.io.Console;

    public class Calculator {

        public static void main(String[] args) {

            //declare an accumulator
            float acc = 0;
            float value = 0;

            boolean stop = false;

            Console cons = System.console();

            while(!stop) {

                //Read a line and trim it
                String cmd = cons.readLine("CMD> ").trim();

                switch (cmd) {
                    // ADD 5 6 7 8
                    case "ADD":
                        cmd = cons.readLine("VAL> ").trim();
                        value = Float.parseFloat(cmd);
                        acc += value;
                        break;
                    
                    // SUB 5 6 7 8
                    case "SUB":
                    cmd = cons.readLine("VAL> ").trim();
                    value = Float.parseFloat(cmd);
                    acc -= value;
                    break;

                    // MYL 5 6 7 8
                    case "MUL":
                        cmd = cons.readLine("VAL> ").trim();
                        value = Float.parseFloat(cmd);
                        acc *= value;
                        break;
                    
                    //REMAIN SAME
                    case "DIV":
                    cmd = cons.readLine("VAL> ").trim();
                    value = Float.parseFloat(cmd);
                    acc /= value;
                    break;
                    
                    //initialises the accumulator to 0
                    case "INIT":
                        acc = 0f;
                        break;
                    
                    case "BRK":
                        stop = true;
                        break;

                    case "SHOW":
                        System.out.printf("> %3f\n", acc);
                        break;

                }
            }
        }
    }