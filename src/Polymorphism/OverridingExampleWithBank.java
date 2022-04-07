package Polymorphism;

public class OverridingExampleWithBank {

    int interestRate() {
        return 5;
    }
}


class ICICI extends OverridingExampleWithBank{
    int interestRate(){
        return 9;
    }
}

class HDFC extends OverridingExampleWithBank{
    int interestRate(){
        return 10;
    }
}

class SBI extends OverridingExampleWithBank{
    int interestRate(){
        return 12;
    }
}