# language: ru
Функция: Квадрат
  Структура сценария: Создаем квадрат с положительной стороной
    Дано У нас есть <положительная сторона> квадрата
    Когда Мы создаем квадрат
    Тогда Мы получаем <периметр> периметр квадрата
    И Мы получаем <площадь> площадь квадрата
    Примеры:
      | положительная сторона | периметр | площадь |
      | 1 | 4 | 1 |
      | 0,5 | 2 | 0,25 |

  Структура сценария: Создаем квадрат с неположительной стороной
    Дано У нас есть <сторона> квадрата
    Когда Мы создаем квадрат
    Тогда Появляется <предупреждение> для квадрата
    Примеры:
      | сторона | предупреждение |
      | 0 | "Сторона квадрата не может быть меньше или равна нулю" |
      | -1 | "Сторона квадрата не может быть меньше или равна нулю" |