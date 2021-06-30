package com.haige.thinkinjava.iolearn;

import java.util.Comparator;

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // 比较文件名称
        String oo1 = o1.substring(o1.lastIndexOf(".") + 1);
        String oo2 = o2.substring(o2.lastIndexOf(".")+1);
        return oo1.compareTo(oo2);
    }

}

