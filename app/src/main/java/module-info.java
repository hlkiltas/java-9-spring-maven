module java9.spring.mvc {
    requires java.sql;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires users;
    requires admin;

    exports java9.spring.mvc;
}