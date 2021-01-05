package cz.engeto;

class MultiThreadDemo {
    public static void main(String args[]) {
        NewThread first = new NewThread("Jedna");// spusteni vlaken
        NewThread second = new NewThread("Dve");
        NewThread third = new NewThread("Tri");

//                try {
//                        // cekani na dokonceni behu ostatnich vlaken
//                        Thread.sleep(10000);
//                }
//
//                catch (InterruptedException e) {
//                        System.out.println("Beh hlavniho vlakna prerusen.");
//                }


        try {
            first.t.join();
            second.t.join();
            third.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Beh hlavniho vlakna ukoncen.");
    }
}
