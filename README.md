
# java-project — MDI-приложение "Robots" на Java Swing

**java-project** — это учебное десктопное приложение с графическим интерфейсом, выполненное на Java с использованием библиотеки **Swing**. Программа демонстрирует реализацию интерфейса в стиле **MDI (Multiple Document Interface)**, а также обработку событий, логирование и визуальное представление объектов ("роботов").

## 📦 Описание

Приложение представляет собой симулятор, в котором объекты ("роботы") перемещаются по полю, а действия фиксируются в отдельном окне логов. Каждый робот отображается в своем рабочем окне, а вся система управляется из главного меню приложения.

## 🔧 Используемые технологии

- Java 8+
- Swing (GUI-библиотека)
- ООП: классы, интерфейсы, события
- Логирование событий через отдельные окна

## 📁 Структура проекта

```
src/
 └── gui/
     ├── RobotsProgram.java      # Точка входа
     ├── MainFrame.java          # Главное окно
     ├── GameWindow.java         # Окно с визуализацией поля
     └── LogWindow.java          # Окно для вывода логов
```

## 🚀 Как запустить

1. Убедитесь, что у вас установлен **JDK 8+**
2. Импортируйте проект в вашу среду разработки (например, IntelliJ IDEA или Eclipse)
3. Запустите файл:
   ```
   src/gui/RobotsProgram.java
   ```
   Это — точка входа (`main()`), которая откроет главное окно с вложенными MDI-компонентами.

## 💡 Функциональность

- Главное окно с меню
- Визуализация движения объектов по полю
- Логирование всех действий в отдельное окно
- Отрисовка UI с помощью Java Swing
- Демонстрация взаимодействия между окнами, событий и модели

## 🎓 Назначение проекта

Проект создан в учебных целях для отработки навыков:

- построения MDI-интерфейсов
- взаимодействия между окнами в приложении
- применения ООП и событийной модели в Java

Может быть использован как основа для сложных Java-приложений с несколькими окнами, например: редакторы, симуляторы, системы визуализации.

## 🧑‍💻 Автор

[Максим Агафонов (orelkrylatiy)](https://github.com/orelkrylatiy)
