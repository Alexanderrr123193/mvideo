
# <img width="25%" style="vertical-align:middle" title="Mvideo" src="images/logo/mvideo.png"> Проект автоматизации тестирования для сайта М.Видео

## **Содержание:**
____

- [Технологии и инструменты](#tools)
- [Примеры автоматизированных тест-кейсов](#cases)
- [Сборка в Jenkins](#jenkins)
- [Запуск из терминала](#console)
- [Allure отчет](#allure)
- [Уведомление в Telegram при помощи бота](#telegram)
- [Примеры видео выполнения тестов на Selenoid](#video)

____

<a id="tools"></a>

## 🛠️ Технологии и инструменты:

| **Java**                                                                                                      | **IntelliJ IDEA**                                                                                                | **GitHub**                                                                                                     | **JUnit 5**                                                                                                       | **Gradle**                                                                                                      | **Selenide**                                                                                                      | **Selenoid**                                                                                                         | **Allure Report**                                                                                                  | **Jenkins**                                                                                                          | **Telegram**                                                                                                          |
|:--------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java" /></a>         | <a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50" alt="IDEA" /></a> | <a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50" alt="Github" /></a>       | <a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50" alt="JUnit 5" /></a>   | <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50" alt="Gradle" /></a>        | <a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50" alt="Selenide" /></a>   | <a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50" alt="Selenoid" /></a> | <a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" width="50" height="50" alt="Allure" /></a> | <a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" /></a> | <a href="https://web.telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50" alt="Telegram" /></a> |

---

<a id="cases"></a>

## 🚀 Примеры автоматизированных тест-кейсов:

- **Проверка отображения корзины на главной странице**
- **Проверка видимости номера телефона на главной странице**
- **Проверка видимости профиля на главной странице**
- **Проверка возможности входа на сайт**
- **Проверка доступности категории товаров на сайте**

---

<a id="jenkins"></a>

## 🏗️ Сборка в Jenkins

Проект настроен для сборки через **Jenkins**. Параметры сборки можно передавать через интерфейс Jenkins.

### 📋 Параметры сборки:
- `browser` — браузер для тестов (по умолчанию `chrome`)
- `browserVersion` — версия браузера (по умолчанию `126.0`)
- `browserSize` — размер окна браузера (по умолчанию `1920x1080`)
- `baseUrl` — адрес тестируемого веб-сайта
- `remoteUrl` — логин, пароль и адрес удаленного сервера Selenoid

---

<a id="console"></a>

## 💻 Запуск из терминала

Локальный запуск:

```
gradle clean test

```
<a id="telegram"></a>

## 📲 Уведомления в Telegram
Для получения уведомлений в Telegram при успешном или неуспешном прохождении тестов, настроен бота и интегрирован с Jenkins.

<p align="center"> <img width="70%" title="Telegram Notifications" src="images/screen/tg.png"> </p>



<a id="allure"></a>

## 📊 Allure отчет
После завершения тестирования можно перейти к подробному отчету в Allure, где вы найдете информацию о каждом тесте, времени выполнения и многом другом.

[Перейти к отчету Allure](https://jenkins.autotests.cloud/job/31_mvideo/allure/)

<p align="center"> <img width="70%" title="Allure Report" src="images/screen/1.png"> </p>

<a id="video"></a>

## 🎥 Видео запуска тестов в Selenoid
Смотрите, как проходят тесты в реальном времени с помощью Selenoid. Видео дает полное представление о ходе тестирования, включая скриншоты с каждого шага.

<p align="center"> <img title="Selenoid Video" src="images/screen/gif/test.gif" width="550" height="350" alt="video"> </p>