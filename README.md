# Проект автоматизации тестирования для сайта Mvideo

Проект по автоматизации тестирования для компании Mvideo с использованием инструментов Selenide, JUnit 5 и Allure.

## Содержание:
1. [Технологии и инструменты](#Технологии-и-инструменты)
2. [Примеры автоматизированных тест-кейсов](#Примеры-автоматизированных-тест-кейсов)
3. [Сборка в Jenkins](#Сборка-в-Jenkins)
4. [Запуск из терминала](#Запуск-из-терминала)
5. [Allure отчет](#Allure-отчет)
6. [Уведомление в Telegram](#Уведомление-в-Telegram)
7. [Примеры видео выполнения тестов на Selenoid](#Примеры-видео-выполнения-тестов-на-Selenoid)

<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

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
```bash
gradle clean test
