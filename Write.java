package hotelmanagement;

import java.io.*;

class Write {
    static void write(Holder hotel_ob) throws Exception {
        FileOutputStream fout = new FileOutputStream("backup");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(hotel_ob);
        oos.close();
        fout.close();
    }

    static Holder read() throws Exception {
        FileInputStream fin = new FileInputStream("backup");
        ObjectInputStream ois = new ObjectInputStream(fin);
        Holder h = (Holder) ois.readObject();
        ois.close();
        fin.close();
        return h;
    }
}
