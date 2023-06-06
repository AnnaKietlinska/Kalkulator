import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test
    @BeforeEach
    void check_if_add_method_return_positive_number() {

        Assertions.assertEquals(4, calculator.add(2, 2));
    }
    @Test
    void check_if_sub_method_return_positive_number() {
        Assertions.assertEquals(5,calculator.sub(10,5) );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void adding(int a, int b, int c){
        Assertions.assertEquals(c, calculator.add(a,b));
    }
    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(4,2,2),
                Arguments.of(10,5,5),
                Arguments.of(20,10,10),
                Arguments.of(30,15,15)
        );
    }
}
