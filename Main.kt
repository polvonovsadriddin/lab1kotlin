import kotlin.random.Random
fun main() {
/*11.63. Дан массив. Определить количество неотрицательных элементов. */
    var rand=Random
    var kolvo:Int=0
    var mas= Array(Random.nextInt(10, 50))
    {Random.nextInt(10, 50)-30}
    for (i in 0 until mas.size){
        println(mas[i])
        if(mas[i]>0){kolvo++}
    }
    println("количество неотрицательных элементов:$kolvo")

    /* В двумерном массиве хранится информация о количестве студентов в той
или иной группе каждого курса института с первого по пятый (в первой
строке — информация о группах первого курса, во второй — второго и т. д.).
На каждом курсе имеется 8 групп. Определить среднее число студентов
в одной группе*/
    var matrix=Array(5){Array(8){0}}
var aver:Int=40
    var all:Int=0

 for ( i in 0 until 5 )
 {
     for ( j in 0 until 8 )
     {
         matrix[i][j]=rand.nextInt(15, 30)
         print("${matrix[i][j]} ")
         all+=matrix[i][j]
     }
     println()
 }
    println(all/aver)

}