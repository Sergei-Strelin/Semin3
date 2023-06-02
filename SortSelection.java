package Algorythm.HomeWork_002;

import java.util.Arrays;
import java.util.Random;


public class SortSelection {

    public static void main(String[] args) {
        int size = 10;
        NoteBook[] noteBooks = getNotebooks(size);
        NoteBook[] noteBooks1 = new NoteBook[size];
        System.arraycopy(noteBooks,0,noteBooks1,0,noteBooks.length);
        NoteBookComparator comp = new NoteBookComparator();

        SortVariable.MergeSort.sort(noteBooks1,comp);
        System.out.println(Arrays.toString(noteBooks1));

        //SortVariable.InsertionSort.sort(noteBooks,comp);
        //System.out.println(Arrays.toString(noteBooks));

    }


    private static NoteBook[] getNotebooks(int l){
        Random r = new Random();
        NoteBook[] noteBooks = new NoteBook[l];
        for (int i = 0; i < noteBooks.length; i++) {
            noteBooks[i] = new NoteBook.Builder()
                    .setPrice(InterfaceTerms.price[r.nextInt(0, InterfaceTerms.price.length-1)])
                    .setRam(InterfaceTerms.ram[r.nextInt(0, InterfaceTerms.ram.length-1)])
                    .setBrand(NoteBook.Brand.randomBrand())
                    .build();
        }
        return noteBooks;
    }

}