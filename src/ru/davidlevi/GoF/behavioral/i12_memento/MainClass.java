package ru.davidlevi.GoF.behavioral.i12_memento;

/**
 * Паттерн Memento (Хранитель)
 * <p>
 * Применимость:
 * - необходимо сохранить снимок состояния объекта (или его части) для последующего восстановления
 * - прямой интерфейс получения состояния объекта раскрывает детали реализации и нарушает инкапсуляцию объекта
 * Участники:
 * - Originator — «Создатель»
 * - Caretaker — «Опекун»
 * - Memento — «Хранитель»
 */
public class MainClass {
    public static void main(String[] args) {
    /*
      Классический вариант: Шаблон Хранитель используется двумя объектами: «Создателем» (originator) и «Опекуном»
      (caretaker). «Создатель» — это объект, у которого есть внутреннее состояние. Объект «Опекун» может производить
      некоторые действия с «Создателем», но при этом необходимо иметь возможность откатить изменения. Для этого «Опекун»
      запрашивает у «Создателя» объект «Хранителя». Затем выполняет запланированное действие (или последовательность
      действий). Для выполнения отката «Создателя» к состоянию, которое предшествовало изменениям, «Опекун» возвращает
      объект «Хранителя» его «Создателю». «Хранитель» является непрозрачным (то есть таким, который не может или не
      должен изменяться «Опекуном»).

      Нестандартный вариант: Отличие данного варианта от классического заключено в более жёстком ограничении на доступ
      «Опекуна» к внутреннему состоянию «Создателя». В классическом варианте у «Опекуна» есть потенциальная возможность
      получить доступ к внутренним данным «Создателя» через «Хранителя», изменить состояние и установить его обратно
      «Создателю». В данном варианте «Опекун» обладает возможностью лишь восстановить состояние «Хранителя», вызвав
      Restore. Кроме всего прочего, «Опекуну» не требуется владеть связью на «Хранителя», чтобы восстановить его
      состояние. Это позволяет сохранять и восстанавливать состояние сложных иерархических или сетевых структур
      (состояния объектов и всех связей между ними) путём сбора снимков всех зарегистрированных объектов системы.
     */
        Originator originator = new Originator(); // создатель
        Caretaker caretaker = new Caretaker(); // опекун

        originator.setState("on"); // создатель меняет состояние на ВКЛ
        System.out.printf("State is %s%n", originator.getState());
        caretaker.setMemento(originator.saveState()); // создатель сохраняет состояние и передает его опекуну

        originator.setState("off"); // создатель меняет состояние на ОТКЛ
        System.out.printf("State is %s%n", originator.getState());

        originator.restoreState(caretaker.getMemento()); // создатель восстанавливает состояние - возвращает его от опекуна
        System.out.printf("State is %s%n", originator.getState());
    }
}