package ru.geekbrains.competition;
/* Разобраться с имеющимся кодом;
 Добавить класс Team, который будет содержать: название команды, массив из 4х участников
(т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации
о членах команды прошедших дистанцию, метод вывода информации обо всех членах
команды.
 Добавить класс Course (полоса препятствий), в котором будут находиться: массив
препятствий, метод который будет просить команду пройти всю полосу;
То есть в итоге должно быть что-то вроде:
public static void main(String[] args) {
Course c = new Course(...); // Создаем полосу препятствий
Team team = new Team(...); // Создаем первую команду
c.doIt(team); // Просим первую команду пройти полосу
team.showResults(); // Показываем результаты первой команды
*/

import obstacles.Cross;
import obstacles.Obstacle;
import obstacles.Wall;
import obstacles.Water;
import ru.geekbrains.competition.team.Competition;
import ru.geekbrains.competition.team.Team;

public class MainClass {
    public static void main(String[] args) {
        Team team1 = new Team("Апельсины", "Апельсинов ждет успех\n" + "Апельсины - лучше всех!");
        Team[] competition = {new Competition("Саша", 5000, 500, 5), new Competition("Миша", 3000, 300, 3)};
        Obstacle[] obstacles = {new Cross(3000), new Wall(5), new Water(100), new Cross(3000)};

       team1.Motto();

        for (Team a : competition) {
    for (Obstacle o : obstacles) {
        o.doIt(a);
        if(!a.isOnDistance()) break;
    }
}

for (Team a : competition) {
    if (a.isOnDistance()) {
        System.out.println(a.getName() + " - прошел дистанцию");
    } else {
        System.out.println(a.getName() + " - не прошел дистанцию");
    }
}
    }
}

