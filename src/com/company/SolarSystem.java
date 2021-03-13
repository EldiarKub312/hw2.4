package com.company;

public class SolarSystem<A extends Planets> implements Printable<A> {

    private A name;

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }

    @Override
    public void print(A a) {
        System.out.println("Назввание планеты: " + a.getClass().getSimpleName());
    }
}



class Mercury extends Planets {
    public Mercury(int number, int volume) {
        super(number, volume);
    }
}

class Venus extends Planets {
    public Venus(int number, int volume) {
        super(number, volume);
    }
}

class Earth extends Planets {
    public Earth(int number, int volume) {
        super(number, volume);
    }
}

class Mars extends Planets {
    public Mars(int number, int volume) {
        super(number, volume);
    }
}







