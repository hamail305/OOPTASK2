class Time {
    int hr;
    int min;
    int seconds;
    Time() {
        hr = 0;
        min = 0;
        seconds = 0;
    }
    Time(int h, int m, int s) {
        if (h >= 0 && h <= 23)
            hr = h;
        else
            hr = 0;
        if (m >= 0 && m <= 59)
            min = m;
        else
            min = 0;
        if (s >= 0 && s <= 59)
            seconds = s;
        else
            seconds = 0;
    }
    void display() {
        System.out.println("Time = " + hr + ":" + min + ":" + seconds);
    }
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(10, 30, 45);
        t1.display();
        t2.display();
    }
}
