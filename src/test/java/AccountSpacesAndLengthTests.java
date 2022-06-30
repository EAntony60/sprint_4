import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountSpacesAndLengthTests {

    private String name;
    private boolean expected;

    public AccountSpacesAndLengthTests(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "test data: {0} - {1}")
    public static Object[][] getData() {
        return new Object[][]{
                {"Oleg", false},
                {"Ivan Ivanovich", true},
                {" OlegOlegovich", false},
                {"George Olegovich ", false},
                {"SergeyOlegovich ", false},
                {" Sergey Olegovich ", false},
                {"w", false},
                {"w1234567891234ewefe", false}
        };
    }

    @Test
    @DisplayName("Проверка соотвествию параметрам")
    public void AccountsCheckSpacesInName() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals("Получено некорректные данные клиента", expected, actual);
    }
}
