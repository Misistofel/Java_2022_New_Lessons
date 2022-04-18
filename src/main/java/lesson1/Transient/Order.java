package lesson1.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/*У деяких класах іноді бувають такі поля, які обчислюються на основі інших полів або іншої інформації.
Обчислюються, так би мовити, на льоту.
Щоб навести приклад такого поля, уявимо собі замовлення в інтернет-магазині або в якомусь сервісі доставки їжі.
Кожне замовлення, крім іншої інформації, складається зі списку товарів та підсумкової вартості.
Вона, у свою чергу, складається із сумарної вартості кожного товару. Виходить,
що підсумкову вартість не варто ставити "руками": її потрібно обчислювати програмно, підсумовуючи вартість усіх товарів.
Подібні поля, які потрібно обчислювати програмно, не потрібно серіалізувати. Тому помічаємо їх модифікатором transient.
*/
class Order implements Serializable {

  private List items;
  private transient BigDecimal totalAmount; //обчислюється на ходу
  /*Також бувають деякі класи, що зберігають приватну інформацію. Приклад  password.
   Не слід допускати витоку такої інформації за межі JVM. Тому поля з подібними даними необхідно позначати модифікатором transient,
   якщо ви маєте намір серіалізувати такий клас.
  */

  /*Іноді клас містить поля - об'єкти інших класів, які не реалізують Serializable інтерфейс. Прикладом таких полів є логери,
  потоки введення-виводу, об'єкти, які зберігають з'єднання з базою даних та інші службові класи.

   /* Якщо спробувати серіалізувати об'єкт, який містить поля, що не серіалізуються, виникне помилка
   java.io.NotSerializableException. Щоб уникнути цього, всі поля, які не реалізують Serializable інтерфейс,
   необхідно помічати модифікатором transient.
    */

  /*Не потрібно серіалізувати поля, які не є частиною інформації про стан об'єкта.
  Але також сюди можна включити і всі інші поля, додані для дебага або виконання якоїсь службової функції,
  які не несуть інформації про стан об'єкта.
   */
}
