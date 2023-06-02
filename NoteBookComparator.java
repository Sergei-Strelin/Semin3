package Algorythm.HomeWork_002;

import java.util.Comparator;


public class NoteBookComparator implements Comparator<NoteBook> {

    @Override
    public int compare(NoteBook o1, NoteBook o2) {
        int eprice = Double.compare(o1.getPrice(), o2.getPrice());
        int eram = Integer.compare(o2.getRam(), o1.getRam());
        int ebrand = (o1.getBrand().compareTo(o2.getBrand()));
        if (ebrand == 0 && eprice == 0 && eram == 0) return 0;
        if (eprice != 0) return eprice;
        if (eram != 0) return eram;
        return ebrand;
    }
}