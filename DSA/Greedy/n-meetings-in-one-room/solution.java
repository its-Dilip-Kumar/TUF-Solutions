import java.util.*;

class Data {
    int starting, ending;
    public Data(int starting, int ending) {
        this.starting = starting;
        this.ending = ending;
    }
}

class Solution {
    public int maxMeetings(int[] start, int[] end) {
        int n = start.length;
        Data[] data = new Data[n];

        for (int i = 0; i < n; i++) {
            if (start[i] > end[i]) {
                data[i] = new Data(end[i], start[i]);
            } else {
                data[i] = new Data(start[i], end[i]);
            }
        }

        Arrays.sort(data, (a, b) -> Integer.compare(a.ending, b.ending));

        int count = 0;
        int freeTime = -1;

        for (int i = 0; i < n; i++) {
            if (data[i].starting > freeTime) {   // ✅ >
                count++;
                freeTime = data[i].ending;
            }
        }
        return count;
    }
}