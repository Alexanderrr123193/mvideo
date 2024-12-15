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
<a href="https://www.jetbrains.com/idea/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/selenium/selenium-original.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/docker/docker-original.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://www.jenkins.io/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jira/jira-original.svg" width="50" height="50"  alt="Jira"/></a>  
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
```

<a id="allure"></a>
## <img alt="Allure" height="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/allure/allure-original.svg" width="25"/> Allure [отчет](https://jenkins.autotests.cloud/job/C31-SerzhSH-java_17_axenix/13/allure/)

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/allure/allure-original.svg" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/allure/allure-original.svg" width="850">  
</p>

### *Графики*

<p align="center">  
<img title="Allure Graphics" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/allure/allure-original.svg" width="850">
<img title="Allure Graphics" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/allure/allure-original.svg" width="850">  
</p>

____

<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/telegram.png" width="550">  
</p>

____

<a id="video"></a>
## <img alt="Selenoid" height="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/selenoid/selenoid-original.svg" width="25"/> Примеры видео выполнения тестов на Selenoid

____

<p align="center">
<img title="Selenoid Video" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/selenoid/selenoid-original.svg" width="550" height="350"  alt="video">   
</p>
