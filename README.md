Переопределение методов

Перегрузка методов по имени аргументов в Java не совершается, так как не меняется 
сигнатура(тоесть остаются одинаковый набор типов )но можно изменив тип аргумента вызвать данный метод 

```
public static double OOPVectorLen(Point2D a, Point2D b){
return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
}
public static double OOPVectorLen(Point2D a, int b){
return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
} 
```

private, public идентификаторы доступа


