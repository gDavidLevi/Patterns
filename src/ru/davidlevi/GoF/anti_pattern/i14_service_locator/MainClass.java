package ru.davidlevi.GoF.anti_pattern.i14_service_locator;

/**
 * Паттерн Service locator (Локатор служб), Listener (слушатель)
 * <p>
 * Это шаблон проектирования, используемый в разработке программного обеспечения для инкапсуляции процессов,
 * связанных с получением какого-либо сервиса с сильным уровнем абстракции. Этот шаблон использует центральный
 * реестр, известный как «локатор сервисов», который по запросу возвращает информацию (как правило это объекты),
 * необходимую для выполнения определенной задачи[1]. Стоит заметить, что в некотором случае локатор служб
 * фактически является анти-шаблоном
 * Преимущества:
 * - «Локатор служб» может действовать как простой компоновщик времени выполнения. Это позволяет управлять кодом
 * программы во время выполнения без повторной компиляции приложения, а в некоторых случаях без необходимости
 * его перезапуска.
 * - Приложения могут оптимизировать себя во время выполнения путем выборочного добавления и удаления элементов из
 * локатора служб. Например, приложение может обнаружить, что у него есть лучшая библиотека для чтения доступных
 * изображений JPG, чем стандартная, и соответствующим образом изменить реестр.
 * - Компоненты приложения или библиотеки, используемые в приложении, могут быть полностью разделены. Единственная
 * связь между ними записывается в реестр.
 * <p>
 * Недостатки:
 * - Отношения между компонентами приложения, помещенные в реестр, скрывают зависимости частей программы (делают их неочевидными) и увеличивают сложность системы. Это затрудняет поиск ошибок в приложении и может сделать систему в целом менее надежной.
 * - Реестр должен быть уникальным, что может стать узким местом для одновременного запуска несколько копий приложения.
 * - Реестр может быть серьезной уязвимостью безопасности, поскольку он позволяет посторонним (в том числе злоумышленникам) вводить код в приложение.
 * - Реестр скрывает зависимости класса, вызывая ошибки во время выполнения (англ.)русск., а не ошибки времени компиляции, когда при отсутствии необходимых зависимостей компилятор информирует об ошибке.
 * - Реестр делает код более сложным для поддержания (против использования инъекции зависимостей), потому что становится неясным, когда вы вносите ошибочную запись в реестр или пропускаете необходимую запись.
 * - Реестр делает код более сложным для тестирования, поскольку все тесты должны взаимодействовать с одним и тем же глобальным классом локатора служб для установки поддельных зависимостей тестируемого класса. Однако это легко преодолеть, введя классы приложений с помощью одного интерфейса локатора служб.
 */
public class MainClass {
    public static void main(String[] args) {

    }
}
