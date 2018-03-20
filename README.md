# Payment Order
 
Программа работающая с базой банков, их клиентов, платежными поручениями. Реализовано отображение как по отдельности, так и списком, всех банков, клиентов, платежных поручений. Удаление, добавление банков, клиентов, платежных поручений.

## Начало работы

Чтобы запустить программу выполните следующую команду:

 ```shell
 mvn spring-boot:run
 ```
 Программа отвечает на http запросы.
 
 ```shell
 http://localhost:8889/ # prints "Ping, Banks, Clients, Payment Orders"
 ```
 
 При нажатии кнопок происходит вывод соответствующей информации.
 
 ## Разработка
 
 Чтобы продолжить разрабатывать данный проект:
 
 ```shell
 git clone https://github.com/pauzholis/Payment-Order
 cd Payment-Order/
 ```