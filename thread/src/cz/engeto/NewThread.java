package cz.engeto;

class NewThread implements Runnable {
    Thread t;

    NewThread(String name) {
        // Vytvoreni druheho, noveho vlakna
        t = new Thread(this, name);
        t.start(); // Spusteni vlakna
    }

    // Toto je vstupni bod druheho vlakna.
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(Thread.currentThread() + ":" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Vlakno potomka (druhe vlakno) preruseno.");
        }

        System.out.println("Ukonceni behu vlakna potomka (druheho vlakna).");
    }
}
