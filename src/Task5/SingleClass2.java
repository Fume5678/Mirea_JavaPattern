package Task5;

public class SingleClass2 {
        private static final SingleClass2 INSTANCE = new SingleClass2();

        private SingleClass2() {}

        public static SingleClass2 getInstance() {
            return INSTANCE;
        }
}
