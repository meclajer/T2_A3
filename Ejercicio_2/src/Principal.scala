import scala.io.StdIn._

object Principal {
  def main(args: Array[String]): Unit = {

    ejercicio1()

    ejercicio3()

    ejercicio5()

    ejercicio7()

    ejercicio9()

  }

  def ejercicio1(): Unit ={
    // ===================================================== EJERCICIO 1 =====================================================
    print("\n\n\t ========== EJERCICIO 1 ========== \n\n")
    //Escriba un programa que permita crear una lista de palabras y que, a continuacion, pida una
    //palabra y diga cuantas veces aparece esa palabra en la lista

    //Estatica
    var palabras = List("hola","mundo","PC","Laptop","hola","mundo","PC","Laptop","hola","mundo","PC","Laptop");

    print("Incerte la palabra a buscar: ")
    var aBuscar = readLine()


    var contador:Int = 0
    for ( palabra <- palabras ){
      if (palabra.equalsIgnoreCase(aBuscar)){
        contador += 1
      }
    }

    print("\nLa palabra fue encontrada: "+contador+".\nCadena:\n")
    for ( palabra <- palabras ){
      print(palabra+" ")
    }
  }

  def ejercicio3(): Unit ={
    // ===================================================== EJERCICIO 3 =====================================================
    print("\n\n\t ========== EJERCICIO 3 ========== \n\n")
    /*
      Escriba un programa que permita crear una lista de palabras y que a continuacion, pida una
       palabra y elimine esa palabra de la lista
     */

    //Estatica
    var palabras = List("hola","mundo","PC","Laptop","hola","mundo","PC","Laptop","hola","mundo","PC","Laptop");

    print("Incerte la palabra a buscar: ")
    var aEliminar = readLine()

    var palabrasLimpias = palabras.filterNot(pal => pal.equalsIgnoreCase(aEliminar))

    print("\nCadena resultante: \n")
    for ( palabra <- palabrasLimpias ){
      print(palabra+" ")
    }
  }

  def ejercicio5(): Unit ={
    // ===================================================== EJERCICIO 5 =====================================================
    print("\n\n\t ========== EJERCICIO 5 ========== \n\n")
    /*
      Escriba un programa que permita crear dos lista de palabras y que a continuacion, escriba las
        Lista de palabras que aparescan en dos listas.
        Lista de palabras que aparescan en la primera lista, pero no en la segunda.
        Lista de palabras que aparescan en la segunda lista, pero no en la primera.
        Lista de palabras que aparescan en ambas listas.
      Nota: Para evitar las repeticiones, eprograma debera empezar por eliminar los elementos repetidos en cada lista
     */

    var listaUno = List("carro","tecla","lista","moto","avion","telefono","carcasa","casa","cuarto","salon")
    var listaDos = List("carro","tecla","lista","moto","avion","avion","carcasa","carcasa","trapeador","hola")

    //Limpiado de cadena
    listaUno = listaUno.distinct
    listaDos = listaDos.distinct

    //Palabras en ambas listas
    println("Interseccion, en ambas listas:")
    var listaEnLasDos = listaUno.intersect(listaDos)
    for (p <- listaEnLasDos){
      print(p+" ")
    }

    //Palabras en la lista 1
    println("\nPalabras solo en la lista 1: ")
    var soloEnLista1 = listaUno.diff(listaDos)
    for (p <- soloEnLista1){
      print(p+" ")
    }

    //Palabras en la lista 2
    println("\nPalabras solo en la lista 1: ")
    var soloEnLista2 = listaDos.diff(listaUno)
    for (p <- soloEnLista2){
      print(p+" ")
    }

    //Union de ambas
    println("\nPalabras solo en la lista 1: ")
    var listaUnion = listaDos.union(listaUno)
    listaUnion = listaUnion.distinct
    for (p <- listaUnion){
      print(p+" ")
    }
  }

  def ejercicio7(): Unit ={
    // ===================================================== EJERCICIO 7 =====================================================
    print("\n\n\t ========== EJERCICIO 7 ========== \n\n")
    /*
      Escribe una funcion llamada "obtenerPalindromas" que busque todas las palabras polindromas de
      una lista. Ejemplo de palabras inversas radar, oro, rajar, rallar, salas, etc.,
     */

    var palabrasPolindromas = List("radar", "oro", "rajar", "rallar", "salas", "carro", "pluma", "prueba")

    print("\nPalabras polindromas: \n")
    for (x <- palabrasPolindromas){
      if (x.equalsIgnoreCase(x.reverse)){
        print(x+" ")
      }
    }
  }

  def ejercicio9(): Unit ={
    // ===================================================== EJERCICIO 9 =====================================================
    print("\n\n\t ========== EJERCICIO 9 ========== \n\n")
    /*
      Dada una lista de numeros enteros, escribir una funcion que:
        a) Devuelva una lista con todos los que sean primos
        b) Devuelva la sumatoria y el promedio de los valores
        c) Devuelva una lista con el factorial de cada uno de esos numeros
     */

    var listaNumeros = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    var listaPrimos = List()
    var listaFactorial = List[Int]()
    var factorial = 1
    var sumatoria:Int = 0

    for (x <- listaNumeros){
      sumatoria += x
      for(num <- 1 to x){
        factorial = factorial * num
      }

      factorial = 1
    }

    print("\nSumatoria: "+sumatoria+" y promedio: "+(sumatoria/listaNumeros.length)+"\nFactoriales: \n")
    for (x <- listaNumeros){
      for(num <- 1 to x){
        factorial = factorial * num
      }
      print(factorial+" ")
      factorial = 1
    }
  }

}
