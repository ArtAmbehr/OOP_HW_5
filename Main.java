import controller.UserController;
import model.Logger;
import model.LoggerImpl;
import model.CalcComplex;
import model.CalcRational;
import view.ViewUser;

public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl("calc.txt");
        CalcRational calcRational = new CalcRational(logger);
        CalcComplex calcComplex = new CalcComplex(logger);
        UserController controller = new UserController(calcRational, calcComplex);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}