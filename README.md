# Модульное приложение spring
## Используемые технологии
- Gradle 7.5+ (иначе не будет работать spring boot gradle plugin)
- Java 19
- Spring Web (для микросервиса)
- Spring reactive web (для api gateway)
- Eureka Discovery Client, Eureka Discovery Server (деплой микросервисов)

## Как посмотреть

Установить необходимые зависимости

Запустить eureka-server

Запустить несколько инстансов eureka-client

Запустить api-gateway

Eureka dashboard: http://localhost:8081/

При переходе на http://localhost/test откроется тестовый контроллер с названием инстанса (в конфиге создан роут)