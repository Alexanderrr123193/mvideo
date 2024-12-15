# Проект автоматизации тестирования для сайта Mvideo

Проект по автоматизации тестирования для компании Mvideo с использованием инструментов Selenide, JUnit 5 и Allure.

## Содержание:
1. [Технологии и инструменты](#Технологии-и-инструменты)
2. [Примеры автоматизированных тест-кейсов](#Примеры-автоматизированных-тест-кейсов)
3. [Сборка в Jenkins](#Сборка-в-Jenkins)
4. [Запуск из терминала](#Запуск-из-терминала)
5. [Allure отчет](#Allure-отчет)
6. [Уведомление в Telegram](#Уведомление-в-Telegram)
7. [Видео запуска тестов в Selenoid](#Видео запуска тестов в Selenoid)

<a id="tools"></a>
## Технологии и инструменты:

| Java                                                                                                      | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         |  Jenkins                                                                                                        | Telegram                                                                                                            |                                                                                                          
|:----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  | <a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> |<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://web.telegram.org/"><img src="images\logo\Telegram.svg" width="50" height="50" alt="Telegram"/></a> |

<a id="cases"></a>



## Примеры автоматизированных тест-кейсов:
- Проверка отображения корзины на главной странице
- Проверка видимости номера телефона на главной странице
- Проверка видимости профиля на главной странице
- Проверка возможности входа на сайт
- Проверка доступности категории товаров на сайте

## Сборка в Jenkins
Проект настроен для сборки через Jenkins. Параметры сборки можно передавать через интерфейс Jenkins.

### Параметры сборки:
- `browser` — браузер для тестов (по умолчанию `chrome`)
- `browserVersion` — версия браузера (по умолчанию `126.0`)
- `browserSize` — размер окна браузера (по умолчанию `1920x1080`)
- `baseUrl` — адрес тестируемого веб-сайта
- `remoteUrl` — логин, пароль и адрес удаленного сервера Selenoid

### Команды для запуска из терминала
Локальный запуск:
```
gradle clean test
```
## <img width="4%" style="vertical-align:middle" id="telegramNotification" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram



<p align="center">
<img width="70%" title="Telegram Notifications" src="images/screen/tg.png">
</p>

## <img width="4%" style="vertical-align:middle" id="telegramNotification" title="Allure" src="images/logo/Allure.svg"> Отчет Allure

[Перейти к отчету Allure](https://jenkins.autotests.cloud/job/31_mvideo/allure/)

<p align="center">
<img width="70%" title="Telegram Notifications" src="images/screen/1.png">
</p>

## <img width="4%" style="vertical-align:middle" id="telegramNotification" title="Selenoid" src="images/logo/Selenoid.svg"> Видео запуска тестов в Selenoid

<p align="center">
  <img width="70%" src="images/screen/gif/test.gif" alt="Test Video GIF">
</p>
