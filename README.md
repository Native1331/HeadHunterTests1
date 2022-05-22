# Проект по автоматизации тестирования для Head Hunter:handshake:
## <a target="_blank" href="https://spb.hh.ru/">Веб сайт Head Hunter</a>

![This is an image](design/pictures/hh.jpeg)

## :clipboard:: Содержание:

- <a href="#trophy-технологии-и-инструменты">Технологии и инструменты</a> 
- <a href="#heavy_check_mark-реализованные-проверки">Реализованные проверки</a>
- <a href="#clipboard_mark-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#computer-запуск-из-терминала">Запуск из терминала</a>
- <a href="#chart_with_downwards_trend-allure-отчет">Allure отчет</a>
- <a href="#bar_chart-интеграция-с-allure-testops">Интеграция с Allure TestOps</a>
- <a href="#chart_with_upwards_trend-интеграция-с-jira">Интеграция с Jira</a>
- <a href="#iphone-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#movie_camera-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :trophy:Технологии и инструменты
<p align="center">
 ![This is an image] (/Native1331/HeadHunterTests1/blob/master/design/icons/Intelij_IDEA.png)</br>
<img width="6%" title="IntelliJ IDEA" src="test/resources/icons/Intelij_IDEA.png">
<img width="6%" title="Java" src="/icons/Java.png">
<img width="6%" title="Selenide" src="test/resources/icons/Selenide.png>
<img width="6%" title="Selenoid" src="test/resources/icons/Selenoid.png">
<img width="6%" title="Allure Report" src="test/resources/icons/Allure_Report.png">
<img width="6%" title="Gradle" src="test/resources/icons/Gradle.png">
<img width="6%" title="JUnit5" src="test/resources/icons/JUnit5.png">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="/test/resources/icons/Jenkins.png">
<img width="6%" title="Telegram" src="/test/resources/icons/Telegram.png">
 <img width="6%" title="Allure TestOps" src="/test/resources/icons/AllureTestOps.png">                                                                       
</p>

## 	:heavy_check_mark: Реализованные проверки
Раздела "Сервисы для соискателей на главной странице
Выбора города (на примере Санкт-Петербурга)
Поиск вакансий Тестировщик"
Поиск вакансии "Тестировщик" в городе Санкт-Петербург
Поиск и переход на страницу статьи "Что такое сильные стороны и как их определить?"

## :clipboard: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/AUTO-1024/">Сборка в Jenkins</a>

![This is an image](design/pictures/jenkins.jpeg)


###  :clipboard: Параметры сборки в Jenkins:
Сборка в Jenkins

- browser (браузер, по умолчанию chrome)
- version (версия браузера, по умолчанию 99.0)
- size (размер окна браузера, по умолчанию 1920x1080)
- threads (количество потоков)
- необходимо добавить файл credentials.properties (содержащий в себе логины и пароли, пример в папке resources)

## :computer: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-Dsize=${BROWSER_SIZE}
```

## :chart_with_downwards_trend: Allure отчет
- ### Главный экран отчета

 ![This is an image](design/pictures/allureReport.jpeg)


- ### Страница с проведенными тестами

![This is an image](design/pictures/allureReport1.jpeg)

## :bar_chart: Интеграция с Allure TestOps
- ### Экран с результатами запуска тестов
                                                                            
![This is an image](design/pictures/allureTestOps.jpeg)

- ### Страница с тестами в TestOps

![This is an image](design/pictures/allureTestOps1.jpeg)
                                                                            
## :chart_with_upwards_trend:	 Интеграция с Jira
- ### Страница с задачей в Jira
                                                                                
 ![This is an image](design/pictures/jira.jpeg)


## 	:iphone: Отчет в Telegram

 ![This is an image](design/pictures/telegram.jpeg)


## :movie_camera: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео.Пример такого видео показан ниже:
 [https://github.com/Native1331/HeadHunterTests1/blob/master/design/video/video.mp4]


