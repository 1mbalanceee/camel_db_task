Apache Camel PostgreSQL Project

 Описание
Проект демонстрирует использование Apache Camel для подключения и чтения данных из базы данных PostgreSQL.

 Требования
- JDK 8 или выше
- Apache Maven
- PostgreSQL

Настройка
1. Создайте базу данных и таблицу:
    ```sql
    CREATE DATABASE camel_db;
    \c camel_db

    CREATE TABLE users (
        id SERIAL PRIMARY KEY,
        name VARCHAR(100),
        email VARCHAR(100)
    );

    INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com');
    ```

2. Клонируйте репозиторий:
    ```bash
    git clone <repository_url>
    cd camel-postgresql
    ```

3. Обновите настройки базы данных в файле `application.properties`.

## Сборка и запуск
1. Соберите проект:
    ```bash
    mvn clean install
    ```

2. Запустите проект:
    ```bash
    mvn exec:java -Dexec.mainClass="com.example.MainApp"
    ```

 Тестирование
Проверьте логи для подтверждения успешного чтения данных из базы данных.
