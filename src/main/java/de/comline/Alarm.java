package de.comline;

import java.util.Set;

public class Alarm {
    private final String status;

    public static void raisePriority(Set<Alarm> alarms) {
        System.out.println("alarms found: " + alarms);
    }

    public Alarm(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
