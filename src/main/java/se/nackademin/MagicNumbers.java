package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int WordCounter = name.split().length;
        WordCounter += age;
        while (true) {
            if (WordCounter > 10)
                WordCounter = WordCounter - 7;
            else
                break;
        }
        return WordCounter;
    }

    public int calculateB() {
        int counter = location.length();
        counter += income;
        while (true) {
            if (counter >= 10)
                counter = counter - 7;
            else
                break;
        }
        return counter;
    }

    public int calculateC() {
        int res = calculateA();
        res += calculateB();
        res = res - height;
        boolean f = true;
        while (f) {
          	 if (res < 0)
                 res = res + 10;
             else
                 f = false;
        }
        return res;
    }

    public int calculateD() {
        int res = calculateA();
        if (res > 5)
            res += calculateB();
        else
            res += calculateC();
        res = res - income;
        while (true) {
            if (res < 0)
                res += 10;
            else
                break;
        }
        return res;
    }

    public int calculateE() {
        //TODO: calculate E
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
