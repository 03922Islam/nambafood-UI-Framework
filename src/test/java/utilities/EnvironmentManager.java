package utilities;

import java.util.Locale;

public class EnvironmentManager {

    public static String baseUrl;
    public static String userName;
    public static String password;

    public static void setUpEnvironment() {
        switch (ConfigReader.getProperty("environment").toLowerCase()) {
            case "dev":
                DEV();
                break;

            case "qa":
                QA();
                break;

            case "prod":
                PROD();
                break;
        }
    }

    private static void DEV() {

        baseUrl = "https://dev.nambafood.kg/";
        userName = "devUserName";
        password = "somePassword";
    }

    private static void QA() {

        baseUrl = "https://qa.nambafood.kg/";
        userName = "QAUserName";
        password = "somePassword";
    }

    private static void PROD() {

        baseUrl = "https://nambafood.kg/";
        userName = "ProdUserName";
        password = "somePassword";
    }
}
