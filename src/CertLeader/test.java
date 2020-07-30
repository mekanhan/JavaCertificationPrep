package CertLeader;

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

