//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //что такое массивы
    public static void main(String[] args) {
        //int[] weights = new int[12]; меняем на фигурные скобки и задаем значения элементов массива
        //задать значение элементов массива сразу во время его инициализации
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0}; //нули обозначают ненаступившие месяца, где мы не
        int[] weightsCopy = {91, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0}; //нули обозначают ненаступившие месяца, где мы не
        //
        //не знаем какой будет вес
        //разработчики java
        //вес по месяцам
        int januaryWeight = weights[0];
        //ctrl+shift+f10 start program
        System.out.println(januaryWeight);
        //shift+F10 restart program
// в пустых ячейках массива должен быть ноль по правилам Java
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
//в квадратные скобки можно ставить переменную
        System.out.println(weights[january]);

        // комбинация циклов и массивов.сравнение массивов
        // "12.fori"
        //можно не указывать размер массива самому, а сделать так, чтобы за нас это сделала автоматика.
        // for(int i = 0;i< 12;i++) для этого заменим значение 12 на weight.length (Java подставит размер массива)
        for (int i = 0; i < weights.length; i++) {
            // weigts[i].sout
            //.length- узнать свойства массива
            // программист тоже может делать переменные, значения которых нельзя поменять после инициализации
            //Массив- это объект, у объекта могут быть свойства, которые ведут себя как обычные переменные
            //чтобы воспользоваться свойством, нужно после переменной с массивом поставить точку и после точки

//работа с массивами.урок 2
//сравнение массивов

            //написать название свойства
            //массивы нельзя сравнивать с ==
            //если не писать после weightsCopy new, а поставить справа от оператора присваивания weights, то Java не скоприует массив
            //weigts в массив weigthsCopy, а просто скопирует в перменную weightsCopy тот адрес, который находится в weights, а
            //массив как был один так и останется один. И теперь код, который сравнивает две переменные weights и weightsCopy будет иметь смысл
            //он будет проверять ссылаются ли две эти переменные на один и тот же массив или нет

            //придется поочередно проверить что все элементы массива с одинаковыми индексами равны
            // воспользуемся любимыми циклами и новым приемом с помощью логической переменной boolean
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        //это как призумция невиновности. Пока не доказано обратное, мы считаем массивы равными
        //а теперь проведем следствие которое поможет подтвердить или опровергнуть обвинение
        //т.е попарно сравним все элементы массивов
        //! если массивы разной длины, они ТОЧНО не могут иметь одинакове содержимое.
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    //если элементы не равны, то можно смело сказать что и массивы не равны
                    arraysAreEqual = false;
                    break;
                }

            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        //принцип поиска максимального элемента в массиве : необходимо завести переменную и пройтись по всем элементам
        //массива. Если встретится элемент, который больше переменной, то его и нужно записать в переменную
        //если повторить эту процедуру для каждого элемента, то в переменной окажется автоматически максимум из весов,
        //которые есть в массиве
        int maxWeight = -1;
        for (int current : weights) {
            //вместо if напишем сразу условие
            //weights[i]>maxWeight.if
            if (current > maxWeight) {
                //если условие выполняется, мы должны записать значение текущего элемента в переменную maxWeight
                maxWeight = current;
                //почему выводится три значения вместо одного??
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            //распечатаем разницу между текущим и следующим месяцем
            //сначал распечатаем вес в текущем месяце, чтобы удедиться что с циклом все в порядке
            //напишем значение, которое мы хотим распечатать
            System.out.println(weights[i]);
            //чтобы программа распечатала не текущий вес, а его изменения в текущем месяце нужно просто в принтлн
            //вычесть из значения веса в следующем месяце его значение в текущем
            {
                System.out.println(weights[i + 1] - weights[i]);
            }

        }


    }
}








