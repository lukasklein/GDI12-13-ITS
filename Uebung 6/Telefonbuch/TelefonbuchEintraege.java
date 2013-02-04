package Telefonbuch;

import java.util.ArrayList;

public class TelefonbuchEintraege extends ArrayList<TelefonbuchEintrag> {

    public TelefonbuchEintraege() {
        super();
    }
    
    public TelefonbuchEintraege search(String q) {
        TelefonbuchEintraege temp = new TelefonbuchEintraege();

        int counter = 0;
        for(int i = 0; i < this.size(); i++) {
            TelefonbuchEintrag contact = this.get(i);

            if((contact.getVor() + " " + contact.getNach()).toLowerCase().contains(q.toLowerCase())) {
                temp.add(contact);
                counter++;
            }
        }
        return temp;
    }
}