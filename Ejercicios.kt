/*Algoritmo que solicite la edad de una persona, si la edad es menor a 18 indique es la persona
es menor de edad*/

fun main() {
println("Ingrese la edad:")
val edad = readLine()!!.toInt()
if (edad < 18) {
println("La persona es menor de edad")
}
println("La edad es: $edad")
}


/*Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales
y con esto calcule el promedio de notas, valide que si el estudiante saca un promedio mayor o igual a
3.5 entonces indique que el estudiante ganó la materia, de lo contrario indique que la perdió, 
el mensaje deberá mencionar el nombre y la materia del estudiante.*/

fun main() {
println("Ingrese su nombre:")
val nombre = readLine().toString()
println("Ingrese su materia:")
val materia = readLine().toString()
println("Ingrese la nota1:")
val nota1 = readLine()!!.toFloat()
println("Ingrese la nota2:")
val nota2 = readLine()!!.toFloat()
println("Ingrese la nota3:")
val nota3 = readLine()!!.toFloat()
val prom = (nota1 + nota2 + nota3) / 3
println("El promedio de notas es: $prom")
if (prom >= 3.5) {
println("El estudiante $nombre GANÓ la materia $materia")
} else {
println("El estudiante $nombre PERDIÓ la materia $materia")
}
}


/*  haga un algoritmo que calcule el promedio de 3 números y si el promedio es mayor a 3.5 
indique que gana la materia, si el promedio es mayor a 2 y menor o igual a 3.5 entonces indique
que puede recuperar  */

fun main() {
val num1 = 2.0
val num2 = 1.0
val num3 = 1.0
val prom = (num1 + num2 + num3) / 3
if (prom > 3.5) {
println("Gana la materia")
} else if (prom > 2) {
println("Puede recuperar")
} else {
println("Perdió la materia")
}
}


/*  Haga un algoritmo que solicite el ingreso de un número e indique el dia correspondiente, 
valide si el código no existe.*/

fun main(){
var dayNum=5
when (dayNum) {
1 -> println("Lunes")
2 -> println("Martes")
3 -> println("Miércoles")
4 -> println("Jueves")
5 -> println("Viernes")
6 -> println("Sábado")
7 -> println("Domingo")
else -> println("Día inválido")
}
}


/* Haga un algoritmo que solicite el nombre de n cantidad de personas e imprima un saludo, 
el usuario ingresará la cantidad de personas a validar. */

fun main() {
print("Ingrese la cantidad de personas a saludar: ")
val cantidadPersonas = readLine()!!.toInt()
var contador = 1
do {
print("Ingrese el nombre de la persona $contador: ")
val nombre = readLine()!!
println("Hola $nombre, ¡Bienvenido!")
contador++
} while (contador <= cantidadPersonas)
}


/*  Algoritmo que imprima los numeros pares del 1 al n. */

fun main(){
print("Ingrese un número: ")
val n = readLine()!!.toInt()
var i = 1
while (i <= n){
if (i % 2 == 0) {
println(i)
}
i++
}
}


/*  Cree un algoritmo que lea un número y determine si éste es divisible entre 11.  */

fun main() {
  print("ingrese la cantidad de numeros a processar:")
  val cantidad = readLine()!!.toInt()
  for (i in 1..cantidad){
    print("ingrese un numero:")
    val numero= readLine()!!.toInt()
    if(numero % 11 ==0){
    printLn("el numero $numero es divisible entre 11")
  }else {
    printLn("el numero $numero no es divisible entre 11")
  }
  }
}

