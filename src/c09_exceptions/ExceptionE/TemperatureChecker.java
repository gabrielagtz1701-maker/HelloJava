package c09_exceptions.ExceptionE;

public class TemperatureChecker {

    public void check(int temp) throws InvalidRemperatureException {
        if (temp < -50 || temp > 50) {
            throw new InvalidRemperatureException(
                    "Temperature out of range: " + temp
            );
        }

        System.out.println("Temperature OK: " + temp);

    }
}
