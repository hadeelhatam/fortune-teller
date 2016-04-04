package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
         int WordCounter = name.split("\\s+").length;
         WordCounter += age;
         while (true) {
        	 if (WordCounter > 10)
        		 WordCounter -= 7;
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
        		counter -= 7;
        	else
        		break;
        }
        return counter;
    }

    public int calculateC() {
        int res = calculateA();
        res += calculateB();
        res -= height;
        while (true) {
          	 if (res < 0)
          		 res += 10;
          	 else
          		 break;
        }
        return res;
    }

    public int calculateD() {
        int res = calculateA();
        if (res > 5)
        	res += calculateB();
        else
        	res += calculateC();
        res -= income;
        while (true) {
         	 if (res < 0)
         		 res += 10;
         	 else
         		 break;
       }
        return res;
    }

    public int calculateE() {
        long res2 = age*income;
        	 res2 = res2*income;
        	 res2 = res2*height;
        double res3 = Math.sqrt(res2);
        while (true) {
        	 if (res3 >= 10)
        		 res3 = res3 / 2;
        	 else
        		 break; 
        }
        int res = (int) (Math.round(res3));
        if (res == 10)
        		res = 0;
        return res;
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
