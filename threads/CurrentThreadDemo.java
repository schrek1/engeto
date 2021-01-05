// Rizeni hlavniho vlakna programu.
class CurrentThreadDemo {
        public static void main(String args[]) {
                Thread t = Thread.currentThread();
                
                System.out.println("Aktualni vlakno: " + t);
                
                // zmena nazvu vlakna
                t.setName("Moje vlakno");
                System.out.println("Po zmene nazvu vlakna: " + t);
                
                try {
                        for(int n = 5; n > 0; n--) {
                                System.out.println(n);
                                Thread.sleep(1000);
                        }
                }
                
                catch (InterruptedException e) {
                        System.out.println("Hlavni vlakno preruseno.");
                }
        }
}
