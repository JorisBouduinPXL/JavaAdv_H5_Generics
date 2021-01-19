package be.pxl.ja.demo6;

import java.util.List;

public class Experiment {
    public static <E> void firstFunction(List<E> list){
        list.add(list.get(0));
    }


}
