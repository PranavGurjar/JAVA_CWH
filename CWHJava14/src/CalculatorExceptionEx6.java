class InvalidException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "Invalid! Cannot Add 8 and 9";
    }
}


class ZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by the Zero";
    }

    @Override
    public String getMessage() {
        return "Invalid! Cannot divide by the Zero";
    }
}



class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Max Input! Number Cannot be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "Invalid! Number Cannot be greater than 100000";
    }
}

class MaxMultyException extends Exception{
    @Override
    public String toString() {
        return "Max Input! Cant multiply by 70000";
    }

    @Override
    public String getMessage() {
        return "Invalid! Number Cant multiply by 70000";
    }
}




class CustomCalculator {
    double addition(double a, double b) throws InvalidException, MaxInputException{
        if (a>100000 || b>100000)
        {
            throw new MaxInputException();
        }
        if(a==8 || b==9 || a==9 || b==8)
        {
            throw new InvalidException();
        }
        return a+b;
    }
    double substract(double a, double b) throws MaxInputException{
        if (a>100000 || b>100000)
        {
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws MaxInputException, MaxMultyException{
        if (a>100000 || b>100000)
        {
            throw new MaxInputException();
        }else if (a>70000 || b>70000)
        {
            throw new MaxMultyException();
        }
        return a*b;
    }
    double division(double a, double b) throws ZeroException, MaxInputException{
        if (a>=100000 || b>=100000)
        {
            throw new MaxInputException();
        }
        if (b==0)
        {
            throw new ZeroException();
        }
        return a/b;
    }
}



public class CalculatorExceptionEx6 {
    public static void main(String[] args) throws InvalidException, ZeroException, MaxInputException, MaxMultyException{
        CustomCalculator cc = new CustomCalculator();
//        cc.addition(8,9);
//        cc.addition(9,8);
//        cc.addition(100010, 10);
//        cc.addition(10, 100010);
//        System.out.println(cc.addition(2,3));


//        cc.substract(100101, 10);
//        cc.substract(10, 101010);
//        System.out.println(cc.substract(8,3));


//        cc.multiply(100101, 10);
//        cc.multiply(10, 101010);
//        cc.multiply(70101, 10);
//        cc.multiply(10, 71010);
//        System.out.println(cc.multiply(2,3));


//        cc.division(100101, 10);
//        cc.division(10, 101010);
//        cc.division(4,0);
//        System.out.println(cc.division(33,3));


        System.out.println(cc.division(33,3));

    }
}
