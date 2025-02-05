
class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

class Test2 {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI Rate of Interset" + s.getRateOfInterest());
        System.out.println("ICICI Rate of interest:" + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interst :" + a.getRateOfInterest());

    }
}