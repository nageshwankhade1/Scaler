package com.company.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MergeIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> list = new ArrayList<>();

        list.add(new Interval(4,10));
        list.add(new Interval(1, 7));
        list.stream().sorted(Comparator.comparingInt(o -> o.start));
        Collections.sort(list, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start- o2.start;
            }
        });

        System.out.println(merge(list));
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        ArrayList<Interval> res = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            int s2 = intervals.get(i).start;
            int e2 = intervals.get(i).end;

            if(s2<=end){
                //merge
                end = Math.max(end, e2);
            }else{
                //not merge

                res.add(new Interval(start,end));
                start = s2;
                end = e2;
            }

            if(start<=e2){
                start = Math.min(start, s2);
            }else{
                //not merge

                res.add(new Interval(start,end));
                start = s2;
                end = e2;
            }
        }
        res.add(new Interval(start,end));
        return res;

    }
}
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
