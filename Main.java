public class Main {

    public static int wt;
    public static int tPhase;
    public static int fPhase;

    public static void main(String[] args) {
        wt = 168260271;
        Moons();
        System.out.println("worldTime = " + wt);
        displayDateTime();
        displayMoons();
        System.out.println();

        wt = 27364375;
        Moons();
        System.out.println("worldTime = " + wt);
        displayDateTime();
        displayMoons();
        System.out.println();

        wt = 67294091;
        Moons();
        System.out.println("worldTime = " + wt);
        displayDateTime();
        displayMoons();
        System.out.println();

    }

    public static void turn() {
        wt++;
        Moons();
    }

    public static void turn(int timeDelta) {
        wt += timeDelta;
    }

    public static void Moons() {
        tPhase = wt / 1440 % 9;
        fPhase = wt / 1440 % 14;
    }

    public static void displayDateTime() {
        System.out.printf("It is %d:%02d on day %d of the year %d.\n",Hour(),Minute(),Day()+1,Year()+1);
    }

    public static void displayMoons() {
        System.out.printf("Trammel is in day %d of its 9 day phase.\n",tPhase+1);
        System.out.printf("Felucca is in day %d of its 14 day phase.\n",fPhase+1);
    }

    public static int Hour() {
        return RawTime() / 60;
    }

    public static int Minute() {
        return RawTime() % 60;
    }

    public static int RawTime() {
        return wt - (Year()*365*1440) - (Day()*1440);
    }

    public static int Day() {
        return (wt - (Year()*365*1440)) / 1440;
    }

    public static int Year() {
        return wt/(365*1440);
    }
}
