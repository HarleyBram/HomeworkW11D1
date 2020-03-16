    public class Calculator {
        private int first;
        private int second;

        public Calculator(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int add(int first, int second) {
            return first + second;
        }

        public int subtract(int first, int second) {
            return first - second;
        }

        public int multiply(int first, int second) {
            return first * second;
        }

        public double divide(double first, double second) {
            return first / second;
        }
    }
}


